create database dbCopaAmerica;
use dbCopaAmerica;

create table pais(

	id tinyint not null primary key,
	nombre varchar(30)
);

create table rol(

	id tinyint not null primary key,
	nombre varchar(30)
);

insert into rol values(null, 'Titular');
insert into rol values(null, 'Reserva');

create table posicion(

	id tinyint not null primary key,
	nombre varchar(30)
);

insert into posicion values(null, 'Arquero');
insert into posicion values(null, 'Defensa');
insert into posicion values(null, 'Volante');
insert into posicion values(null, 'Delantero');
insert into posicion values(null, 'Centro');
insert into posicion values(null, 'Lateral Derecho');
insert into posicion values(null, 'Lateral Izquiero');

create table clubDeportivo(

	id tinyint not null primary key,
	nombre varchar(30)
);

create table estado(

	id tinyint not null primary key,
	nombre varchar(30)
);

insert into estado values(null, 'Excelente');
insert into estado values(null, 'Regular');
insert into estado values(null, 'Lesionado');
insert into estado values(null, 'Fuera del Equipo');
insert into estado values(null, 'Activa');
insert into estado values(null, 'Eliminada');
insert into estado values(null, 'Campeón');

create table fase(

	id tinyint not null primary key,
	nombre varchar(30)
);

insert into fase values(null, 'Primera fase');
insert into fase values(null, 'Segunda fase');
insert into fase values(null, 'Tercera fase');
insert into fase values(null, 'Octavos de final');
insert into fase values(null, 'Cuartos de final');
insert into fase values(null, 'Semifinal');
insert into fase values(null, 'Final');

create table estadio(

	id tinyint not null primary key,
	nombre varchar(30)
);

create table seleccion(

	id tinyint not null primary key,
	nombre varchar(20),
	cantidadJugadores tinyint,
	estado tinyint,
	pais tinyint,
	lugarFifa int,
	faseActual tinyint,
	foreign key(pais) references pais(id),
	foreign key(estado) references estado(id)	
);

create table jugador(

	id int not null primary key,
	primerNombre varchar(30),
	segundoNombre varchar(30),
	primerApellido varchar(30),
	segundoApellido varchar(30),
	edad tinyint,
	nacionalidad tinyint,
	clubDeportivo tinyint,
	estadoFisico tinyint,
	rol tinyint,
	posicion tinyint,
	dorsal tinyint,
	añosJugador tinyint,
	goles smallint,
	sueldo bigint,
	atajadas smallint,
	tarjetasAmarillas tinyint,
	tarjetasRojas tinyint,
	habilitado bit,
	foreign key(nacionalidad) references pais(id),
	foreign key(clubDeportivo) references clubDeportivo(id),
	foreign key(estadoFisico) references estado(id),
	foreign key(rol) references rol(id),
	foreign key(posicion) references posicion(id)
);

create table centroDeportivo(

	id tinyint not null primary key,
	nombre varchar(30),
	idSeleccion tinyint,
	direccion varchar(40),
	foreign key(idSeleccion) references seleccion(id)
);

create table entrenador(

	id tinyint not null primary key,
	rol tinyint,
	seleccion tinyint,
	primerNombre varchar(20),
	segundoNombre varchar(20),
	primerApellido varchar(20),
	segundoApellido varchar(20),
	edad tinyint,
	nacionalidad tinyint,
	sueldo bigint,
	foreign key(rol) references rol(id),
	foreign key(seleccion) references seleccion(id),
	foreign key(nacionalidad) references pais(id)
);

create table partido(

	id smallint not null primary key,
	fecha date,
	seleccionLocal tinyint,
	seleccionVisita tinyint,
	estadio tinyint,
	horaInicio varchar(8),
	horaTermino varchar(8),
	cantidadAsistentes mediumint,
	foreign key(seleccionLocal) references seleccion(id),
	foreign key(seleccionVisita) references seleccion(id),
	foreign key(estadio) references estadio(id)
);

create table arbitro(

	id smallint not null primary key,
	nombre varchar(20),
	apellido varchar(20),
	edad tinyint,
	nacionalidad tinyint,
	foreign key(nacionalidad) references pais(id)
);

create table arbitroPartido(

	id smallint not null primary key,
	idPartido smallint,
	idArbitro smallint,
	posicion tinyint,
	foreign key(idPartido) references partido(id),
	foreign key(idArbitro) references arbitro(id),
	foreign key(posicion) references posicion(id)
);

create table administrador(

	id tinyint not null primary key,
	usuario varchar(20),
	clave varchar(40)
);

insert into administrador values(null, 'admin', MD5('1234'));

delimiter //

create procedure prIngresarJugador

