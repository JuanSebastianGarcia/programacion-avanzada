package co.edu.uniquindio.proyecto.entidades;

import jakarta.persistence.Entity;
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
    private Integer id;

    private String estado;
    private String motivo;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaHoraCita;

    private Integer medicoCedula;//foreign key
    private Integer pacienteCedula;//foreign key


}
