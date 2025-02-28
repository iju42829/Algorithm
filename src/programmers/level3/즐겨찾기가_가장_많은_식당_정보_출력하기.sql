select r.food_type, r.rest_id, r.rest_name, r.favorites
from rest_info r
where (r.food_type, r.favorites) in
      (select ri.food_type, max(ri.favorites) from rest_info ri group by ri.food_type)
order by r.food_type desc;