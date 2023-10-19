package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.entidades.Atencion;

import java.util.List;

public interface AtencionServicio {


    Integer registrarAtencion(Atencion a)throws Exception;

    Integer actualizarAtencion(Atencion a)throws Exception;

    String eliminarAtencion(int id)throws Exception;

    Atencion buscarAtencion(int id)throws Exception;

    List<Atencion> listarAtencion();

}
