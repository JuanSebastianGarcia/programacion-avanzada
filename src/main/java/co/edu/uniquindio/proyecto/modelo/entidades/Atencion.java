package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serial;
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
    private int id;
    private String diagnostico;
    private String tratamiento;

    private int citaId;//foreign key
    private int pqrsId;//foreign key

}
