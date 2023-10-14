package co.edu.uniquindio.proyecto.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Cita implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue
    @Column(name="id")
    private Integer id;

    @Column(name="estado")
    private String estado;

    @Column(name="motivo")
    private String motivo;

    @Column(name="fecha_creacion")
    private LocalDateTime fechaCreacion;

    @Column(name="fecha_hora_cita")
    private LocalDateTime fechaHoraCita;


    private Integer medicoCedula;//foreign key
    private Integer pacienteCedula;//foreign key


}
