package co.edu.uniquindio.proyecto.entidades;

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
    private Integer Cedula;
    private String email;
    private String password;
    private Integer acceso;

}
