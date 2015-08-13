create database if not exists tourfirm CHARACTER SET utf8;

use tourfirm;

create table if not exists cities(
	idCity int primary key auto_increment,
    cityName varchar(25),
    country varchar(25),
    trasportation varchar(15)
);

create table if not exists clientInfo(
	idClient int primary key auto_increment,
    fName varchar(25),
    sName varchar(25),
    pasportNumber varchar(25),
    adress varchar(45),
    tel varchar(20),
    email varchar(30)
);

create table if not exists visas(
	idVisa int primary key auto_increment,
    idClient int,
    dateOfIssue date,
    constraint fkClientId FOREIGN KEY (idClient) REFERENCES clientInfo (idClient)
);

create table if not exists hotels(
	idHotel int primary key auto_increment,
    hotelName varchar(40),
    idCity int,
    category int,
    location varchar(30),
    email varchar(30),
    tel varchar(20),
    constraint fkIdCity FOREIGN KEY (idCity) REFERENCES cities (idCity)
);

create table if not exists rooms(
	idRoom int primary key auto_increment,
    idHotel int,
    roomNumber int,
    beds int,
    price double(6,2),
    constraint fkIdHotel FOREIGN KEY (idHotel) REFERENCES hotels (idHotel)
);

create table if not exists booking (
	idBooking int primary key auto_increment,
    idRoom int,
    idClient int,
    dateFrom date,
    dateTo date,
    constraint fkIdRoom FOREIGN KEY (idRoom) REFERENCES rooms (idRoom),
    constraint fkIdClient FOREIGN KEY (idClient) REFERENCES clientInfo (idClient)
);