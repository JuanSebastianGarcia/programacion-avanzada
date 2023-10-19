package co.edu.uniquindio.proyecto.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Eps implements Serializable{

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;

    @Column(name="nombre")
    private String nombre;


}
