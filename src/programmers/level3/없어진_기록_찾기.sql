select ao.animal_id, ao.name
from animal_outs ao
where ao.animal_id not in (select ai.animal_id from animal_ins ai)
order by ao.animal_id