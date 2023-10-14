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
public class Alergia implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;

    @Column(name="alergia")
    private String alergia;



}
