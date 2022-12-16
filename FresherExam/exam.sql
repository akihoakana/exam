drop database exam;

create database exam;
use exam;

create table employee(
	id int auto_increment,
    firstname varchar(255),
    lastname varchar(255),
    monthly_salary double,
    primary key(id)
);
create table developer(
	id_employee int,
    programming_language varchar(255),

    primary key(id_employee),
    foreign key(id_employee) references employee(id)
);
create table tester(
	id_employee int,
    automated boolean,

    primary key(id_employee),
    foreign key(id_employee) references employee(id)
);
