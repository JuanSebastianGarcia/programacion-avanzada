package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.Atencion;
import co.edu.uniquindio.proyecto.repositorios.AtencionRepository;
import co.edu.uniquindio.proyecto.servicios.interfaces.AtencionServicio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class AtencionServicioImpl implements AtencionServicio {

    private final AtencionRepository repository;

    public AtencionServicioImpl(AtencionRepository repo){
        this.repository=repo;
    }





    @Override
    public Integer registrarAtencion(Atencion a) throws Exception {
        return null;
    }

    @Override
    public Integer actualizarAtencion(Atencion a) throws Exception {
        return null;
    }

    @Override
    public String eliminarAtencion(int id) throws Exception {
        return null;
    }

    @Override
    public Atencion buscarAtencion(int id) throws Exception {
        return null;
    }

    @Override
    public List<Atencion> listarAtencion() {
        return null;
    }
}
