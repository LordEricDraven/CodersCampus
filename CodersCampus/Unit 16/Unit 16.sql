alter table users 
add primary key(user_id);

alter table users
change column user_id user_id int not null;