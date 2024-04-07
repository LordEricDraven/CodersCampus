alter table transactions
add column user_id int;

alter table transactions
add foreign key (user_id) references users (user_id);

select * from transactions;