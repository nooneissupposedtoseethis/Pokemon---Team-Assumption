package pokemonspring.model.dto;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "attack")
public class Attack implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attackId;

    @NotBlank
    @Column
    private String attackName;

    public Long getId() {
        return attackId;
    }

    public String getName() {
        return attackName;
    }

    public void setName(String attackName) {
        this.attackName = attackName;
    }

 
}
