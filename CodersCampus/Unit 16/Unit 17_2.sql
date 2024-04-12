-- one-to-one relationship between users -> transactions

-- users (* --> *) account (1 --> *) transactions

insert into `account` (account_id, account_name, balance)
values (1, 'Checking', 100.00);

insert into `account` (account_id, account_name, balance)
values (2, 'Checking', 200.00);

select * from `account`;

insert into user_account (user_id, account_id)
values (1, 1);

insert into user_account (user_id, account_id)
values (2, 2);

select * from users;
select * from user_account;

insert into user_account (user_id, account_id)
values (4, 2);

SET FOREIGN_KEY_CHECKS=0;
alter table transactions
drop foreign key `transactions_ibfk_1`;
alter table transactions
drop column user_id;
SET FOREIGN_KEY_CHECKS=1;

select * from transactions;

alter table transactions
add column `account_id` INT NOT NULL;

UPDATE `transactions` SET `account_id` = '1' WHERE (`transaction_id` = '1');
UPDATE `transactions` SET `account_id` = '1' WHERE (`transaction_id` = '2');
UPDATE `transactions` SET `account_id` = '2' WHERE (`transaction_id` = '3');


alter table transactions
add foreign key (account_id) references account (account_id);

