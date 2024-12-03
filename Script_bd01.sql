Use Dbteste;

create table Usuario 
(
Id_usuario char(36) not null primary key,
Nome varchar(50) not null,
Data_cadastro datetime  not null default CURRENT_TIMESTAMP,
Nivel_acesso int not null,
Email varchar(100) unique /*  garantir que so ocorra um cadastro de email Caio@gmail.com */
);




create table Arquivos 
(
 Id_arquivos char(36) primary key not null,
 Cadastro_por char(36) not null,
 foreign key (Cadastro_por) references Usuario(Id_usuario) ON DELETE CASCADE ON UPDATE CASCADE,
 Nome varchar(50) not null,
 Tipo varchar (30) not null,
 Conteudo Longblob  not null,
 updated_at datetime default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
 Data_upload Datetime not null

);


create table Comentarios 
(
Id_Comentarios char(36) not null primary key,
Id_usuario char(36) not null,
foreign key (Id_usuario) references Usuario (Id_usuario) ON DELETE CASCADE ON UPDATE CASCADE,
Id_arquivos char(36) not null,
foreign key (Id_arquivos) references Arquivos(Id_arquivos) ON DELETE CASCADE ON UPDATE CASCADE,
Mensagens varchar(300) ,
updated_at datetime default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
Data_comentario datetime  not null default CURRENT_TIMESTAMP

);

create table Auditoria 
(
Id_auditoria char(36) not null primary key,
Acao ENUM('INSERT', 'UPDATE', 'DELETE') not null,  /* o enum permite que somente essas opções sejam aceitas*/
Tabela ENUM('Arquivos', 'Usuarios', 'Comentarios') not null,
Realizado_por char(36) not null,
foreign key (Realizado_por) references Usuario (Id_usuario),
Data_hora datetime not null,
ip_origem varchar(45) not null
);

SELECT * FROM Auditoria;

