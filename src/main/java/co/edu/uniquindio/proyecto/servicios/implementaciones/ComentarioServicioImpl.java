package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.Comentario;
import co.edu.uniquindio.proyecto.repositorios.ComentarioRepository;
import co.edu.uniquindio.proyecto.servicios.interfaces.ComentarioServicio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class ComentarioServicioImpl implements ComentarioServicio {

    private final ComentarioRepository repository;

    public ComentarioServicioImpl(ComentarioRepository repo){
        this.repository=repo;
    }


    @Override
    public Integer registrarComentario(Comentario a) throws Exception {
        return null;
    }

    @Override
    public Integer actualizarComentario(Comentario a) throws Exception {
        return null;
    }

    @Override
    public String eliminarComentario(int id) throws Exception {
        return null;
    }

    @Override
    public Comentario buscarComentario(int id) throws Exception {
        return null;
    }

    @Override
    public List<Comentario> listarComentarios() {
        return null;
    }
}
