package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.Alergia;
import co.edu.uniquindio.proyecto.repositorios.AlergiaRepository;
import co.edu.uniquindio.proyecto.servicios.interfaces.AlergiaServicio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class AlergiaServicioImpl implements AlergiaServicio {


    private final AlergiaRepository repository;

    public AlergiaServicioImpl(AlergiaRepository repo){
        this.repository=repo;
    }


    @Override
    public Integer registrarAlergia(Alergia a) throws Exception {
        return null;
    }

    @Override
    public Integer actualizarAlergia(Alergia a) throws Exception {
        return null;
    }

    @Override
    public String eliminarAlergia(int id) throws Exception {
        return null;
    }

    @Override
    public Alergia buscarAlergia(int id) throws Exception {
        return null;
    }

    @Override
    public List<Alergia> listarAlergias() {
        return null;
    }
}
