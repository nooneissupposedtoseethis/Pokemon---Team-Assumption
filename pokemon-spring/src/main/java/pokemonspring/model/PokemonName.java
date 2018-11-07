package pokemonspring.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "name")
public class PokemonName implements Serializable {

    @Id
    @Column(name="name_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name="pokemon_name")
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

}
