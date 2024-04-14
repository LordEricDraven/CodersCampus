select * from `users` u
left join `address` a on u.user_id = a.user_id
left join `user_account` ua on ua.user_id = u.user_id
left join `account` acc on acc.account_id = ua.account_id
left join `transactions` t on t.account_id = acc.account_id;

select * from transactions;

select* from user_account;

select * from account;

select * from users;

insert into user_account (user_id, account_id)
values (5, 2);