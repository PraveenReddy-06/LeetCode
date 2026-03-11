select query_name,round(sum(rating/position)/count(*),2) as quality, round(AVG(CASE WHEN rating < 3 THEN 1.0 ELSE 0 END) * 100, 2)as poor_query_percentage
from Queries
group by query_name;