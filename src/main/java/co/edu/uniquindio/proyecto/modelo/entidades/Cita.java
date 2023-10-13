package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Cita implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private int id;

    private String estado;
    private String motivo;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaHoraCita;

    private int medicoCedula;//foreign key
    private int pacienteCedula;//foreign key


}
