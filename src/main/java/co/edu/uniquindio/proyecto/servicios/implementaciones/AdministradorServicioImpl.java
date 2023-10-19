package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.Administrador;
import co.edu.uniquindio.proyecto.repositorios.AdministradorRepository;
import co.edu.uniquindio.proyecto.servicios.interfaces.AdministradorServicio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class AdministradorServicioImpl implements AdministradorServicio {

    private final AdministradorRepository repository;

    public AdministradorServicioImpl(AdministradorRepository repo){
        this.repository=repo;
    }


    @Override
    public Integer registrarAdministrador(Administrador a) throws Exception {
        return null;
    }

    @Override
    public Integer actualizarAdministrador(Administrador a) throws Exception {
        return null;
    }

    @Override
    public String eliminarAdministrador(int id) throws Exception {
        return null;
    }

    @Override
    public Administrador buscarAdministrador(int id) throws Exception {
        return null;
    }

    @Override
    public List<Administrador> listarAdministradores() {
        return null;
    }


}
