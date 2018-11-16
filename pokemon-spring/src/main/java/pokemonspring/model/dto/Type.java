package pokemonspring.model.dto;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name ="type")
public class Type implements Serializable{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeId;

    @Column
    private String typeName;

  /*  @ManyToMany(mappedBy="types") //<-Variable name
    private List<Pokemon> pokemonNames;*/
/*
    @OneToOne(mappedBy="type") //<- Table name
    private Attack attack;*/

    public Long getId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

   /* public List<Pokemon> getPokemonNames() {
        return pokemonNames;
    }

    public void setPokemonNames(List<Pokemon> pokemonNames) {
        this.pokemonNames = pokemonNames;
    }*/

  /*  public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }*/
}
