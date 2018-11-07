USE jackectw_pokemondb;

CREATE TABLE name(
name_id INT AUTO_INCREMENT,
pokemon_name VARCHAR(40),
primary key(name_id)
);


CREATE TABLE attack(
attack_id INT AUTO_INCREMENT,
attack_name VARCHAR(40),
attack_type VARCHAR(40),
primary key(attack_id)
);


CREATE TABLE type(
type_id INT AUTO_INCREMENT,
type_name VARCHAR(40),
primary key(type_id)
);
