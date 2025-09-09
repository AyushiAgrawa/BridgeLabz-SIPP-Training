CREATE DATABASE cab_service;
USE cab_service;

CREATE TABLE rides (
    ride_id INT AUTO_INCREMENT PRIMARY KEY,
    distance DOUBLE NOT NULL,
    time_taken INT NOT NULL,
    type VARCHAR(20) NOT NULL,
    fare DOUBLE NOT NULL,
    ride_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO rides (distance, time_taken, type, fare)
VALUES
(5.0, 10, 'Normal', 60.0),
(12.5, 25, 'Premium', 220.0),
(2.0, 5, 'Normal', 25.0);

SELECT * FROM rides;

SELECT SUM(fare) AS total_fare FROM rides;

SELECT AVG(fare) AS average_fare FROM rides;

SELECT COUNT(*) AS total_rides FROM rides;
