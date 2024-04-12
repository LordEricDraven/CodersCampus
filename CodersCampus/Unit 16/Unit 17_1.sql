-- RDBMS -> Relational DataBase Management System
--       -> MySQL, PostgreSQL, MS SQL Server, Oracle

-- Relationships exist between tables (3 types):
--   One-to-Many  (relationship)
--   Many-to-Many (relationship)
--   one-to-one   (relationship)

-- User              Account
--  1,2      <->      1, 2
--  2,3,4    <->    3, 4, 5, 6
--  3         <->       7 

-- How is a many-to-many relationship enforced in SQL?
--    A join table!
-- user      -> user_account <- account
-- user_id        user_id      account_id
-- username     account_id     account_name
-- password                    balance

update account

CREATE TABLE `account` (
	`account_id` INT NOT NULL, 
    `account_name` VARCHAR(100) NULL, 
    `balance` DECIMAL(15,2) NULL, 
PRIMARY KEY (`account_id`));

CREATE TABLE `user_account` (
	`user_id` INT NOT NULL, 
    `account_id` INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (user_id),
    FOREIGN KEY (account_id) REFERENCES `account` (account_id)
);