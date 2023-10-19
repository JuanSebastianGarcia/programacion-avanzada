package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.Alergia;
import co.edu.uniquindio.proyecto.repositorios.AlergiaRepository;
import co.edu.uniquindio.proyecto.servicios.excepciones.AttributeException;
import co.edu.uniquindio.proyecto.servicios.interfaces.AlergiaServicio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class AlergiaServicioImpl implements AlergiaServicio {


    private final AlergiaRepository repository;

    public AlergiaServicioImpl(AlergiaRepository repo){
        this.repository=repo;
    }



    //______________METODOS PRINCIPALES__________________//
    @Override
    public Integer registrarAlergia(Alergia a) throws Exception {

        Optional<Alergia> buscado=repository.findByAlergia(a.getAlergia());

        if(!buscado.isEmpty()){
            throw new AttributeException("la alergia ya existe");
        }


        return repository.save(a).getId();
    }

    @Override
    public Integer actualizarAlergia(Alergia a) throws Exception {

        Optional<Alergia> buscado=repository.findByAlergia(a.getAlergia());

        if(buscado.isEmpty()){
            throw new AttributeException("la alergia no se encuentra");
        }

        return repository.save(a).getId();
    }

    @Override
    public String eliminarAlergia(String alergia) throws Exception {

        Optional<Alergia> buscado=repository.findByAlergia(alergia);

        if(buscado.isEmpty()){
            throw new AttributeException("no se encuentra la alergia");
        }

        repository.delete(buscado.get());

        return "se elimino";
    }

    @Override
    public Alergia buscarAlergia(String alergia) throws Exception {

        Optional<Alergia> buscado=repository.findByAlergia(alergia);

        if(buscado.isEmpty()){
            throw new AttributeException("no se encontro la alergia");
        }
        return buscado.get();
    }

    @Override
    public List<Alergia> listarAlergias() {
        return repository.findAll();
    }



    //_____________METODOS DE PROCESO_____________________//

}
