package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.HistorialDescanso;
import co.edu.uniquindio.proyecto.repositorios.HistorialDescansoRepository;
import co.edu.uniquindio.proyecto.servicios.excepciones.AtributeException;
import co.edu.uniquindio.proyecto.servicios.interfaces.HistorialDescansoServicio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class HistorialDescansoServicioImpl implements HistorialDescansoServicio {



    private final HistorialDescansoRepository historialdescansorepo;

    public HistorialDescansoServicioImpl(HistorialDescansoRepository historialdescansoRepo){
        this.historialdescansorepo= historialdescansoRepo;
    }


    @Override
    public HistorialDescanso registrarHistorialDescanso(HistorialDescanso a) throws Exception {
        return  historialdescansorepo.save(a);
    }

    @Override
    public HistorialDescanso actualizarHistorialDescanso(HistorialDescanso a) throws Exception {
        Optional<HistorialDescanso> guardado = historialdescansorepo.findById(a.getId());
        if(guardado.isEmpty()){
            throw new AtributeException("No tiene Historial de descanso");
        }
        return historialdescansorepo.save(a);
    }

    @Override
    public void eliminarHistorialDescanso(int codigo) throws Exception {
        Optional<HistorialDescanso> guardado = historialdescansorepo.findById(codigo);
        if(guardado.isEmpty()){
            throw new AtributeException("El código "+codigo+" no está asociado a ningun historial de descanso");
        }
        historialdescansorepo.delete(guardado.get());
    }

    @Override
    public HistorialDescanso buscarHistorialDescanso(int codigo) throws Exception {
        Optional<HistorialDescanso> pqrs = historialdescansorepo.findById(codigo);

        if(pqrs.isEmpty()){
            throw new AtributeException("El código "+codigo+" no está asociado a ningun historial de descanso");
        }
        return pqrs.get();
    }

    @Override
    public List<HistorialDescanso> listarHistorialDescanso() {
        return historialdescansorepo.findAll();
    }


}
