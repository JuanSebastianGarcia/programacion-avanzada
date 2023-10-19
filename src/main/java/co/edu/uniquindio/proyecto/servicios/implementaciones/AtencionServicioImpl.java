package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.Atencion;
import co.edu.uniquindio.proyecto.repositorios.AtencionRepository;
import co.edu.uniquindio.proyecto.servicios.excepciones.AttributeException;
import co.edu.uniquindio.proyecto.servicios.interfaces.AtencionServicio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class AtencionServicioImpl implements AtencionServicio {

    private final AtencionRepository repository;

    public AtencionServicioImpl(AtencionRepository repo){
        this.repository=repo;
    }





    @Override
    public Integer registrarAtencion(Atencion a) throws Exception {

        Optional<Atencion> buscado=repository.findByCitaId(a.getCitaId());

        if(!buscado.isEmpty()){
            throw new AttributeException("la cita ya paso por una consulta");
        }

        return repository.save(a).getId();
    }

    @Override
    public Integer actualizarAtencion(Atencion a) throws Exception {

        Optional<Atencion> buscado=repository.findByCitaId(a.getCitaId());

        if(buscado.isEmpty()){
            throw new AttributeException("no se encuentra la atencion");
        }


        return repository.save(a).getId();
    }

    @Override
    public String eliminarAtencion(int id) throws Exception {

        Optional<Atencion> buscado=repository.findByCitaId(id);

        if(buscado.isEmpty()){
            throw new AttributeException("no se encuentra la atencion");
        }

        repository.delete(buscado.get());

        return "se elimino";
    }

    @Override
    public Atencion buscarAtencion(int id) throws Exception {

        Optional<Atencion> buscado=repository.findByCitaId(id);

        if(buscado.isEmpty()){
            throw new AttributeException("no se encuentra la atencion");
        }

        return buscado.get();
    }

    @Override
    public List<Atencion> listarAtencion() {
        return repository.findAll();
    }
}
