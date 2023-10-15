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
public class Pqrs implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    private int id;
    private String estado;
    private String tipo;
    private LocalDateTime fechaCreacion;

}