let razaoSocial;
let IdEmpresa;
let nivelAcesso;


function redirecionar_home() {
    window.location.href = '../index.html';
}
    
function verificar_autenticacao(){

    razaoSocial = sessionStorage.RazaoSocial_meuapp;
    IdEmpresa = sessionStorage.IdEmpresa_meuapp;   
    nivelAcesso = sessionStorage.nivelAcesso_meuapp;
    
    if (razaoSocial == undefined)  {

        redirecionar_home();

    } 
    
    else {
        
        nomeUsuario.innerHTML = razaoSocial;
        fkEmpresa.value = IdEmpresa;

        validar_sessao();
    }
    
    
}

function verificarAutenticacaoUsuario(){

    razaoSocial = sessionStorage.RazaoSocial_meuapp;
    IdEmpresa = sessionStorage.IdEmpresa_meuapp;   
    
    if (razaoSocial == undefined)  {

        redirecionar_home();

    } 
    
    else {

        fkEmpresa.value = IdEmpresa;

        validar_sessao();
    }
    
    
}

function sair() {
    finalizar_sessao();
    sessionStorage.clear();
    redirecionar_home();
}

function validar_sessao() {
    fetch(`/empresas/sessao/${razaoSocial}`, {cache:'no-store'})
    .then(resposta => {
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