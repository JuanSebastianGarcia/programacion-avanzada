package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.entidades.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Integer> {


    @Query("select u from Paciente u where u.email = :correo and u.passWord = :password")

    Paciente ComprobarAutenticacion(@Param("correo") String correo, @Param("password") String Password);

    Optional<Paciente> findByEmail(String email);
}
