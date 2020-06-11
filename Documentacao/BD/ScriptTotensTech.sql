create table Endereco (
idEndereco int primary key identity(1,1) NOT NULL,
Cep varchar(8) NOT NULL,
Rua varchar(45) NOT NULL,
Numero Int NOT NULL,
Bairro varchar(30) NOT NULL,
Cidade varchar(30) NOT NULL,
Estado varchar(2) NOT NULL,
Complemento varchar(15) NOT NULL
);

create table Empresa (
idEmpresa int primary key identity(1,1) NOT NULL,
RazaoSocial varchar(30) NOT NULL,
Cnpj varchar(14) unique NOT NULL,
Email varchar(45) NOT NULL,
Senha varchar(18) NOT NULL,
fkEndereco int NOT NULL,
Foreign key (fkEndereco) references Endereco(idEndereco)
);

create table Usuario(
idUsuario int primary key identity(1,1) NOT NULL,
Nome varchar(60) NOT NULL,
Cpf varchar(11) NOT NULL,
Email varchar (45) NOT NULL,
Senha varchar(18) NOT NULL,
NivelAcesso int NOT NULL,
Token varchar(30),
fkEmpresa int NOT NULL,
Foreign key (fkEmpresa) references Empresa(idEmpresa)
);

create table Totens(
idTotens int primary key identity (1,1) NOT NULL,
Fabricante varchar(40) NOT NULL,
Modelo varchar(30) NOT NULL,
Memoria Float NOT NULL,
CpuToten varchar (30) NOT NULL,
EspacoEmDisco Float NOT NULL,
fkEmpresa int NOT NULL,
Foreign key (fkEmpresa) references Empresa(idEmpresa)
);

create table Leitura(
idLeitura int primary key identity(1,1),
DataHora datetime NOT NULL,
LeituraMemoria float,
LeituraDisco float,
LeituraCpu float,
TemperaturaCpu float,
fkToten int NOT NULL,
Foreign key (fkToten) references Totens(idTotens)
);