package co.edu.uniquindio.proyecto.servicios.interfaces;


import co.edu.uniquindio.proyecto.entidades.Comentario;

import java.util.List;

public interface ComentarioRepository {

    Integer registrarComentario(Comentario a)throws Exception;

    Integer actualizarComentario(Comentario a)throws Exception;

    String eliminarComentario(int id)throws Exception;

    Comentario buscarComentario(int id)throws Exception;

    List<Comentario> listarComentarios();

}
