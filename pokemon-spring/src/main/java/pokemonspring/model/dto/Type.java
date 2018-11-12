package pokemonspring.model.dto;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name ="type")
public class Type implements Serializable{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeId;

    @NotBlank
    @Column
    private String typeName;

    public Long getId() {
        return typeId;
    }

    public String getType() {
        return typeName;
    }

    public void setType(String typeName) {
        this.typeName = typeName;
    }
}
