package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.Eps;
import co.edu.uniquindio.proyecto.repositorios.EpsRepository;
import co.edu.uniquindio.proyecto.servicios.excepciones.AtributeException;
import co.edu.uniquindio.proyecto.servicios.interfaces.EpsServicio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class EpsServicioImpl implements EpsServicio {

    private final EpsRepository epsrepo;

    public EpsServicioImpl(EpsRepository epsRepo){
        this.epsrepo= epsRepo;

    }


    @Override
    public Eps registrarEps(Eps a) throws Exception {
        return  epsrepo.save(a);

    }

    @Override
    public Eps actualizarEps(Eps a) throws Exception {
        Optional<Eps> guardado = epsrepo.findById(a.getId());
        if(guardado.isEmpty()){
            throw new AtributeException("No tiene EPS");
        }
        return epsrepo.save(a);

    }

    @Override
    public void eliminarEps(int codigo) throws Exception {
        Optional<Eps> guardado = epsrepo.findById(codigo);
        if(guardado.isEmpty()){
            throw new AtributeException("El código "+codigo+" no está asociado a ninguna EPS");
        }
        epsrepo.delete(guardado.get());

    }

    @Override
    public Eps obtenerEps(int codigo) throws Exception {
        Optional<Eps> pqrs = epsrepo.findById(codigo);

        if(pqrs.isEmpty()){
            throw new AtributeException("El código "+codigo+" no está asociado a ninguna EPS");
        }
        return pqrs.get();

    }

    @Override

    public List<Eps> listarEps() {
        return epsrepo.findAll();

    }






}
