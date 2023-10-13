package co.edu.uniquindio.proyecto.modelo.entidades;

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
    private int id;
    private LocalDateTime fecha;
    private String mensaje;

    private int pqrsId;//foreign key
    private int emisorCedula;//foreign key
    private int receptorCedula;//foreign key


}
