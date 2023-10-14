package co.edu.uniquindio.proyecto.entidades;

import jakarta.persistence.Column;
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
    @Column(name="cedula")
    private Integer cedula;

    @ElementCollection
    private List<String> telefono;

    @Column(name="nombre")
    private String nombre;

    @Column(name="email")
    private String email;

    @Column(name="pass_word")
    private String passWord;

    @Column(name="ciudad_residencia")
    private String ciudadResidencia;

    @Column(name="fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name="grupo_sanguineo")
    private String grupoSanguineo;

    @Column(name="acceso")
    private Integer acceso;

    @ElementCollection
    private List<Integer> alergias;


    private Integer epsId;//foreign key


}
