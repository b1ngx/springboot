DROP TABLE IF EXISTS user;
CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name varchar(255) DEFAULT NULL,
    age int(11) DEFAULT NULL
);

INSERT INTO user (name, age) VALUES
  ('Aliko', 18),
  ('Bill', 20),
  ('Folrunsho', 30);