SELECT id, movie, description, rating
FROM cinema
WHERE id % 2 = 1
AND description NOT LIKE 'boring'
order by rating DESC;