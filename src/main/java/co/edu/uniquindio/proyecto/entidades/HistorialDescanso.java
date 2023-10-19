package co.edu.uniquindio.proyecto.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Setter
@Getter
@NoArgsConstructor
@Entity
public class HistorialDescanso implements Serializable {

    @EqualsAndHashCode.Include
    @GeneratedValue
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="fecha")
    private LocalDate fecha;

    @Column(name="medico_cedula")
    private String medicoCedula;//foreign key



}
