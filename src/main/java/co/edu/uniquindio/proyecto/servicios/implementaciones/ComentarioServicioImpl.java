package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.Comentario;
import co.edu.uniquindio.proyecto.repositorios.ComentarioRepository;
import co.edu.uniquindio.proyecto.servicios.excepciones.AttributeException;
import co.edu.uniquindio.proyecto.servicios.interfaces.ComentarioServicio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class ComentarioServicioImpl implements ComentarioServicio {

    private final ComentarioRepository repository;

    public ComentarioServicioImpl(ComentarioRepository repo){
        this.repository=repo;
    }


    @Override
    public Integer registrarComentario(Comentario a) throws Exception {
        return repository.save(a).getId();
    }

    @Override
    public Integer actualizarComentario(Comentario a) throws Exception {

        Optional<Comentario> buscado=repository.findById(a.getId());

        if(buscado.isEmpty()){
            throw new AttributeException("el comentario no existe");
        }

        repository.save(a);

        return a.getId();
    }

    @Override
    public String eliminarComentario(int id) throws Exception {

        Optional<Comentario> buscado=repository.findById(id);

        if(buscado.isEmpty()){
            throw new AttributeException("el comentario no existe");
        }

        repository.delete(buscado.get());

        return "se elimino";
    }

    @Override
    public Comentario buscarComentario(int id) throws Exception {
        Optional<Comentario> buscado=repository.findById(id);

        if(buscado.isEmpty()){
            throw new AttributeException("el comentario no existe");
        }
        return buscado.get();
    }

    @Override
    public List<Comentario> listarComentarios() {
        return repository.findAll();
    }
}
