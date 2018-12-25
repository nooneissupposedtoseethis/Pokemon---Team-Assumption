
    CREATE TABLE pokemon(
    pokemon_id BIGINT AUTO_INCREMENT,
    pokemon_name VARCHAR(40),
    pokemon_picture VARCHAR(120),
    primary key(pokemon_id)
    );

    CREATE TABLE attack(
    attack_id BIGINT AUTO_INCREMENT,
    attack_name VARCHAR(40),
    primary key(attack_id)
    );

    CREATE TABLE type(
    type_id BIGINT AUTO_INCREMENT,
    type_name VARCHAR(40),
    primary key(type_id)
    );

    CREATE TABLE pokemon2attack(
    pokemon_id BIGINT,
    attack_id BIGINT, 
    foreign key(attack_id) references attack(attack_id),
    foreign key(pokemon_id) references pokemon(pokemon_id)
    );

    CREATE TABLE pokemon2type(
    pokemon_id BIGINT,
    type_id BIGINT, 
    foreign key(type_id) references type(type_id),
    foreign key(pokemon_id) references pokemon(pokemon_id)
    );
