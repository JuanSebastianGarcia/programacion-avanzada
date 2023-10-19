package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.Pqrs;
import co.edu.uniquindio.proyecto.repositorios.PqrsRespository;
import co.edu.uniquindio.proyecto.servicios.excepciones.AtributeException;
import co.edu.uniquindio.proyecto.servicios.interfaces.PqrsServicio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class PqrsServicioImpl implements PqrsServicio {


    private final PqrsRespository pqrsrepo;

    public PqrsServicioImpl(PqrsRespository pqrsRepo) {

        this.pqrsrepo = pqrsRepo;
    }

    @Override
    public Pqrs registrarpqrs(Pqrs a) throws Exception {
        return  pqrsrepo.save(a);
    }

    @Override
    public Pqrs actualizarPqrs(Pqrs a) throws Exception {
        Optional<Pqrs> guardado = pqrsrepo.findById(a.getId());
        if(guardado.isEmpty()){
            throw new AtributeException("La pqrs no existe");
        }
        return pqrsrepo.save(a);
    }

    @Override
    public void eliminarPqrs(int codigo) throws Exception {
        Optional<Pqrs> guardado = pqrsrepo.findById(codigo);
        if(guardado.isEmpty()){
            throw new AtributeException("El código "+codigo+" no está asociado a ninguna pqrs");
        }
        pqrsrepo.delete(guardado.get());
    }

    @Override
    public Pqrs obtenerPqrs(int codigo) throws Exception {
        Optional<Pqrs> pqrs = pqrsrepo.findById(codigo);

        if(pqrs.isEmpty()){
            throw new AtributeException("El código "+codigo+" no está asociado a ninguna pqrs");
        }
        return pqrs.get();
    }

    @Override
    public List<Pqrs> listarPqrs() {
        return pqrsrepo.findAll();
    }
}
