select account_id,
	sum(CASE
		WHEN `type` = 'D' THEN amount
        WHEN `type` = 'C' THEN amount * -1
        -- ELSE amount * -1
	END) as account_balance 
from transactions 
group by account_id;

select * from transactions;

-- CASE
--	WHEN [boolean expression] THEN [return value]
--	WHEN [boolean expression] THEN [return value]
--	ELSE [return value]
-- END