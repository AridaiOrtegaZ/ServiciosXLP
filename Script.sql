CREATE DATABASE IF NOT EXISTS biblioteca;
USE biblioteca;
CREATE USER IF NOT EXISTS '789xxx'@'%' IDENTIFIED BY '123456';
GRANT ALL PRIVILEGES ON todolist.* TO '789xxx'@'%';
FLUSH PRIVILEGES;