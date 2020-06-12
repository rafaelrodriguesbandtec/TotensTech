var express = require('express');
var router = express.Router();
var sequelize = require('../models').sequelize;
var Empresa = require('../models').Empresa;
let sessoes = [];

// Recuperar usuário por login e senha
router.post('/autenticar', function(req, res, next){
            console.log('Recuperando usuário por email e senha');

            var email = req.body.cnpj;
            var senha = req.body.senhaEmpresa;

            let instrucaoSql = `select * from Empresa where Cnpj='${cnpj}' and senhaEmpresa='${senhaEmpresa}'`;
            console.log(ibstrucaoSql);

            sequelize.query(instrucaoSql,{
                model: Empresa
            }).then(resultado => {
                console.log(`Encontrados: ${resultado.length}`);

                if (resultado.length == 1){
                    sessoes.push(resultado[0]..dataValues.loggin);
                    console.log('sessoes: ', sessoes);;
                    res.json(resultado[0]);                    
                } else if (resultado.length == 0){
                    res.status(403).send('Cnpj e/ou senha inváliddo(s)');
                } else{
                    res.status(403).send('Mais de um usuário com o mesmo login e senha! ');
                }
            }).catch(erro => {
                console.error(erro);
                res.status(500).send(erro.message);
            });
        });

        /*Cadastrar Empresa*/

        router.post('/cadastrar' , function (req, res, next){
            console.log('Cadastrando empresa');
            if (req.body.razaoSocial == '' || req.body.razaoSocial.length == 0 ||
                req.body.cnpj == '' || req.body.cnpj.length < 14 ||
                req.body.cepEmpresa == '' || req.body.cepEmpresa.length < 8 ||
                req.body.ruaEmpresa == '' || 
                req.body.numeroEmpresa == '' || 
                req.body.bairroEmpresa == '' || req.body.bairroEmpresa.length < 5 || 
                req.body.cidadeEmpresa == '' || req.body.cidadeEmpresa.length < 5 ||
                req.body.estadoEmpresa == '' || req.body.estadoEmpresa.length < 2 ||
                req.body.senhaEmpresa == '' || req.body.senhaEmpresa.length < 8) {
                    console.log("Erro");
                }else {
                    Empresa.create({

                        RazaoSocia: req.body.razaoSocial,
                        Cnpj: req.body.cnpj,
                        Cep: req.body.cepEmpresa,
                        Rua: req.body.ruaEmpresa, 
                        Numero: req.body.numeroEmpresa,
                        Bairro: req.body.bairroEmpresa,
                        Cidade: req.body.cidadeEmpresa,
                        Estado: req.body.estadoEmpresa,
                        Complemento: req.body.complementoEmpresa, 
                        Senha: req.body.senhaEmpresa,
                        FkEndereco:2

                    }).then(resultado => {
                        console.log(`Registro criado:  ${resultado}`)
                        res.send(resultado);
                    }).cath(erro => {
                        console.error(erro);
                        res.status(500).send(erro.message);

                    });
                }              
        })

        /*Recuperando Senha*/
        router.get('/recuperacao', function (req,res, next){
            var sqlTroca = `select * from Empresa where Cnpj='${req.body.cnpj}' and token '${req.body.token}'`;
            sequelize.query(sqlTroca, { model: Empresa}).then((resultado) => {
                if(resultado.length == 1 ){
                  if(resultado[0].dataValues.cnpj == req.body.cnpj &&
                    resultado[0].dataValues.token == req.body.token &&
                    req.body.senhaEmpresa == req.body.cSenhaEmpresa){
                    var atualizarSenha = `update Empresa set senhaEmpresa = '${req.body.snehaEmpresa}' where IdEmpresa = '${resultado[0].dataValues.IdEmpresa}'`    
                    }  
                }
            })
        })

            
