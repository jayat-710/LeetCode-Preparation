# Write your MySQL query statement below

SELECT class
FROM courses
GROUP BY class
HAVING count(class)>=5