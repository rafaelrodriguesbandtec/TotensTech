#!/bin/bash
#execução no processo pai do linux


#Váriaveis locais
PURPLE='0;35'
NC='\033[0m' 
VERSAO=11
	
echo  "$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7) Olá, serei seu assistente para instalação do Java!"
echo  "$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7)  Verificando aqui se você possui o Java instalado..."
#echo serve para escrever uma mensagem no console
#$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7) - esse código ao redor do "Assistente TotensTech" severve unicamente para colorir a informação escrita
java -version
if [ $? -eq 0 ]

	#Caso o java esteja instalado, o script perguntará ao usuário se ele deseja abrir a aplicação
	then
	#then executa algo a partir da condição, 'faça'.
		echo "$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7) : Você já possui o java instalado na sua máquina!"
		echo "$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7) : Deseja abrir a aplicação TotensTech ? (S/N)"
		read inst
		#read inst serve para receber um valor
			if [ \"$inst\" == \"s\" ]
			then
			clear
			#clear limpa o console
			java -jar projeto-pi-1.0-SNAPSHOT-jar-with-dependencies
			#comando: "java -jar nomeArquivo.jar" inicia um executável java.
			else 
			echo "Fechando assitente... Até a próxima!"
			fi
			#fi encerra o if; else;


	else
		echo "$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7)  Opa! Não identifiquei nenhuma versão do Java instalado, mas sem problemas, irei resolver isso agora!"
		echo "$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7)  Deseja instalar o Java ? (S/N)"
	read inst
	if [ \"$inst\" == \"s\" ]
		then
			clear
			echo "$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7)  Ok! Você escolheu instalar o Java ;D"
			echo "$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7)  Adicionando ao computador!"
			sleep 2
			sudo add-apt-repository ppa:webupd8team/java -g
			 
			echo "$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7)  Atualizando! Quase lá..."
			sleep 2
			sudo apt-get update -y

			if [ $VERSAO -eq 11 ]
				then
					echo "$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7) Preparando para instalar a versão 11 do Java. Confirme a instalação quando solicitado ;D"
					sudo apt install default-jre ; sudo apt install openjdk-11-jre-headless; -g
					#instalação do JRE java; instalação do JDK; "-g" é global para todo o sistema, "-y" é para somente para o sistema!
					clear
					echo "$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7) Java instalado com sucesso!"
					
					
					echo "$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7) : Deseja abrir a aplicação TotensTech ? (S/N)"
					read inst
					if [ \"$inst\" == \"s\" ]
					then
					java -jar projeto-pi-1.0-SNAPSHOT-jar-with-dependencies
					else 
					echo "$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7) : Fechando assitente... Até a próxima!"
					fi

				fi
		else 	
		echo "$(tput setaf 6)[Assistente TotensTech]:$(tput setaf 7)  Você optou por não instalar o Java por enquanto, até a próxima então!"
	fi
fi

# ===================================================================
# Todos direitos reservados para o autor: Dra. Profa. Marise Miranda.
# Sob licença Creative Commons @2020
# Podera modificar e reproduzir para uso pessoal.
# Proibida a comercialização e a exclusão da autoria.
# ===================================================================
