create database TotensTech;

use TotensTech;

create table Endereco
(
IdEndereco int primary key auto_increment,
Cep varchar(8),
Rua varchar(45) not null,
Numero int not null,
Bairro varchar(30) not null,
Cidade varchar(30) not null,
Estado varchar(2) not null,
Complemento varchar(15)
);


create table Empresa
(
IdEmpresa int primary key auto_increment,
RazaoSocial varchar(45) not null,
Cnpj bigint unique not null,
FkEndereco int,
foreign key (FkEndereco) references  Endereco(IdEndereco)
);

create table Usuario
(
IdUsuario int primary key auto_increment,
Nome varchar(45) not null,
Cpf bigint unique not null,
LoginUsuario varchar(45) not null,
Senha varchar(18) not null,
NivelAcesso int not null,
FkEmpresa int,
Foreign key (FkEmpresa) references Empresa(IdEmpresa)
);


create table Totem
(
IdTotem int primary key auto_increment,
Fabricante varchar(30) not null,
Modelo varchar(30) not null,
FkEmpresa int,
foreign key (FkEmpresa) references Empresa(IdEmpresa)
);

create table Leitura
(
IdLeitura int primary key auto_increment,
DataHora datetime,
LeituraMemoria float,
LeituraDisco float,
LeituraCpu float,
FkTotem int,
Foreign key (FkTotem) references Totem(IdTotem)
);

create table Componente
(
IdComponente int primary key auto_increment,
Modelo varchar(30),
Fabricante varchar(30),
Serial varchar(45),
FkTotem int,
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

