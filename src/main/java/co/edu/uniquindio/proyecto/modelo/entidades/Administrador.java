package co.edu.uniquindio.proyecto.modelo.entidades;

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
public class Administrador implements Serializable {

    
    @EqualsAndHashCode.Include
    @Id
    private int Cedula;
    private String email;
    private String password;
    private int acceso;

}
