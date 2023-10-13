package co.edu.uniquindio.proyecto.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Atencion implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;
    private String diagnostico;
    private String tratamiento;

    private Integer citaId;//foreign key
    private Integer pqrsId;//foreign key

}
