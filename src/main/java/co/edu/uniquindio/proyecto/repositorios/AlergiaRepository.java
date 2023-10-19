package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.entidades.Alergia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlergiaRepository extends JpaRepository<Alergia,Integer> {

    Optional<Alergia> findByAlergia(String alergia);

}
