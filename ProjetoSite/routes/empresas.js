var express = require('express');
var router = express.Router();
var sequelize = require('../models').sequelize;
var Empresa = require('../models').Empresa;
var Endereco = require('../models').Endereco;
var Leitura = require('../models').Leitura;

let sessoes = [];
let totens = [];
var idEmpresa;

router.get('/ultimas', function (req, res, next) {



    const instrucaoSql = `select  
                        LeituraMemoria, 
	    				LeituraDisco, 
	 					LeituraCpu,
						
	    				TemperaturaCpu,
                        DataHora,
                        fkToten,
	    				FORMAT(DataHora,'HH:mm:ss') as momento_grafico 
						from Leitura order by idLeitura desc
						`;
    

    sequelize.query(instrucaoSql, {
        model: Leitura,
        mapToModel: true
    })
        .then(resultado => {
            console.log(`Encontrados: ${resultado.length}`);
            res.json(resultado);
        }).catch(erro => {
            console.error(erro);
            res.status(500).send(erro.message);
        });
});

router.get('/totens', function (req, res, next) {







    const instrucaoSql = `SELECT * FROM totens join empresa on empresa.idEmpresa = totens.fkEmpresa where idEmpresa = '${idEmpresa}'`;


    sequelize.query(instrucaoSql, {
        model: Empresa,
        mapToModel: true
    })
        .then(resultado => {
            console.log(`Encontrados: ${resultado.length}`);

            console.log(idEmpresa);

            console.log(totens);
            res.json(resultado);
        }).catch(erro => {
            console.error(erro);
            res.status(500).send(erro.message);
        });
});



// Recuperar usuário por login e senha
router.post('/autenticar', function (req, res, next) {
    console.log('Recuperando empresa por email e senha');

    var email = req.body.email;
    var senhaEmpresa = req.body.senha;

    var instrucaoSql = `select * from Empresa where Email='${email}' and Senha='${senhaEmpresa}'`;
    console.log(instrucaoSql);

    sequelize.query(instrucaoSql, {
        model: Empresa
    }).then(resultado => {
        console.log(`Encontrados: ${resultado.length}`);

        if (resultado.length == 1) {
            sessoes.push(resultado[0].dataValues.Email);
            idEmpresa = resultado[0].dataValues.idEmpresa;
            console.log('sessoes: ', sessoes[0]);
            res.json(resultado[0]);
        } else if (resultado.length == 0) {
            res.status(403).send('Email e/ou senha inváliddo(s)');
            
        } else {
            res.status(403).send('Mais de um usuário com o mesmo login e senha! ');
        }
    }).catch(erro => {
        console.error(erro);
        res.status(500).send(erro.message);
    
    });


    // console.log('Verificando totens cadastrados');
    // var selectTotens = `SELECT * FROM totens join empresa on empresa.idEmpresa = totens.fkEmpresa where Email='${email}' and Senha='${senhaEmpresa}'`

    // console.log(selectTotens);

    // sequelize.query(selectTotens,{
    // model: Empresa
    // }).then(qtdRegistros => {
    // console.log(`Encontrados: ${qtdRegistros.length}`);



    // res.status(200).json(qtdRegistros[0]);
    // });
});




/*Cadastrar Empresa*/

router.post('/cadastrar', function (req, res, next) {

    console.log('Cadastrando empresa');

    if (req.body.razaoSocial == '' || req.body.razaoSocial.length == 0 ||
        req.body.cnpj == '' || req.body.cnpj.length < 14 ||
        req.body.cepEmpresa == '' || req.body.cepEmpresa.length < 8 ||
        req.body.ruaEmpresa == '' ||
        req.body.numeroEmpresa == '' ||
        req.body.bairroEmpresa == '' || req.body.bairroEmpresa.length < 5 ||
        req.body.cidadeEmpresa == '' || req.body.cidadeEmpresa.length < 5 ||
        req.body.estadoEmpresa == '' || req.body.estadoEmpresa.length < 1 ||
        req.body.senhaEmpresa == '' || req.body.senhaEmpresa.length < 8) {
        console.log("Erro");
    } else {
        
            Endereco.create({
                //Informações de cadastro da tabela Endereco
                Cep: req.body.cepEmpresa,
                Rua: req.body.ruaEmpresa,
                Numero: req.body.numeroEmpresa,
                Bairro: req.body.bairroEmpresa,
                Cidade: req.body.cidadeEmpresa,
                Estado: req.body.estadoEmpresa,
                Complemento: req.body.complementoEmpresa,
				


            })
            /*.then(resultado => {
                console.log(`Endereço registrado:  ${resultado}`)
                        res.send(resultado);
                    }).cath(erro => {
                        console.error(erro);
                        res.status(500).send(erro.message);

                    });*/

            Empresa.create({
                //Informações de cadastro da tabela Empresa
                RazaoSocial: req.body.razaoSocial,
                Cnpj: req.body.cnpj,
                Email: req.body.email,
                SenhaEmpresa: req.body.senhaEmpresa,
                FkEndereco: 1,
				Token: req.body.token

            })

            /*.then(resultado => {
                console.log(`Empresa criada:  ${resultado}`)
                res.send(resultado);
            }).cath(erro => {
                console.error(erro);
                res.status(500).send(erro.message);
                
            });*/

            
        
        }
        
    })

/*Recuperando Senha*/
router.post('/recuperarsenha', function (req, res, next) {
var sqlTroca = `select * from Empresa WHERE Cnpj='${req.body.cnpj}' and Token='${req.body.token}';`;
	sequelize.query(sqlTroca, { model: Empresa }).then((resultado) => {
		console.log("results", resultado.length);
		if (resultado.length == 1) {
			if ((resultado[0].dataValues.Cnpj == req.body.cnpj) && (resultado[0].dataValues.Token == req.body.token)) {
				var atualizarSenha = `update Empresa set Senha='${req.body.senha}' where idEmpresa='${resultado[0].dataValues.idEmpresa}'`;
				sequelize.query(atualizarSenha, { model: Empresa }).then((sucesso) => {
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



module.exports = router;
