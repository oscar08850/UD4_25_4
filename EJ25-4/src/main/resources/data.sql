DROP table IF EXISTS salas;
DROP table IF EXISTS peliculas;

create table peliculas(
	id int auto_increment PRIMARY KEY,
	nombre varchar(100),
    calificacion_edad int
	);

create table salas(
	id int auto_increment PRIMARY KEY,
	nombre varchar(100),
	peliculas_id INT,
    FOREIGN KEY (peliculas_id) REFERENCES peliculas(id) ON DELETE CASCADE ON UPDATE CASCADE 
    );
    


insert into peliculas (nombre,calificacion_edad) values('Peli 1', '18');
insert into peliculas (nombre,calificacion_edad) values('Peli 2', '18');
insert into peliculas (nombre,calificacion_edad) values('Peli 3', '13');
insert into peliculas (nombre,calificacion_edad) values('Peli 4', '12');
insert into peliculas (nombre,calificacion_edad) values('Peli 5', '13');


insert into salas (nombre, peliculas_id) values('Sala 1','1');
insert into salas (nombre, peliculas_id) values('Sala 2','2');
insert into salas (nombre, peliculas_id) values('Sala 3','3');
insert into salas (nombre, peliculas_id) values('Sala 4','3');
insert into salas (nombre, peliculas_id) values('Sala 5','5');