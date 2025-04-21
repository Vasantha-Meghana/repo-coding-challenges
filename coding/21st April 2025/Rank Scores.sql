# Rank Scores
SELECT s.score , COUNT(DISTINCT t.score) AS "rank"
FROM Scores s JOIN Scores t ON s.score <= t.score
GROUP BY s.id
ORDER BY s.score DESC;
