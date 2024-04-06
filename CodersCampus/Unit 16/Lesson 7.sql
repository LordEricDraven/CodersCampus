-- Create, Read, Update, Delete

select * from users;
select username from users;
select password, username from users;

select * from transactions;

insert into transactions (transaction_id, transaction_date, amount, type)
values (1, '2020-01-31 13:01:59', 20, 'D');

insert into transactions (transaction_id, transaction_date, amount, type)
values (2, '2020-01-30 15:01:00', 19.99, 'D');

alter table transactions
change column amount amount decimal(6, 2);

insert into transactions (transaction_id, transaction_date, amount, type)
values (3, '2020-02-29 08:00:00', 119.99, 'D');

