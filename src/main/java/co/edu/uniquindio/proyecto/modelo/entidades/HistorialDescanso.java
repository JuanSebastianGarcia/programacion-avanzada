package co.edu.uniquindio.proyecto.modelo.entidades;

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
    private int id;
    private LocalDate fecha;

    private String cedulaMedico;//foreign key



}
