select name 
from SalesPerson
where sales_id not in (
    select sales_id 
    from Orders o
    where com_id = (
        select com_id 
        from company 
        where name="red"
    )
);