-- auto increment

Alter table `transactions`
change column `transaction_id` `transactions_id` int not null auto_increment;


-- For illustration purposes, here's how to add auto increment to a
-- create table script
-- create table `some_table` (
--    some_table_id int not null auto_increment,
--    primary key (some_table_id)
-- )

delete from transactions where transaction_id = 8;

insert into transactions (transaction_date, amount, `type`, account_id)
values ('2020_03_03 19:30:00', 10.25, 'C', 1);

select * from transactions;