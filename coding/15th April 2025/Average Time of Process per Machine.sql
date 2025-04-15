# Average Time of Process per Machine
SELECT machine_id, round((sum(case activity_type when 'end' then timestamp else 0 end)
                    -
                    sum(case activity_type when 'start' then timestamp else 0 end))
                    /count(distinct process_id) , 3) 
                    AS processing_time
FROM Activity
GROUP BY machine_id;
