(select name as results 
from users 
join movierating using(user_id)
group by user_id 
order by count(movie_id) desc, name
limit 1
)
union all

(select title as results
from movies
join movierating using (movie_id)
where created_at >="2020-02-01" and created_at<"2020-03-01"
group by movie_id,title
order by avg(rating) desc,title
limit 1);
 