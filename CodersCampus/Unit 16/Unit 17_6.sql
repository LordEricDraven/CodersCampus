select * from `users` u
left join `address` a on u.user_id = a.user_id
join `user_account` ua on ua.user_id = u.user_id
join `account` acc on acc.account_id = ua.account_id
join `transactions` t on t.account_id = acc.account_id
where u.user_id = 1;

select * from `users` u
left join `address` a on u.user_id = a.user_id
join `user_account` ua on ua.user_id = u.user_id
join `account` acc on acc.account_id = ua.account_id
join `transactions` t on t.account_id = acc.account_id
where username in('trevorpage@craftycodr.com', 'john@doe.com');