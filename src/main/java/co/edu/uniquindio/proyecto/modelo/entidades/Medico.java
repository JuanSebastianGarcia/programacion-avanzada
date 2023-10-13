package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Medico implements Serializable{

    //atributos
    @Id
    @EqualsAndHashCode.Include
    private int cedula;

    private String telefono;
    private String nombre;
    private String password;
    private String email;
    private String CiudadResidencia;
    private String especialidad;
    private LocalDateTime hotaEntrada;
    private LocalDateTime horaSalida;
    private int acceso;




}
