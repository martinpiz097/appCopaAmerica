create database dbCopaAmerica
use dbCopaAmerica

create table pais(

	id smallint not null auto_increment primary key,
	nombre varchar(30)
);

insert into pais values(null, 'Chile');
insert into pais values(null, 'Argentina');
insert into pais values(null, 'Bolivia');
insert into pais values(null, 'Perú');
insert into pais values(null, 'Estados Unidos');
insert into pais values(null, 'Venezuela');
insert into pais values(null, 'Ecuador');
insert into pais values(null, 'Colombia');
insert into pais values(null, 'México');
insert into pais values(null, 'Costa Rica');

create table club(
	id tinyint auto_increment not null primary key,
	nombre varchar(20),
	paisOrigen tinyint,
	foreign key(paisOrigen) references pais(id)
);

insert into club values(null, 'Barcelona');
insert into club values(null, 'Real Madrid');
insert into club values(null, 'Sao Paulo');
insert into club values(null, 'Colo Colo');
insert into club values(null, 'Universidad Catolica');
insert into club values(null, 'Universidad de Chile');
insert into club values(null, 'Liverpool');
insert into club values(null, 'Manchester United');
insert into club values(null, 'Manchester City');
insert into club values(null, 'Inter de Milán');

create table estadio(

	id tinyint auto_increment not null primary key,
	nombre varchar(30)
);

insert into estadio values(null, 'Estadio1');
insert into estadio values(null, 'Estadio2');
insert into estadio values(null, 'Estadio3');
insert into estadio values(null, 'Estadio4');
insert into estadio values(null, 'Estadio5');
insert into estadio values(null, 'Estadio6');
insert into estadio values(null, 'Estadio7');
insert into estadio values(null, 'Estadio8');
insert into estadio values(null, 'Estadio9');
insert into estadio values(null, 'Estadio10');

create table perfil(
	
	id tinyint not null auto_increment primary key,
	nombre varchar(30)

);

create table fase(
	
	id tinyint not null auto_increment primary key,
	nombre varchar(30)

);

insert into fase values(null, 'Primera Fase');
insert into fase values('Segunda Fase');
insert into fase values('Octavos de final');

create table posicion(

	id tinyint not null auto_increment primary key,
	nombre varchar(20)
);

insert into posicion values(null, 'Arquero');
insert into posicion values(null, 'Defensa Central');
insert into posicion values(null, 'Defensa Lateral');
insert into posicion values(null, 'Volante de Contención');
insert into posicion values(null, 'Volante Central');
insert into posicion values(null, 'Volante Creador');
insert into posicion values(null, 'Volante Derecho');
insert into posicion values(null, 'Volante Izquierdo');
insert into posicion values(null, 'Extremo Derecho');
insert into posicion values(null, 'Extremo Izquierdo');
insert into posicion values(null, 'Delantero Central');
insert into posicion values(null, 'Centro');
insert into posicion values(null, 'Lateral');

insert into perfil values(null, 'Jugador');
insert into perfil values(null, 'Director Técnico');
insert into perfil values(null, 'Ayudante Técnico');
insert into perfil values(null, 'Preparador Fìsico');
insert into perfil values(null, 'Arbitro');

create table estado(

	id tinyint not null auto_increment primary key,
	nombre varchar(25)
);

insert into estado values(null, 'Activa');
insert into estado values(null, 'Eliminada');
insert into estado values(null, 'Campeón');
insert into estado values(null, 'Excelente');
insert into estado values(null, 'Regular');
insert into estado values(null, 'Lesionado');
insert into estado values(null, 'Fuera del Equipo');

create table rol(
	
	id tinyint not null auto_increment primary key,
	nombre varchar(15)
);

insert into rol values(null, 'Titular');
insert into rol values(null, 'Suplente');
insert into rol values(null, 'Reserva');



create table seleccion(

	id smallint not null auto_increment primary key,
	cantJugadores int,
	estado tinyint,
	pais tinyint,
	lugarRankingFifa int,
	fase tinyint,
	partidosGanados int,
	foreign key(estado) references estado(id),
	foreign key(pais) references pais(id),
	foreign key(fase) references fase(id)
);

insert into seleccion values(null, 30,1,1,5,1,0);
insert into seleccion values(null, 30,1,2,1,1,0);
insert into seleccion values(null, 30,1,3,2,1,0);
insert into seleccion values(null, 30,1,4,3,1,0);
insert into seleccion values(null, 30,1,5,4,1,0);
insert into seleccion values(null, 30,1,6,6,1,0);
insert into seleccion values(null, 30,1,7,7,1,0);
insert into seleccion values(null, 30,1,8,8,1,0);
insert into seleccion values(null, 30,1,9,9,1,0);
insert into seleccion values(null, 30,1,10,10,1,0);

create table integranteSeleccion(

	id int not null auto_increment primary key,
	idSeleccion smallint,
	idPerfil tinyint,
	primerNombre varchar(20),
	segundoNombre varchar(20),
	primerApellido varchar(20),
	segundoApellido varchar(20),
	clubDeportivo tinyint,
	estadoFisico tinyint,
	rol tinyint,
	posicion tinyint,
	dorsal tinyint,
	añosDeJugador tinyint,
	cantGoles smallint,
	sueldo bigint,
	atajadas smallint,
	tarjetasAamarillas tinyint,
	tarjetasRojas tinyint,
	habilitado bit,
	foreign key(idSeleccion) references seleccion(id),
	foreign key(clubDeportivo) references club(id),
	foreign key(estadoFisico) references estado(id),
	foreign key(rol) references rol(id),
	foreign key(posicion) references posicion(id)
);

create table cuerpoTecnico(

	id tinyint not null auto_increment primary key,
	idDT int,
	idAyudanteDT int,
	idPreparadorFisico int,
	idSeleccion smallint,
	foreign key(idDT) references integranteSeleccion(id),
	foreign key(idAyudanteDT) references integranteSeleccion(id),
	foreign key(idPreparadorFisico) references integranteSeleccion(id),
	foreign key(idSeleccion) references seleccion(id)
);

create table partido(

	id int not null auto_increment primary key,
	fecha date,
	seleccionLocal smallint,
	seleccionVisita smallint,
	horaInicio datetime,
	horaFin datetime,
	fase tinyint,
	constraint fkParSelL foreign key(seleccionLocal) references seleccion(id),
	constraint fkParSelV foreign key(seleccionVisita) references seleccion(id),
	constraint fkParFase foreign key(fase) references fase(id)
	
);

create table arbitro(

	id int not null auto_increment primary key,
	nombre varchar(20),
	apellido varchar(20),
	edad tinyint,
	pais smallint,
	constraint fkArbitroPais foreign key(pais) references pais(id)
)

create table arbitroPartido(

	id int not null auto_increment primary key,
	idPartido int,
	idArbitro int,
	isTitular bit,
	posicion int,
	constraint fkArbParPar foreign key(idPartido) references partido(id),
	constraint fkArbParArb foreign key(idArbitro) references arbitro(id),
	constraint fkArbParPos foreign key(posicion) references posicion(id)	
)

create procedure prIngresarJugador
	
	@idSeleccion smallint,
	@idPerfil tinyint,
	@primerNombre varchar(20),
	@segundoNombre varchar(20),
	@primerApellido varchar(20),
	@segundoApellido varchar(20),
	@clubDeportivo tinyint,
	@estadoFisico tinyint,
	@rol tinyint,
	@posicion tinyint,
	@dorsal tinyint,
	@añosDeJugador tinyint,
	@cantGoles smallint,
	@sueldo bigint,
	@atajadas smallint,
	@tarjetasAamarillas tinyint,
	@tarjetasRojas tinyint,
	habilitado bit,
as

if not exist (select primerNombre, segundoNombre, primerApellido, segundoApellido from integranteSeleccion where perfil = 1 and primerNombre = @primerNombre and segundoNombre = @segundoNombre and primerApellido = @primerApellido and segundoApellido = @segundoApellido)
	insert into integranteSeleccion values(@idSeleccion, @idPerfil, @primerNombre, @segundoNombre, @primerApellido, @segundoApellido, @clubDeportivo, @estadoFisico, @rol, @posicion, @dorsal, @añosDeJugador, 0, @cantGoles, @sueldo, @atajadas, @tarjetasAmarillas, @tarjetasRojas, 1);

go

create table gol(
	
	id int not null identity(1,1) primary key,
	idJugador int,
	idEquipo int,
	fecha datetime,
	constraint fkGolJug foreign key(idJugador) references(integranteSeleccion)
	constraint fkEquiJug foreign key(idEquipo) references(integranteSeleccion)
);

create procedure prActualizarGoles

@idJugador int, @idEquipo smallint, @fecha datetime
begin

if not exist (select idJugador, fecha from gol where idJugador = @idJugador and fecha = @fecha) and not (select estado from integranteSeleccion, seleccion where integranteSeleccion.idSeleccion = seleccion and integranteSeleccion.id = @idJugador) = 2 and not (select estado from seleccion where estado = 3)
insert into gol values(@idJugador, @idEquipo, @fecha)

end


