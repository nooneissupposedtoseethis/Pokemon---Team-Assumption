package pokemonspring.model.dto;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pokemonId;

    @Autowired
    private PokemonName pokemonName;

    @Autowired
    @ManyToMany(mappedBy = "attackName")
    private List<Attack> pokemonAttacks;

    @Autowired
    @ManyToMany(mappedBy = "typeName")
    private List<Type> pokemonTypes;

    private String pokemonPicture;

    public PokemonName getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(PokemonName pokemonName) {
        this.pokemonName = pokemonName;
    }

    public List<Attack> getPokemonAttacks() {
        return pokemonAttacks;
    }

    public void setPokemonAttacks(List<Attack> pokemonAttacks) {
        this.pokemonAttacks = pokemonAttacks;
    }

    public List<Type> getPokemonTypes() {
        return pokemonTypes;
    }

    public void setPokemonTypes(List<Type> pokemonTypes) {
        this.pokemonTypes = pokemonTypes;
    }

    public String getPokemonPicture() {
        return pokemonPicture;
    }

    public void setPokemonPicture(String pokemonPicture) {
        this.pokemonPicture = pokemonPicture;
    }
}
