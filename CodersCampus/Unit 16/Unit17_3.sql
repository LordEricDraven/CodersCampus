-- one-to-one relationship
-- ex: users 1 -> 1 address

-- how do you enable MySQL to enforce a one-to-one relationship?
--   i.e. how do you design / structure the DB tables?

create table `address` (
	`user_id` int not null,
    `address_line_1` varchar(200) not null,
    `address_line_2` varchar(200), 
    `city` varchar(100),
    `region` varchar(100),
    `country` varchar(100),
    `zip_code` varchar(15),
    primary key (`user_id`),
    foreign key(`user_id`) references users (`user_id`)
);

insert into `address` (user_id, address_line_1, city, region, country, zip_code)
values (1, '123 Fake St', 'Some City', 'Some Region', 'Some Country', '12345');

select * from address;