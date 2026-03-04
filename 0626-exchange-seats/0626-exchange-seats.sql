SELECT 
    id,
    CASE
        WHEN id % 2 = 1 AND id + 1 <= (SELECT MAX(id) FROM Seat)
            THEN (SELECT student FROM Seat s2 WHERE s2.id = Seat.id + 1)
        WHEN id % 2 = 0
            THEN (SELECT student FROM Seat s2 WHERE s2.id = Seat.id - 1)
        ELSE student
    END AS student
FROM Seat
ORDER BY id;