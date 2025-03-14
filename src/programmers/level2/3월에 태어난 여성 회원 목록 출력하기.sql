select mf.member_id, mf.member_name, mf.gender, DATE_FORMAT(mf.date_of_birth, '%Y-%m-%d') AS DATE_OF_BIRTH
from member_profile as mf
where mf.tlno is not null and Month(mf.date_of_birth) = 3 and mf.gender = 'W'
order by mf.member_id;
