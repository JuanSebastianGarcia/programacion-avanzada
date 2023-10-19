package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.entidades.Administrador;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.util.List;

public interface AdministradorServicio {

    Integer registrarAdministrador(Administrador a)throws Exception;

    Integer actualizarAdministrador(Administrador a)throws Exception;

    void eliminarAdministrador(int id)throws Exception;

    Administrador buscarAdministrador(int id)throws Exception;

    List<Administrador> listarAdministradores();

}
