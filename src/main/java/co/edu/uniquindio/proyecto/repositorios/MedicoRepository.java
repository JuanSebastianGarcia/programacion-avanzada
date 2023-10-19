package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.entidades.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MedicoRepository extends JpaRepository<Medico,Integer> {

    @Query("select u from Medico u where u.email= ?1")
    Medico obtener(String correo);

    @Query("select u from Medico u where u.email= :correo and u.passWord= :Password")
    Medico ComprobarAutenticacion(String correo, String Password);

    Optional<Medico> findByEmail(String email);
}
