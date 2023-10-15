package co.edu.uniquindio.repositorios;

import co.edu.uniquindio.proyecto.modelo.entidades.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRep extends JpaRepository <Paciente, Integer> {

}
