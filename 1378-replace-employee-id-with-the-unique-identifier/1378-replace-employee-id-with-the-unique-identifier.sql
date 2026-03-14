select u.unique_id,e.name
from employees e
left join employeeUNI u using(id);
