drop database if exists sampledb;
create database sampledb;
use sampledb;

create table sample_table(
No int, name varchar(255),age int,Mail varchar(255));

insert into sample_table values(1,"Yamada",21,"aaaaa@gmail.com");
insert into sample_table values(2,"Sato",39,"bbbbb@gmail.com");
insert into sample_table values(3,"Harada",44,"ccccc@gmail.com");