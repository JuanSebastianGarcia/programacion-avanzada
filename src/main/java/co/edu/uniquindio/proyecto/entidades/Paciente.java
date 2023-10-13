package co.edu.uniquindio.proyecto.entidades;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Paciente implements Serializable{

    @Id
    @EqualsAndHashCode.Include
    private Integer cedula;

    @ElementCollection
    private List<String> telefono;

    private String nombre;
    private String email;
    private String password;
    private String ciudadResidencia;
    private LocalDate fechaNacimiento;
    private String grupoSanguineo;
    private Integer acceso;

    @ElementCollection
    private List<Integer> alergias;
    private Integer epsId;//foreign key


}
