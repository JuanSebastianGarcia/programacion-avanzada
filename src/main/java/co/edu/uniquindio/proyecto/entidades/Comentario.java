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
public class Comentario implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;

    @Column(name="fecha")
    private LocalDateTime fecha;

    @Column(name="mensaje")
    private String mensaje;


    private Integer pqrsId;//foreign key
    private Integer emisorCedula;//foreign key
    private Integer receptorCedula;//foreign key


}
