package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.entidades.Eps;

import java.util.List;

public interface EpsServicio {

    public Eps registrarEps(Eps a) throws Exception;

    public Eps actualizarEps(Eps a) throws Exception;

    void eliminarEps(int codigo) throws Exception;

    Eps obtenerEps(int codigo) throws Exception;

    List<Eps> listarEps();
}
