
    INSERT INTO pokemon(pokemon_name, pokemon_picture) VALUES
    ("Charmander","charmander.png"),("Squirtle","squirtle.png"),("Bulbasaur","bulbasaur.png");


    INSERT INTO attack(attack_name) VALUES
    ("Growl"),("Tackle"),("Scratch"),("Tail Whip");


    INSERT INTO type(type_name) VALUES
    ("Water"), ("Grass"), ("Poison"), ("Fire");



    INSERT INTO pokemon2attack(pokemon_id, attack_id) VALUES
    (1, 1),
    (1, 3),
    (2, 2),
    (2, 4),
    (3, 1),
    (3, 2);



    INSERT INTO pokemon2type(pokemon_id, type_id) VALUES
    (1, 4),
    (2, 1),
    (3, 2);