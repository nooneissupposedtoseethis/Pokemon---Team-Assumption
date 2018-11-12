package pokemonspring.model.dto;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "name")
public class PokemonName implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long nameId;

    @NotBlank
    @Column
    private String pokemonName;

    public Long getId() {
        return nameId;
    }

    public String getName() {
        return pokemonName;
    }


    public void setName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

}
