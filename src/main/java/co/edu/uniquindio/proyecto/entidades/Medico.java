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
public class Medico implements Serializable{

    //atributos
    @Id
    @EqualsAndHashCode.Include
    @Column(name="cedula")
    private Integer cedula;

    @Column(name="telefono")
    private String telefono;

    @Column(name="nombre")
    private String nombre;

    @Column(name="pass_word")
    private String passWord;

    @Column(name="email")
    private String email;

    @Column(name="ciudad_residencia")
    private String CiudadResidencia;

    @Column(name="especialidad")
    private String especialidad;

    @Column(name="hora_entrada")
    private LocalDateTime hotaEntrada;

    @Column(name="hora_salida")
    private LocalDateTime horaSalida;

    @Column(name="acceso")
    private Integer acceso;




}
