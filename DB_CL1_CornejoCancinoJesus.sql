

CREATE DATABASE CL1_CornejoCancinoJesus;

USE CL1_CornejoCancinoJesus; 

create table doctor(
id_doctor int not null primary key,
nom_doctor varchar (70),
especialidad_doctor varchar(30)
);
create table citas (
id_cita int not null  primary key, 
num_cita int,
fecha_cita varchar(10) ,
nom_paciente_cita  varchar(70),
id_doctor int
);

select * from doctor;
select * from citas;