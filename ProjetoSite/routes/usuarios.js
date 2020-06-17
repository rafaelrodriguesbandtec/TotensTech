var express = require('express');
var router = express.Router();
var sequelize = require('../models').sequelize;
var Usuario = require('../models').Usuario;

let sessoes = [];

/* Recuperar usuário por login e senha */
router.post('/autenticar', function (req, res, next) {
	console.log('Recuperando usuário por email e senha');

	var email = req.body.email; // depois de .body, use o nome (name) do campo em seu formulário de login
	var senha = req.body.senha; // depois de .body, use o nome (name) do campo em seu formulário de login	

	var instrucaoSql = `select * from usuario where Email='${email}' and Senha='${senha}'`;
	console.log(instrucaoSql);

	sequelize.query(instrucaoSql, {
		model: Usuario
	}).then(resultado => {
		console.log(`Encontrados: ${resultado.length}`);

		if (resultado.length == 1) {
			sessoes.push(resultado[0].dataValues.email);
			console.log('sessoes: ', sessoes);
			res.json(resultado[0]);
		} else if (resultado.length == 0) {
			res.status(403).send('Login e/ou senha inválido(s)');
		} else {
			res.status(403).send('Mais de um usuário com o mesmo login e senha!');
		}

	}).catch(erro => {
		console.error(erro);
		res.status(500).send(erro.message);
	});
});

/* Cadastrar usuário */
router.post('/cadastrar', function (req, res, next) {

	console.log('Criando um usuário');
	if (req.body.nome.length < 5 || req.body.nome == '' || req.body.login == '' || req.body.senha == '' || req.body.senha.length < 8
		|| req.body.email == '' || req.body.email.length < 8 || req.body.cpf == '' || req.body.cpf.length < 11) {
		console.log("Erro");
	} else {

		Usuario.create({

			Nome: req.body.nome,
			Cpf: req.body.cpf,
			LoginUsuario: req.body.email,
			Senha: req.body.senha,
			NivelAcesso:  req.body.nivelAcesso,
			FkEmpresa: req.body.fkEmpresa	

		}).then(resultado => {
			console.log(`Registro criado: ${resultado}`)
			res.send(resultado);
		}).catch(erro => {
			console.error(erro);
			res.status(500).send(erro.message);
		});
	}
});


/* Recuperação de senha */
router.get('/recuperacao', function (req, res, next) {
	var sqlTroca = `select*from Usuario
	 where email='${req.body.email}' and token='${req.body.token}'`;
	sequelize.query(sqlTroca, { model: Usuario }).then((resultado) => {
		console.log("results", resultado.length);
		if (resultado.length == 1) {
			if (resultado[0].dataValues.email == req.body.email && resultado[0].dataValues.token == req.body.token
				&& req.body.senha == req.body.confirmarSenha) {
				var atualizarSenha = `update cliente set SenhaUsuario='${req.body.senha}' where IdCliente='${resultado[0].dataValues.IdCliente}'`;
				sequelize.query(atualizarSenha, { model: Usuario }).then((sucesso) => {
					if(sucesso){
						console.log("Senha atualizada com sucesso");
						res.json(sucesso[0]);
					}

				}).catch((err)=>{
					res.status(500).send(err);
				})

			}else{
				res.status(500).send("Informações incorretas");

			}


		}else if(resultado.length==0){
			res.status(500).send("Não foi possivel achar o usuario");
		}else{
			res.status(500).send("erro");
		}

	}).catch((err)=>{
		res.status(500).send(err);
	})



});


/* Verificação de usuário */
router.get('/sessao/:login', function (req, res, next) {
	let login = req.params.login;
	console.log(`Verificando se o usuário ${login} tem sessão`);

	let tem_sessao = false;
	for (let u = 0; u < sessoes.length; u++) {
		if (sessoes[u] == login) {
			tem_sessao = true;
			break;
		}
	}

	if (tem_sessao) {
		let mensagem = `Usuário ${login} possui sessão ativa!`;
		console.log(mensagem);
		res.send(mensagem);
	} else {
		res.sendStatus(403);
	}

});


/* Logoff de usuário */
router.get('/sair/:login', function (req, res, next) {
	let login = req.params.login;
	console.log(`Finalizando a sessão do usuário ${login}`);
	let nova_sessoes = [];
	for (let i = 0; i < sessoes.length; i++) {
		if (sessoes[i] != login) {
			nova_sessoes.push(sessoes[i]);
		}
	}
	sessoes = nova_sessoes;
	res.send(`Sessão do usuário ${login} finalizada com sucesso!`);
});


/* Recuperar todos os usuários */
// router.get('/', function (req, res, next) {
// 	console.log('Recuperando todos os usuários');
// 	Usuario.findAndCountAll().then(resultado => {
// 		console.log(`${resultadossqsq.count} registros`);

// 		res.json(resultado.rows);
// 	}).catch(erro => {
// 		console.error(erro);
// 		res.status(500).send(erro.message);
// 	});
// });

module.exports = router;
