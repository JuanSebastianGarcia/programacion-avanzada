package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.entidades.Alergia;
import co.edu.uniquindio.proyecto.entidades.Atencion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AtencionRepository extends JpaRepository<Atencion,Integer> {

    Optional<Atencion> findByCitaId(Integer citaId);

}
