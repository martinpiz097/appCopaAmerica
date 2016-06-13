create database dbCopaAmerica;
use dbCopaAmerica;

create table pais (
    id tinyint not null auto_increment primary key,
    nombre varchar(30)
);

insert into pais values(null, 'Chile');
insert into pais values(null, 'Argentina');
insert into pais values(null, 'Venezuela');
insert into pais values(null, 'Colombia');
insert into pais values(null, 'Brasil');
insert into pais values(null, 'Ecuador');
insert into pais values(null, 'Perú');
insert into pais values(null, 'México');
insert into pais values(null, 'Panamá');
insert into pais values(null, 'Costa Rica');

create table rol (
    id tinyint not null auto_increment primary key,
    nombre varchar(30)
);

insert into rol values('Titular');
insert into rol values(null, 'Reserva');
insert into rol values (null, 'DT');
insert into rol values (null, 'Ayudante Técnico');
insert into rol values (null, 'PF');

create table posicion (
    id tinyint not null auto_increment primary key,
    nombre varchar(30)
);

insert into posicion values(null, 'Arquero');
insert into posicion values(null, 'Defensa');
insert into posicion values(null, 'Volante');
insert into posicion values(null, 'Delantero');
insert into posicion values(null, 'Centro');
insert into posicion values(null, 'Lateral Derecho');
insert into posicion values(null, 'Lateral Izquiero');
insert into posicion values(null, 'Cuarto Arbitro');

create table clubDeportivo (
    id tinyint not null auto_increment primary key,
    nombre varchar(30)
);

insert into clubDeportivo values(null, 'Colo-Colo');
insert into clubDeportivo values(null, 'Universidad De Chile');
insert into clubDeportivo values(null, 'Barcelona');
insert into clubDeportivo values(null, 'Manchester United');
insert into clubDeportivo values(null, 'Real Madrid');
insert into clubDeportivo values(null, 'Liverpool');
insert into clubDeportivo values(null, 'Inter de Milán');
insert into clubDeportivo values(null, 'Milan');
insert into clubDeportivo values(null, 'FC Bayern Munich');
insert into clubDeportivo values(null, 'Manchester City');

create table estado (
    id tinyint not null auto_increment primary key,
    nombre varchar(30)
);

insert into estado values(null, 'Excelente');
insert into estado values(null, 'Regular');
insert into estado values(null, 'Lesionado');
insert into estado values(null, 'Fuera del Equipo');
insert into estado values(null, 'Activa');
insert into estado values(null, 'Eliminada');
insert into estado values(null, 'Campeón');

create table fase (
    id tinyint not null auto_increment primary key,
    nombre varchar(30)
);

insert into fase values(null, 'Primera fase');
insert into fase values(null, 'Segunda fase');
insert into fase values(null, 'Tercera fase');
insert into fase values(null, 'Octavos de final');
insert into fase values(null, 'Cuartos de final');
insert into fase values(null, 'Semifinal');
insert into fase values(null, 'Final');

create table estadio (
    id tinyint not null auto_increment primary key,
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

create table seleccion (
    id tinyint not null auto_increment primary key,
    nombre varchar(20),
    cantidadJugadores tinyint,
    estado tinyint,
    pais tinyint,
    lugarFifa int,
    faseActual tinyint,
    foreign key (pais)
        references pais (id),
    foreign key (estado)
        references estado (id)
);

insert into seleccion values(null, 'Seleccion1', 18, 5, 1, 1, 1);
insert into seleccion values(null, 'Seleccion1', 18, 5, 2, 2, 1);
insert into seleccion values(null, 'Seleccion1', 18, 5, 3, 3, 1);
insert into seleccion values(null, 'Seleccion1', 18, 5, 4, 4, 1);
insert into seleccion values(null, 'Seleccion1', 18, 5, 5, 5, 1);
insert into seleccion values(null, 'Seleccion1', 18, 5, 6, 6, 1);
insert into seleccion values(null, 'Seleccion1', 18, 5, 7, 7, 1);
insert into seleccion values(null, 'Seleccion1', 18, 5, 8, 8, 1);
insert into seleccion values(null, 'Seleccion1', 18, 5, 9, 9, 1);
insert into seleccion values(null, 'Seleccion1', 18, 5, 10, 10, 1);

create table jugador (
    id int not null auto_increment primary key,
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
    foreign key (nacionalidad)
        references pais (id),
    foreign key (clubDeportivo)
        references clubDeportivo (id),
    foreign key (estadoFisico)
        references estado (id),
    foreign key (rol)
        references rol (id),
    foreign key (posicion)
        references posicion (id)
);

insert into jugador values(null, 'PrimerNombre1', 'SegundoNombre1', 'PrimerApellido1', 'SegundoApellido1', 
20, 1, 1, 1, 1, 1, 1, 4, 0, 1000, 0, 0, 0, 1);

insert into jugador values(null, 'PrimerNombre2', 'SegundoNombre2', 'PrimerApellido2', 'SegundoApellido2', 
20, 2, 2, 1, 1, 1, 1, 4, 0, 1000, 0, 0, 0, 1);

insert into jugador values(null, 'PrimerNombre3', 'SegundoNombre3', 'PrimerApellido3', 'SegundoApellido3', 
20, 3, 3, 1, 1, 1, 1, 4, 0, 1000, 0, 0, 0, 1);

insert into jugador values(null, 'PrimerNombre4', 'SegundoNombre4', 'PrimerApellido4', 'SegundoApellido4', 
20, 4, 4, 1, 1, 1, 1, 4, 0, 1000, 0, 0, 0, 1);

insert into jugador values(null, 'PrimerNombre5', 'SegundoNombre5', 'PrimerApellido5', 'SegundoApellido5', 
20, 5, 5, 1, 1, 1, 1, 4, 0, 1000, 0, 0, 0, 1);

insert into jugador values(null, 'PrimerNombre6', 'SegundoNombre6', 'PrimerApellido6', 'SegundoApellido6', 
20, 6, 6, 1, 1, 1, 1, 4, 0, 1000, 0, 0, 0, 1);

insert into jugador values(null, 'PrimerNombre7', 'SegundoNombre7', 'PrimerApellido7', 'SegundoApellido7', 
20, 7, 7, 1, 1, 1, 1, 4, 0, 1000, 0, 0, 0, 1);

insert into jugador values(null, 'PrimerNombre8', 'SegundoNombre8', 'PrimerApellido8', 'SegundoApellido8', 
20, 8, 8, 1, 1, 1, 1, 4, 0, 1000, 0, 0, 0, 1);

insert into jugador values(null, 'PrimerNombre9', 'SegundoNombre9', 'PrimerApellido9', 'SegundoApellido9', 
20, 9, 9, 1, 1, 1, 1, 4, 0, 1000, 0, 0, 0, 1);

insert into jugador values(null, 'PrimerNombre10', 'SegundoNombre0', 'PrimerApellido10', 'SegundoApellido10', 
20, 10, 10, 1, 1, 1, 1, 4, 0, 1000, 0, 0, 0, 1);


create table centroDeportivo (
    id tinyint not null auto_increment primary key,
    nombre varchar(30),
    idSeleccion tinyint,
    direccion varchar(40),
    foreign key (idSeleccion)
        references seleccion (id)
);

insert into centroDeportivo values(null, 'Centro Deportivo 1', 1, 'Direccion1');
insert into centroDeportivo values(null, 'Centro Deportivo 2', 2, 'Direccion2');
insert into centroDeportivo values(null, 'Centro Deportivo 3', 3, 'Direccion3');
insert into centroDeportivo values(null, 'Centro Deportivo 4', 4, 'Direccion4');
insert into centroDeportivo values(null, 'Centro Deportivo 5', 5, 'Direccion5');
insert into centroDeportivo values(null, 'Centro Deportivo 6', 6, 'Direccion6');
insert into centroDeportivo values(null, 'Centro Deportivo 7', 7, 'Direccion7');
insert into centroDeportivo values(null, 'Centro Deportivo 8', 8, 'Direccion8');
insert into centroDeportivo values(null, 'Centro Deportivo 9', 9, 'Direccion9');
insert into centroDeportivo values(null, 'Centro Deportivo 10', 10, 'Direccion10');

create table entrenador (
    id tinyint not null auto_increment primary key,
    rol tinyint,
    seleccion tinyint,
    primerNombre varchar(20),
    segundoNombre varchar(20),
    primerApellido varchar(20),
    segundoApellido varchar(20),
    edad tinyint,
    nacionalidad tinyint,
    sueldo bigint,
    foreign key (rol)
        references rol (id),
    foreign key (seleccion)
        references seleccion (id),
    foreign key (nacionalidad)
        references pais (id)
);

insert into entrenador values(null, 3, 1, 'primNom1', 'segNom1', 'primApe1', 'segApe1', 40, 1, 2000000);
insert into entrenador values(null, 3, 1, 'primNom2', 'segNom2', 'primApe2', 'segApe2', 40, 2, 2000000);
insert into entrenador values(null, 3, 1, 'primNom3', 'segNom3', 'primApe3', 'segApe3', 40, 3, 2000000);
insert into entrenador values(null, 3, 1, 'primNom4', 'segNom4', 'primApe4', 'segApe4', 40, 4, 2000000);
insert into entrenador values(null, 3, 1, 'primNom5', 'segNom5', 'primApe5', 'segApe5', 40, 5, 2000000);
insert into entrenador values(null, 3, 1, 'primNom6', 'segNom6', 'primApe6', 'segApe6', 40, 6, 2000000);
insert into entrenador values(null, 3, 1, 'primNom7', 'segNom7', 'primApe7', 'segApe7', 40, 7, 2000000);
insert into entrenador values(null, 3, 1, 'primNom8', 'segNom8', 'primApe8', 'segApe8', 40, 8, 2000000);
insert into entrenador values(null, 3, 1, 'primNom9', 'segNom9', 'primApe9', 'segApe9', 40, 9, 2000000);
insert into entrenador values(null, 3, 1, 'primNom10', 'segNom10', 'primApe10', 'segApe10', 40, 10, 2000000);

create table partido (
    id smallint not null auto_increment primary key,
    fecha date,
    seleccionLocal tinyint,
    seleccionVisita tinyint,
    estadio tinyint,
    horaInicio varchar(8),
    horaTermino varchar(8),
    cantidadAsistentes mediumint,
    foreign key (seleccionLocal)
        references seleccion (id),
    foreign key (seleccionVisita)
        references seleccion (id),
    foreign key (estadio)
        references estadio (id)
);

insert into partido values
(null, '02-06-2016', 1, 2, 1, '13:00:00', '14:40:00', 40000), 
(null, '03-06-2016', 2, 3, 2, '13:00:00', '14:40:00', 40000), 
(null, '04-06-2016', 3, 4, 3, '13:00:00', '14:40:00', 40000), 
(null, '05-06-2016', 4, 5, 4, '13:00:00', '14:40:00', 40000), 
(null, '06-06-2016', 5, 6, 5, '13:00:00', '14:40:00', 40000), 
(null, '07-06-2016', 6, 7, 6, '13:00:00', '14:40:00', 40000), 
(null, '08-06-2016', 7, 8, 7, '13:00:00', '14:40:00', 40000), 
(null, '09-06-2016', 8, 9, 8, '13:00:00', '14:40:00', 40000), 
(null, '10-06-2016', 9, 1, 9, '13:00:00', '14:40:00', 40000), 
(null, '11-06-2016', 10, 2, 10, '13:00:00', '14:40:00', 40000);

create table arbitro (
    id smallint not null auto_increment primary key,
    nombre varchar(20),
    apellido varchar(20),
    edad tinyint,
    nacionalidad tinyint,
    foreign key (nacionalidad)
        references pais (id)
);

insert into arbitro values
(null, 'Nombre1', 'Apellido1', 40, 1), 
(null, 'Nombre2', 'Apellido2', 41, 2),
(null, 'Nombre3', 'Apellido3', 42, 3),
(null, 'Nombre4', 'Apellido4', 43, 4),
(null, 'Nombre5', 'Apellido5', 44, 5),
(null, 'Nombre6', 'Apellido6', 45, 6),
(null, 'Nombre7', 'Apellido7', 46, 7),
(null, 'Nombre8', 'Apellido8', 47, 8),
(null, 'Nombre9', 'Apellido9', 48, 9),
(null, 'Nombre10', 'Apellido10', 50, 10);


create table arbitroPartido (
    id smallint not null auto_increment primary key,
    idPartido smallint,
    idArbitro smallint,
    posicion tinyint,
    foreign key (idPartido)
        references partido (id),
    foreign key (idArbitro)
        references arbitro (id),
    foreign key (posicion)
        references posicion (id)
);

insert into arbitroPartido values
(null, 1, 1, 5),
(null, 1, 2, 6), 
(null, 1, 3, 7), 
(null, 1, 4, 8), 
(null, 2, 5, 5),
(null, 2, 6, 6), 
(null, 2, 7, 7), 
(null, 2, 8, 8), 
(null, 3, 9, 5), 
(null, 3, 10, 6);

create table administrador (
    id tinyint not null auto_increment primary key,
    usuario varchar(20),
    clave varchar(40)
);

insert into administrador values(null, 'admin', MD5('1234'));

delimiter //

create procedure prAddArbitro(
in _nombre varchar(20), 
in _apellido varchar(20), 
in _edad tinyint,
in _nacionalidad tinyint
)
begin
	insert into arbitro values(null, _nombre, _apellido, _edad, _nacionalidad);
end //

create procedure prAddEstadio(in _nombre varchar(20))
begin
	insert into estadio values(null, _nombre);
end //

create procedure prAddClub(in _nombre varchar(20))

begin
	insert into clubDeportivo values(null, _nombre);
end //

create procedure prAddEstado(in _nombre varchar(20))
begin
	insert into estado values(null, _nombre);
end //

create procedure prAddFase(in _nombre varchar(20))
begin
	insert into fase values(null, _nombre);
end //

create procedure prAddPais(in _nombre varchar(20))
begin
	insert into pais values(null, _nombre);
end //

create procedure prAddPosicion(in _nombre varchar(20))
begin
	insert into posicion values(null, _nombre);
end //

create procedure prAddRol(in _nombre varchar(20))
begin
	insert into rol values(null, _nombre);
end //

delimiter //
create procedure prAddArbitro
(in _nombre varchar(20), 
in _apellido varchar(20),
in _edad tinyint,
in _nacionalidad tinyint)
begin
	insert into arbitro values(null, _nombre, _apellido, _edad, _nacionalidad);
end //

/*
create procedure prPruebaGet()
begin
	select * from pais;
end //

delimiter //
create function prueba() returns varchar(255) 
begin
	return (select * from pais);
end //
*/

create procedure prAddCentroDeportivo(
in _nombre varchar(20),
in _idSeleccion tinyint,
in _direccion varchar(20)
)

begin
	insert into centroDeportivo values(null, _nombre, _idSeleccion, _direccion);
end //


create procedure prAddArbitroPartido(
in _idPartido smallint,
in _idArbitro smallint,
in _posicion smallint
)
begin
	insert into arbitroPartido values(null, _idPartido, _idArbitro, _posicion);
end //

create procedure prAddEntrenador(
in _rol tinyint,
in _seleccion tinyint,
in _priNom varchar(20),
in _segNom varchar(20),
in _priApe varchar(20),
in _segApe varchar(20), 
in _edad tinyint,
in _nacionalidad tinyint,
in _sueldo bigint
)

begin
	insert into entrenador values(null,_rol,_seleccion,_priNom,_segNom,_priApe,
								_segApe, _edad,_nacionalidad,_sueldo);
end //

create procedure prAddJugador(
in _priNom varchar(20),
in _segNom varchar(20),
in _priApe varchar(20),
in _segApe varchar(20), 
in _edad tinyint,
in _nacionalidad tinyint,
in _clubDeportivo tinyint,
in _estadoFisico tinyint,
in _rol tinyint,
in _posicion tinyint,
in _dorsal tinyint,
in _añosJugador tinyint,
in _goles  smallint,
in _sueldo bigint,
in _atajadas smallint,
in _tarAma tinyint,
in _tanRoj tinyint,
in _habilitado bit
)

begin
	insert into j
values(
_priNom,
_segNom,
_priApe,
_segApe, 
_edad,
_nacionalidad,
_clubDeportivo,
_estadoFisico,
_rol,
_posicion,
_dorsal,
_añosJugador,
_goles,
_sueldo,
_atajadas,
_tarAma,
_tanRoj,
_habilitado
);

end //

create procedure prAddPartido(
in _fecha varchar(8),
in _selecLocal tinyint,
in _selecVisita tinyint,
in _estadio tinyint,
in _horaInicio varchar(8),
in _horaFin varchar(8),
in _cantAsistentes int
)
begin
	insert into partido values(null, _fecha, _selecLocal, _selecVisita, _estadio, 
								_horaInicio, _horaFin, _cantAsistentes);
end //

create procedure prAddSeleccion(
in _nombre varchar(20),
in _cantJugad tinyint,
in _estado tinyint,
in _pais tinyint,
in _lugarFifa int,
in _faseActual tinyint
)
begin
	insert into seleccion values(null, _nombre, _cantJugad, _estado, 
								_pais, _lugarFifa, _faseActual);
end //

create procedure prAddAdmin(in _user varchar(20), in _clave varchar(40))
begin
	insert into administrador values(null, _user, MD5(_clave));
end //
