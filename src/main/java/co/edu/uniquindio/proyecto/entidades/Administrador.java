package co.edu.uniquindio.proyecto.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Administrador implements Serializable{

    
    @EqualsAndHashCode.Include
    @Id
    @Column(name="cedula" )
    private Integer Cedula;

    @Column(name="email")
    private String email;

    @Column(name="pass_word")
    private String passWord;

    @Column(name="acceso")
    private Integer acceso;

    @Column(name="nombre")
    private String nombre;


}
