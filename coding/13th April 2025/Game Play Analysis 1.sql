# Game Play Analysis 1
SELECT player_id, MIN(event_date) As first_login
FROM Activity
GROUP BY player_id
