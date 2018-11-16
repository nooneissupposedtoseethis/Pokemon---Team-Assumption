package pokemonspring.model.dto;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "attack")
public class Attack implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attackId;

    @Column
    private String attackName;

  /*  @ManyToMany(mappedBy = "attacks") //variable name
    private List<Pokemon> pokemonNames;*/

    @OneToOne
    @JoinColumn(name="attack_id") //table column name
    private Type type;

    public Long getId() {
        return attackId;
    }

    public String getAttackName() {
        return attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

 /*   public List<Pokemon> getPokemonNames() {
        return pokemonNames;
    }

    public void setPokemonNames(List<Pokemon> pokemonNames) {
        this.pokemonNames = pokemonNames;
    }*/

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
