select * from transactions;

update transactions
set user_id = 1;

select * from transactions
where transaction_id = 2;

select * from users
where first_name = 'Jane'
and last_name = 'Musk';

update transactions
set user_id = 2
where transaction_id = 3;

select * from users;

delete from users
where user_id = 7; 

select * from users
where first_name = 'jane'
or first_name = 'john';