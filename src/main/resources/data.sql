
INSERT INTO users (birthdate, email, first_name, last_name) 
VALUES ('1995-05-15', 'jan.kowalski@wp.pl', 'Jan', 'Kowalski');


INSERT INTO statistics (user_id, total_trainings, total_distance, total_calories_burned) 
VALUES (1, 10, 50.5, 3000);


INSERT INTO trainings (user_id, start_time, end_time, activity_type, distance, average_speed) 
VALUES (1, '2026-03-27 10:00:00', '2026-03-27 11:00:00', 'RUNNING', 10.2, 10.2);


INSERT INTO health_metrics (user_id, date, weight, height, heart_rate) 
VALUES (1, '2026-03-28', 80.0, 185.0, 70);