select ai.animal_id, ai.name from animal_ins ai
where ai.intake_condition = "Sick"
order by ai.animal_id;
