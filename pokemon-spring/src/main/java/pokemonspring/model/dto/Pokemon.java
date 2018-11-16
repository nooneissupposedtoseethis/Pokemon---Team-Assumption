package pokemonspring.model.dto;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pokemon {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pokemonId;

    @Column
    private String pokemonName;

    @Column
    private String pokemonPicture;

    @ManyToMany
    @JoinTable(name="pokemon2attack",
            joinColumns = {@JoinColumn(name="pokemon_id")},
            inverseJoinColumns = {@JoinColumn(name = "attack_id")}) //Table name and join column names
    private List<Attack> attacks;

    @ManyToMany
    @JoinTable(name = "pokemon2type",
            joinColumns = {@JoinColumn(name="pokemon_id")},
            inverseJoinColumns = {@JoinColumn(name = "type_id")}) //Table name and join column names
    private List<Type> types;

    public Long getPokemonId() {
        return pokemonId;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getPokemonPicture() {
        return pokemonPicture;
    }

    public void setPokemonPicture(String pokemonPicture) {
        this.pokemonPicture = pokemonPicture;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }
}
