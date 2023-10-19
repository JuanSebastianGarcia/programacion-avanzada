package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.entidades.Atencion;
import co.edu.uniquindio.proyecto.entidades.Pqrs;

import java.util.List;

public interface PqrsServicio {


    public Pqrs registrarpqrs(Pqrs a) throws Exception;

    public Pqrs actualizarPqrs(Pqrs a) throws Exception;

    void eliminarPqrs(int codigo) throws Exception;

    Pqrs obtenerPqrs(int codigo) throws Exception;

    List<Pqrs> listarPqrs();


}
