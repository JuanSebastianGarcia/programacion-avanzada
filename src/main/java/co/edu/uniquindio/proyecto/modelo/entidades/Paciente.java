package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Paciente implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private int cedula;

    @ElementCollection
    private List<String> telefono;

    private String nombre;
    private String email;
    private String password;
    private String ciudadResidencia;
    private LocalDate fechaNacimiento;
    private String grupoSanguineo;
    private int acceso;
    @ElementCollection
    private List<Integer> alergias;


}
