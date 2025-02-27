select a.animal_type as ANIMAL_TYPE, count(*) as count
    from animal_ins a
        group by a.animal_type
        order by a.animal_type;