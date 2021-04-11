# orbital

```sql
--global response latency (percentile in ms)
select
  dd.id,
  to_timestamp(dd.id, 'YYYYMMDDHH24MI'),
  coalesce(substr(split_part(value, '|', 1), 3)::integer, 0) p50,
  coalesce(substr(split_part(value, '|', 2), 3)::integer, 0) p75,
  coalesce(substr(split_part(value, '|', 3), 3)::integer, 0) p90,
  coalesce(substr(split_part(value, '|', 4), 3)::integer, 0) p95,
  coalesce(substr(split_part(value, '|', 5), 3)::integer, 0) p99
from all_percentile ap
right join (
  SELECT to_char(dd, 'YYYYMMDDHH24MI') id
  FROM generate_series (
    current_timestamp - '15 minutes'::interval,
    current_timestamp,
    '1 minute'::interval
  ) dd
) dd on (ap.id = dd.id);
```

![](misc/example.gif)
