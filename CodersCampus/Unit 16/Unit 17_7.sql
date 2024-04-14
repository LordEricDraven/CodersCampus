insert into transactions (transaction_id, transaction_date, amount, type, account_id)
values (4, '2020-02-28 09:00:00', 57.56, 'C', 2);

select * from transactions;

select * from transactions 
group by transaction_id;
-- this is at the end or near the end of a select statement
