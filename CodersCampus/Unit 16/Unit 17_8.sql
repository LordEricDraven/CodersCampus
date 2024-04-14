insert into transactions (transaction_id, transaction_date, amount, type, account_id)
values (5, '2020-01-31' , 45.50, 'D', 2);

select sum(amount), count(*) from transactions
group by account_id;

select * from transactions;