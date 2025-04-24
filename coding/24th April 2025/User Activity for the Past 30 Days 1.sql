# User Activity for the Past 30 Days 1
SELECT activity_date as 'day', COUNT(DISTINCT user_id) as 'active_users'
FROM Activity
WHERE activity_date > '2019-06-27' AND activity_date <= '2019-07-27'
GROUP BY activity_date;
