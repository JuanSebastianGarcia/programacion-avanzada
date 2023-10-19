package co.edu.uniquindio.proyecto.servicios.interfaces;


import co.edu.uniquindio.proyecto.entidades.Cita;

import java.util.List;

public interface CitaServicio {


    Integer registrarCita(Cita a)throws Exception;

    Integer actualizarCita(Cita a)throws Exception;

    String eliminarCita(int id)throws Exception;

    Cita buscarCita(int id)throws Exception;

    List<Cita> listarCita();

}
