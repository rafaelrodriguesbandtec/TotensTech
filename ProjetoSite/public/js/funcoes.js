


var razaoSocial;
var IdEmpresa;

  //está função coleta os dados para a dashboard

function carregarDados(param) {
  var controle = 0;
  document.getElementById(`discoDiv`).style = "color: white !important;";
  document.getElementById(`tempDiv`).style = "";
  document.getElementById(`memoriaDiv`).style = "";
  Chart.defaults.line.showLines = true;
  fetch('/empresas/ultimas', { cache: 'no-store' }).then(function (response) {
    if (response.ok) {
      let chart3 = new Chart(document.getElementById("myChart3"), {
        type: 'line',
        animation: { duration: 1500 },
        data: {

          labels: [],
          datasets: [

            {
              label: "Cpu",
              data: [],
              backgroundColor: ['rgba(54,162,235, 0.2)']
            },

            {
              label: "Memoria",
              data: [],
              backgroundColor: ['rgba(80,333,333, 0.2)']
            },
            {
              label: "Temperatura",
              data: [],
              backgroundColor: ['rgba(121,444,111, 0.2)']
            }

          ]

        },


        options: {

          events: ['click'],

          scales: {

            yAxes: [{


              ticks: {

                beginAtZero: true,
                suggestedMax: 50,
                max: 100,
                stepSize: 10

              }
            }

            ]

          }

        }


      }

      );
      let chart2 = new Chart(document.getElementById("myChart2"), {
        type: 'pie',
        data: {
          datasets: [{

            data: [],
            backgroundColor: ['rgba(217, 30, 24, 0.5)'],

          }],


          labels: [
            'Espaço em disco Usado',
            'Espaco em disco Disponivel',

          ]
        },
        options: {
          cutoutPercentage: 50,
          animation: true,
          animationRotate: true,
          animateScale: true,

          tooltips: {
            enabled: true,
            intersect: true,
            custom: true

          }





        }

      }

      );


      response.json().then(function (resposta) {

        resposta.reverse();
        chart2.update();
        chart3.update();

        
        for (i = 0; i < resposta.length; i++) {
          var registro = resposta[i];
          if (registro.fkToten == param && controle <= 4) {
            
            chart3.data.labels.push(registro.momento_grafico);
            chart3.data.datasets[0].data.push(registro.LeituraCpu.toFixed(2));
            chart3.data.datasets[1].data.push(registro.LeituraMemoria.toFixed(2));
            chart3.data.datasets[2].data.push(registro.TemperaturaCpu.toFixed(2));
            cpuDiv.innerHTML = `${registro.LeituraCpu.toFixed(0)}%`;
            memoriaDiv.innerHTML = `${registro.LeituraMemoria.toFixed(0)}%`;
           
            tempDiv.innerHTML = `${registro.TemperaturaCpu.toFixed(0)}°C`;
            if (registro.TemperaturaCpu > 75) {
              document.getElementById(`tempDiv`).style = "color: red !important;";
            }
            if (registro.LeituraMemoria > 75) {
              document.getElementById(`memoriaDiv`).style = "color: red !important;";
            }
            if (controle == 0) {
             
              var calcResto = (100 - registro.LeituraDisco).toFixed(2);
              chart2.data.datasets[0].data.push(registro.LeituraDisco.toFixed(2));
              chart2.data.datasets[0].data.push(calcResto);
              discoDiv.innerHTML = `${registro.LeituraDisco.toFixed(0)}%`;
           
              if (registro.LeituraDisco > 75) {
                document.getElementById(`discoDiv`).style = "color: red !important;";
              }
             
             
            }
            controle++;
          }

        }
        if (chart3.data.datasets[0].data.length == 0) {
          cpuDiv.innerHTML = `0`;
          memoriaDiv.innerHTML = `0`;
          discoDiv.innerHTML = `0`;
          tempDiv.innerHTML = `0`;
        }
        chart3.update();
        chart2.update();



      });
    } else {
      console.error('Nenhum dado encontrado ou erro na API');
    }
  })
    .catch(function (error) {
      console.error(`Erro na obtenção dos dados p/ gráfico: ${error.message}`);
    });
}


// Está função seta as cores nos cards de acordo com seu registro 
function plotarCards(parametro) {

  document.getElementById(`${parametro}Card`).style = "background-color: red !important";
  var indiceCard = 0;
  fetch('/empresas/ultimas', { cache: 'no-store' }).then(function (response) {
    if (response.ok) {


      response.json().then(function (resposta) {

        

        resposta.reverse();

        for (i = 0; i < resposta.length; i++) {
          var registro = resposta[i];
          if (registro.fkToten == parametro && indiceCard < 1) {
            if (registro.LeituraDisco > 75 || registro.LeituraMemoria > 75 || registro.TemperaturaCpu > 75) {
              document.getElementById(`${parametro}Card`).style = "background-color: red !important";

            }
            else if (registro.LeituraDisco < 65 && registro.TemperaturaCpu < 40 && registro.LeituraMemoria < 55) {
              document.getElementById(`${parametro}Card`).style = "background-color: green !important";
            }else {
              document.getElementById(`${parametro}Card`).style = "background-color: #ffc107 !important";
            }



            indiceCard++;
            break;
          }
        }




      });
    } else {
      console.error('Nenhum dado encontrado ou erro na API');
    }
  })
    .catch(function (error) {
      console.error(`Erro na obtenção dos dados p/ gráfico: ${error.message}`);
    });



}





//Está função faz carregar todas as maquinas da empresa que se logou  assim que ele loga
// na dashboard
function carregarMaquinas() {



  fetch('/empresas/totens', { cache: 'no-store' }).then(function (response) {
    if (response.ok) {
      response.json().then(function (resposta) {

        

        resposta.reverse();


        for (i = 0; i < resposta.length; i++) {
          var registro = resposta[i];

          var novaMaquina = `<li class="nav-item">
                <a onclick="puxarMaquina(${i})" href="#" class="nav-link active">
                  <i id='${registro.idTotens}' class="nav-icon far fa-circle text-info"></i>
                  <p id="${i}">${registro.Modelo}</p>
                </a>
              </li>`;
          newMaquina.innerHTML += novaMaquina;



          var novoCard = `<div class="col-lg-3 col-6">
          
          <div onclick='carregarDados(${registro.idTotens})' id="${registro.idTotens}Card" class="small-box bg-info">
            <div class="inner">
              <p>${registro.Modelo}</p>

              <small>${registro.Fabricante}</small>
            </div>
            <div class="icon">
              <i class="ion ion-stats-bars"></i>
            </div>

          </div>

        </div>`
          cardsM.innerHTML += novoCard;
          plotarCards(registro.idTotens);

        }
        for (i = 0; i < resposta.length; i++) {
          var registro = resposta[i];
          if (registro.Estado == "M") {
            document.getElementById(`${registro.idTotens}`).style = "color: #ffc107 !important";
          } else if (registro.Estado == "I") {
            document.getElementById(`${registro.idTotens}`).style = "color: #dc3545 !important";
          } else {
            document.getElementById(`${registro.idTotens}`).style = "color: #17a2b8 !important";
          }
        }

      });
    } else {
      console.error('Nenhum dado encontrado ou erro na API');
    }
  })
    .catch(function (error) {
      console.error(`Erro na obtenção dos dados p/ Totens: ${error.message}`);
    });

}


function puxarMaquina(params) {

  fetch('/empresas/totens', { cache: 'no-store' }).then(function (response) {
    if (response.ok) {
      response.json().then(function (resposta) {

        //console.log(`Dados recebidos: ${JSON.stringify(resposta)}`);

        resposta.reverse();




        for (i = 0; i < resposta.length; i++) {

          if (i == params) {
            var registro = resposta[i];



            fabricanteTotem.innerHTML = registro.Fabricante;
            modTotem.innerHTML = registro.Modelo;
            processadorTotem.innerHTML = registro.CpuToten;
            memoriaTotem.innerHTML = registro.Memoria;
            hdTotem.innerHTML = registro.EspacoEmDisco;
            






          }


        }





      });
    } else {
      console.error('Nenhum dado encontrado ou erro na API');
    }
  })
    .catch(function (error) {
      console.error(`Erro na obtenção dos dados p/ Totens: ${error.message}`);
    });

}

function redirecionar_home() {
  window.location.href = '../index.html';
}
function verificarAutenticacaoUsuario(){
  IdEmpresa = sessionStorage.IdEmpresa_meuapp;

  fkEmpresa.value = IdEmpresa;
}





function verificar_autenticacao() {
  razaoSocial = sessionStorage.razaoSocialApp; //localStorage.getItem('RazaoSocial');
  
  IdEmpresa = sessionStorage.IdEmpresa_meuapp;


  //Totem
  modeloTotem = localStorage.Modelo_meuapp;

  if (razaoSocial == undefined) {
    redirecionar_home();
  }

  else {

    nomeRazao.innerHTML = razaoSocial;
    fkEmpresa.value = IdEmpresa;
    totem1.innerHTML = modeloTotem;
    validar_sessao();
  }
}


function sair() {
  finalizar_sessao();
  localStorage.clear();
  redirecionar_home();
}

function validar_sessao() {
  fetch(`/empresas/sessao/${razaoSocial}`, { cache: 'no-store' })
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
  fetch(`/empresas/sair/${razaoSocial}`, { cache: 'no-store' });
}
