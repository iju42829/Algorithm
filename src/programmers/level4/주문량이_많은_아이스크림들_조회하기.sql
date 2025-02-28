select fh.flavor
from first_half fh
    inner join (select flavor, sum(total_order) as total_order from july group by flavor) j on fh.flavor = j.flavor
order by fh.total_order + j.total_order desc limit 3