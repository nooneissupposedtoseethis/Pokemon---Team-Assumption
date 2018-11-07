package pokemonspring.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="type")
public class Type implements Serializable{
    @Id
    @Column(name="type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="type_name")
    private String type;

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
