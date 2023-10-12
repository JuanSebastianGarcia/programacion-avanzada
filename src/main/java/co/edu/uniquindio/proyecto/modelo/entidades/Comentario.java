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
    private int emisorCedula;
    private int receptorCedula;
    private LocalDateTime fecha;
    private int pqrsId;

}
