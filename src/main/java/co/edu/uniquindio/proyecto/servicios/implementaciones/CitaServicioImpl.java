package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.Cita;
import co.edu.uniquindio.proyecto.repositorios.CitaRepository;
import co.edu.uniquindio.proyecto.servicios.excepciones.AttributeException;
import co.edu.uniquindio.proyecto.servicios.interfaces.CitaServicio;
import jakarta.transaction.Transactional;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class CitaServicioImpl implements CitaServicio {



    private final CitaRepository repository;

    public CitaServicioImpl(CitaRepository repo){
        this.repository=repo;
    }


    @Override
    public Integer registrarCita(Cita a) throws Exception {
        return repository.save(a).getId();
    }

    @Override
    public Integer actualizarCita(Cita a) throws Exception {

        Optional<Cita> buscado=repository.findById(a.getId());

        if(buscado.isEmpty()){
            throw new AttributeException("la cita no se encuentra");
        }


        return repository.save(a).getId();
    }

    @Override
    public String eliminarCita(int id) throws Exception {
        Optional<Cita> buscado=repository.findById(id);

        if(buscado.isEmpty()){
            throw new AttributeException("la cita no se encuentra");
        }
        repository.delete(buscado.get());
        return "se elimino";
    }

    @Override
    public Cita buscarCita(int id) throws Exception {
        Optional<Cita> buscado=repository.findById(id);

        if(buscado.isEmpty()){
            throw new AttributeException("la cita no se encuentra");
        }
        return buscado.get();
    }

    @Override
    public List<Cita> listarCita() {
        return repository.findAll();
    }
}
