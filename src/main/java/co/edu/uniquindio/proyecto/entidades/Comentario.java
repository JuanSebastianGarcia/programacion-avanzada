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
public class Comentario implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;
    private LocalDateTime fecha;
    private String mensaje;

    private Integer pqrsId;//foreign key
    private Integer emisorCedula;//foreign key
    private Integer receptorCedula;//foreign key


}
