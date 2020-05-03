create database TotensTech;

use TotensTech;

create table Endereco
(
IdEndereco int primary key identity(1,1),
Cep varchar(8) not null,
Rua varchar(45) not null,
Numero int not null,
Bairro varchar(30) not null,
Cidade varchar(30) not null,
Estado varchar(2) not null,
Complemento varchar(15),
);


create table Empresa
(
IdEmpresa int primary key identity(1,1),
RazaoSocial varchar(30) not null,
Cnpj bigint unique not null,
FkEndereco int not null,
foreign key (FkEndereco) references  Endereco(IdEndereco)
);

create table Usuario
(
IdUsuario int primary key identity(1,1),
Nome varchar(45) not null,
Cpf bigint unique not null,
LoginUsuario varchar(45) not null,
SenhaUsuario varchar(18) not null,
NivelAcesso int not null,
FkEmpresa int not null,
Foreign key (FkEmpresa) references Empresa(IdEmpresa)
);


create table Totem
(
IdTotem int primary key identity(1,1),
Fabricante varchar(30) not null,
Modelo varchar(30) not null,
FkEmpresa int not null,
foreign key (FkEmpresa) references Empresa(IdEmpresa)
);

create table Leitura
(
IdLeitura int primary key identity (1,1),
DataHora datetime not null,
LeituraMemoria float not null,
UsoDaMemoria float not null,
LeituraDisco float not null,
UsoDeDisco float not null,
LeituraCpu float not null,
TemperaturaCpu float not null,
FkTotem int not null,
Foreign key (FkTotem) references Totem(IdTotem)
);

create table Componente
(
IdComponente int primary key identity (1,1),
Modelo varchar(30) not null,
Fabricante varchar(30) not null,
NumeroSerial varchar(40) not null,
FkTotem int not null,
Foreign key (FkTotem) references Totem(IdTotem)
);

insert into Endereco(Cep, Rua, Numero, Bairro, Cidade, Estado, Complemento)
values
('00235160','Caetano Souza Filho', 541 , 'Patriarcas','São Paulo','SP',null),
('00235170','Alice Galvão', 12 , 'Videiras','São Paulo','SP',null),
('00235180','João Guilar', 458 , 'Jardim do Sul','Caieiras','SP',null)
;

insert into Empresa (RazaoSocial, Cnpj, FkEndereco)
values
('tecnico',99999999999999,2),
('analista',7777777777777,1),
('analista',8888888888888,3)
;

insert into Usuario (Nome, Cpf, LoginUsuario, Senha, NivelAcesso, FkEmpresa)
values
('Amanda Biagi',15654879820,'amanda@biagi','minhasenha',1,1),
('Petrick',45894849888,'petrick@asus','bipbop',1,2),
('Cleyton Silva',78954689845,'cleyton@silva','12345678',2,3)
;

select * from Usuario;
select * from Empresa;
select * from Endereco;

