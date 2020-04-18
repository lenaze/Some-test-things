update `users` set `name` = 'Max' where id = 2;
#select * from users;
alter table users add dateOfBirth DATETIME default current_timestamp;
delete from users where age = 55;
select distinct * from users order by name;
select * from users where name like 'L%';

create table computer (
  id int not null auto_increment,
  os varchar(10),
  userID int,
  primary key (id),
  foreign key (userID) references users(id)
);

alter table users add computerID int;
drop table computer;

alter table computer change userID userID INT not null ;
INSERT into computer (os, userID)
values ('MacOS', 2), ('Windows 7', 3), ('Windows 10', 4),
       ('Ubuntu', 5);


select name, age from users
inner join computer c on users.id = c.userID

