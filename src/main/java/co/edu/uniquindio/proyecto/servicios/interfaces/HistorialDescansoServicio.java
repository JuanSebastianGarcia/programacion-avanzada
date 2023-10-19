package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.entidades.HistorialDescanso;

import java.util.List;

public interface HistorialDescansoServicio {


    public HistorialDescanso registrarHistorialDescanso(HistorialDescanso a)throws Exception;

    public HistorialDescanso actualizarHistorialDescanso(HistorialDescanso a)throws Exception;

    void eliminarHistorialDescanso(int id)throws Exception;

    HistorialDescanso buscarHistorialDescanso(int id)throws Exception;

    List<HistorialDescanso> listarHistorialDescanso();

}
