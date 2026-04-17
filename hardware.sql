CREATE DATABASE IF NOT EXISTS hardware_db;
USE hardware_db;

DROP TABLE IF EXISTS hardware;
CREATE TABLE hardware (
    id INT PRIMARY KEY,
    brand VARCHAR(255),
    spec INT,
    type VARCHAR(50)
);

INSERT INTO hardware (id, brand, spec, type) VALUES 
(1, 'Dell XPS 13', 16, 'Laptop'),
(2, 'Samsung S24', 50, 'Phone'),
(3, 'MacBook Pro', 32, 'Laptop'),
(4, 'iPhone 15', 48, 'Phone'),
(5, 'ASUS Zenbook', 16, 'Laptop'),
(6, 'Google Pixel 8', 50, 'Phone'),
(7, 'Lenovo Legion', 32, 'Laptop'),
(8, 'Huawei P60', 48, 'Phone'),
(9, 'HP Spectre', 16, 'Laptop'),
(10, 'Sony Xperia', 16, 'Phone');


select * from hardware;
