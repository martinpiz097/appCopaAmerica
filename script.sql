create database dbCopaAmerica
use dbCopaAmerica

create table pais(

	id smallint auto_increment,
	nombre varchar(30),
        primary key(id)
)

insert into pais values(null,'Chile');
insert into pais values(null,'Argentina');
insert into pais values(null,'Bolivia');
insert into pais values(null,'Perú');
insert into pais values(null,'Estados Unidos');
insert into pais values(null,'Venezuela');
insert into pais values(null,'Ecuador');
insert into pais values(null,'Colombia');
insert into pais values(null,'México');
insert into pais values(null,'Costa Rica');
insert into pais values(null,'España');
insert into pais values(null,'Brasil');
insert into pais values(null,'Inglaterra');
insert into pais values(null,'Italia');

select * from pais;

create table club(
	id int auto_increment,
	nombre varchar(20),
	paisOrigen smallint,
	foreign key(paisOrigen) references pais(id),
        primary key(id)
)

insert into club values(null,'Barcelona',10);
insert into club values(null,'Real Madrid',10);
insert into club values(null,'Sao Paulo',11);
insert into club values(null,'Colo Colo',1);
insert into club values(null,'Universidad Catolica',1);
insert into club values(null,'Universidad de Chile',1);
insert into club values(null,'Liverpool',12);
insert into club values(null,'Manchester United',12);
insert into club values(null,'Manchester City',12);
insert into club values(null,'Inter de Milán',13);

create table estadio(

	id smallint auto_increment,
	nombre varchar(30),
        primary key(id)
)

insert into estadio values(null,'Estadio1');
insert into estadio values(null,'Estadio2');
insert into estadio values(null,'Estadio3');
insert into estadio values(null,'Estadio4');
insert into estadio values(null,'Estadio5');
insert into estadio values(null,'Estadio6');
insert into estadio values(null,'Estadio7');
insert into estadio values(null,'Estadio8');
insert into estadio values(null,'Estadio9');
insert into estadio values(null,'Estadio10');


create table perfil(
	
	id smallint auto_increment,
	nombre varchar(30),
        primary key(id)

)

create table fase(
	
	id smallint auto_increment,
	nombre varchar(30),
        primary key(id)

)

insert into fase values(null,'Primera Fase');
insert into fase values(null,'Segunda Fase');
insert into fase values(null,'Octavos de final');

create table posicion(

	id smallint auto_increment,
	nombre varchar(20),
        primary key (id)
)

drop table posicion;

insert into posicion values(null,'Arquero');
insert into posicion values(null,'Defensa Central');
insert into posicion values(null,'Defensa Lateral');
insert into posicion values(null,'Volante de Contención');
insert into posicion values(null,'Volante Central');
insert into posicion values(null,'Volante Creador');
insert into posicion values(null,'Volante Derecho');
insert into posicion values(null,'Volante Izquierdo');
insert into posicion values(null,'Extremo Derecho');
insert into posicion values(null,'Extremo Izquierdo');
insert into posicion values(null,'Delantero Central');
insert into posicion values(null,'Centro');
insert into posicion values(null,'Lateral');

insert into perfil values(null,'Jugador');
insert into perfil values(null,'Director Técnico');
insert into perfil values(null,'Ayudante Técnico');
insert into perfil values(null,'Preparador Fìsico');
insert into perfil values(null,'Arbitro');

create table estado(

	id smallint auto_increment,
	nombre varchar(25),
        primary key (id)
)

drop table estado;

insert into estado values(null,'Activa');
insert into estado values(null,'Eliminada');
insert into estado values(null,'Campeón');
insert into estado values(null,'Excelente');
insert into estado values(null,'Regular');
insert into estado values(null,'Lesionado');
insert into estado values(null,'Fuera del Equipo');

create table rol(
	
	id smallint auto_increment,
	nombre varchar(15),
        primary key(id)
)

insert into rol values(null,'Titular');
insert into rol values(null,'Suplente');
insert into rol values(null,'Reserva');



create table seleccion(
        
	id smallint auto_increment,
	cantJugadores smallint,
	estado smallint,
	pais smallint,
	lugarRankingFifa smallint,
	fase smallint,
	foreign key(estado) references estado(id),
	foreign key(pais) references pais(id),
	foreign key(fase) references fase(id),
        primary key(id)
)


insert into seleccion values(null,30,1,1,5,1);

create table integranteSeleccion(
	id smallint auto_increment,
	idSeleccion smallint,
	idPerfil smallint,
	primerNombre varchar(20),
	segundoNombre varchar(20),
	primerApellido varchar(20),
	segundoApellido varchar(20),
	clubDeportivo int,
	estadoFisico smallint,
	rol smallint,
	posicion smallint,
	dorsal int,
	añosDeJugador int,
	cantGoles smallint,
	sueldo int,
	atajadas smallint,
	tarjetasAamarillas int,
	tarjetasRojas int,
	habilitado bit,
	foreign key(idSeleccion) references seleccion(id),
	foreign key(clubDeportivo) references club(id),
	foreign key(estadoFisico) references estado(id),
	foreign key(rol) references rol(id),
	foreign key(posicion) references posicion(id),
        primary key(id)

)

create table cuerpoTecnico(

	id smallint auto_increment,
	idDT int,
	idAyudanteDT int,
	idPreparadorFisico int,
	idSeleccion smallint,
	foreign key(idDT) references integranteSeleccion(id),
	foreign key(idAyudanteDT) references integranteSeleccion(id),
	foreign key(idPreparadorFisico) references integranteSeleccion(id),
	foreign key(idSeleccion) references seleccion(id),
        primary key(id)
)

create table partido(

	id smallint auto_increment,
	fecha date,
	seleccionLocal smallint,
	seleccionVisita smallint,
	horaInicio time,
	horaFin time,
	fase smallint,
	foreign key(seleccionLocal) references seleccion(id),
	foreign key(seleccionVisita) references seleccion(id),
	 foreign key(fase) references fase(id),
        primary key(id)
	
)

create table arbitro(

	id int auto_increment,
	nombre varchar(20),
	apellido varchar(20),
	edad smallint,
	pais smallint,
        foreign key(pais) references pais(id),
        primary key(id) 
)

create table arbitroPartido(

	id int auto_increment,
	idPartido smallint,
	idArbitro int,
	isTitular bit,
	posicion smallint,
	foreign key(idPartido) references partido(id),
	foreign key(idArbitro) references arbitro(id),
	foreign key(posicion) references posicion(id),
primary key(id)	
)
