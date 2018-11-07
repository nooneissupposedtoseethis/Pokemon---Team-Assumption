package pokemonspring.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "attack")
public class Attack implements Serializable {

    @Id
    @Column(name="attack_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="attack_name")
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
