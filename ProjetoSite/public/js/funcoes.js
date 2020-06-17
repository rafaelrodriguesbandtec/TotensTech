let razaoSocial;
let IdEmpresa;

var seq= require('../../models').sequelize;


//Totem
let modeloTotem;

IdEmpresa= sessionStorage.IdEmpresa_meuapp;
razaoSocial =  sessionStorage.razaoSocialApp;


function redirecionar_home() {
    window.location.href = '../index.html';
}


function escreverTotens(){

    var selectTotens = `SELECT * FROM totens join empresa on empresa.idEmpresa = totens.fkEmpresa where idEmpresa = ${IdEmpresa}'`

    console.log(selectTotens);

    seq.query(selectTotens,{
    model: Empresa
    }).then(qtdRegistros => {
    console.log(`Encontrados: ${qtdRegistros.length}`);

    console.log('------Modelo: ',qtdRegistros[0].dataValues.Modelo);
    console.log('------Modelo: ',qtdRegistros[1].dataValues.Modelo);

    for(var i=0;i<qtdRegistros.length;i++){

        localStorage.setItem(`Modelo${i}`, qtdRegistros[i].dataValues.Modelo);
        modelo = qtdRegistros[i].dataValues.Modelo;
        cpuToten=qtdRegistros[i].dataValues.cpuToten;
    }
    
    console.log('-----Join empresa e totens--------', JSON.stringify(qtdRegistros))


    

    console.log(qtdRegistros[0]);

    res.status(200).json(qtdRegistros[0]);
    });


}

    
function verificar_autenticacao(){
    razaoSocial =  sessionStorage.razaoSocialApp; //localStorage.getItem('RazaoSocial');
    
    IdEmpresa = sessionStorage.IdEmpresa_meuapp; 
    escreverTotens();
    
    //Totem
    modeloTotem = localStorage.Modelo_meuapp;
   
    if (razaoSocial == undefined)  {
        redirecionar_home();
    } 
    
    else {
        //fkEmpresa.value = IdEmpresa;
        nomeUsuario.innerHTML = razaoSocial;
        //Totem
        totem1.innerHTML = modeloTotem;
        validar_sessao();
    }
}

function verificarAutenticacaoUsuario(){

    /*razaoSocial = localStorage.getItem('RazaoSocial');
    IdEmpresa = sessionStorage.IdEmpresa_meuapp;   
    
    if (razaoSocial == undefined)  {

        redirecionar_home();

    } 
    
    else {

        fkEmpresa.value = IdEmpresa;

        validar_sessao();
    }*/
}

function sair() {
    finalizar_sessao();
    localStorage.clear();
    redirecionar_home();
}

function validar_sessao() {
    fetch(`/empresas/sessao/${razaoSocial}`, {cache:'no-store'})
    .then(resposta => {
        
        console.log('-------',resposta)

        if (resposta.ok) {
            resposta.text().then(texto => {
                console.log('Sessão :) ', texto);    
            });
        } else {
            console.log('Sessão :.( ', texto);
            sair();
        } 
    });    
}

function finalizar_sessao() {
    fetch(`/empresas/sair/${razaoSocial}`, {cache:'no-store'}); 
}