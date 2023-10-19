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
public class Pqrs implements Serializable{

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;

    @Column(name="estado")
    private String estado;

    @Column(name="tipo")
    private String tipo;

    @Column(name="fecha_creacion")
    private LocalDateTime fechaCreacion;

}
