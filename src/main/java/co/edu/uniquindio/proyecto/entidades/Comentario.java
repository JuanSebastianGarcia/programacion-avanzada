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


    @Column(name="pqrs_id")
    private Integer pqrsId;//foreign key

    @Column(name="administrador_cedula")
    private Integer administradorCedula;//foreign key

    @Column(name="paciente_cedula")
    private Integer pacienteCedula;//foreign key


}
