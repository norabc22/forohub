create table topicos (
id bigint not null auto_increment,
titulo varchar(200) not null unique,
mensaje varchar(255) not null unique,
fecha_creacion datetime not null,
status varchar(100) not null,
autor varchar(100) not null,
curso varchar(200) not null,
borrado tinyint,

primary key(id)
);