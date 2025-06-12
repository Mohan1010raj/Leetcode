# Write your MySQL query statement below
select c.name from Customer as c 
where coalesce(c.referee_id,0)<> 2;