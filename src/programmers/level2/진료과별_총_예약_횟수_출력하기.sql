select a.MCDP_CD as '진료과코드', count(*) as '5월예약건수' from APPOINTMENT a
where YEAR(a.APNT_YMD) = 2022 and MONTH (a.APNT_YMD) = 5
group by a.MCDP_CD
order by count(*), a.MCDP_CD;