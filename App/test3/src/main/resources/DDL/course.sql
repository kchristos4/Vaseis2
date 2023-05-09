CREATE DATABASE  IF NOT EXISTS `db2`;
USE `db2`;




DROP TABLE IF EXISTS `authorities`;
DROP TABLE IF EXISTS `users`;
DROP TABLE IF EXISTS `studentregistration`;
DROP TABLE IF EXISTS `course`;
DROP TABLE IF EXISTS `student_registration`;


create table `users` (
    username varchar(50) not null primary key,
    password varchar(120) not null,
    enabled boolean not null
);

create table `authorities` (
    username varchar(50) not null,
    authority varchar(50) not null,
    foreign key (username) references users (username)
);

CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  `semester` int(11) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `studentregistration` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  `semester` int(11) DEFAULT NULL,
  `description` varchar(45) DEFAULT 'desc',
  `projectgrade` float(11) DEFAULT 5.5,
  `examgrade` float(11) DEFAULT 6.6,
  `finalgrade` float(11) DEFAULT 0,
  `courseid` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  foreign key (courseid) references course(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;



insert into users(username, password, enabled)values('zarras','{noop}zarras',true);
insert into users(username, password, enabled)values('admin','{noop}admin',true);
insert into users(username, password, enabled)values('christos','{noop}christos',true);
insert into users(username, password, enabled)values('nefeli','{noop}nefeli',true);
insert into users(username, password, enabled)values('fotini','{noop}fotini',true);



 
insert into authorities(username,authority)values('zarras','ROLE_ADMIN');
insert into authorities(username,authority)values('zarras','ROLE_USER');
insert into authorities(username,authority)values('admin','ROLE_USER');
insert into authorities(username,authority)values('admin','ROLE_ADMIN');
insert into authorities(username,authority)values('christos','ROLE_USER');
insert into authorities(username,authority)values('nefeli','ROLE_USER');
insert into authorities(username,authority)values('fotini','ROLE_USER');

insert into course(id,name,year,semester,description)values(1,'maths',2019,7,'maths lesson');
insert into course(id,name,year,semester,description)values(2,'phys',2014,7,'phys lesson');
insert into course(id,name,year,semester,description)values(3,'chem',2019,7,'chem lesson');


insert into studentregistration(id,name,year,semester,description,projectgrade,examgrade,courseid)values(1,'nefeli',1997,7,'nef',7,9.6,1);
insert into studentregistration(id,name,year,semester,description,projectgrade,examgrade,courseid)values(2,'xristos',2020,7,'kar',7,5.5,2);
insert into studentregistration(id,name,year,semester,description,projectgrade,examgrade,courseid)values(3,'fwteini',1944,7,'fwt',7,5.1,1);
 


