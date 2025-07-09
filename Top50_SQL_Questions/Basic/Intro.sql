create database Customer;
use Customer;
create table Customer(
    CustomerId int primary key,
    FirstName varchar(50),
    LastName varchar(50),
    Email varchar(100),
    Phone varchar(15),
    Address varchar(255)
);

insert into Customer (CustomerId, FirstName, LastName, Email, Phone, Address) values
(1, 'John', 'Doe','abc@gmail.com', '1234567890', '123 Elm St, Springfield');
select * from Customer;
