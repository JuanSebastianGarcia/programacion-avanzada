package co.edu.uniquindio.proyecto.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
    @GeneratedValue
    @Column(name="id")
    private Integer id;

    @Column(name="diagnostico")
    private String diagnostico;

    @Column(name="tratamiento")
    private String tratamiento;

    @Column(name="cita_id")
    private Integer citaId;//foreign key

    @Column(name="pqrs_id")
    private Integer pqrsId;//foreign key

}
