package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.entidades.Medico;

import java.util.List;

public interface MedicoServicio {


    public Medico registrarMedico(Medico a) throws Exception;

    public Medico actualizarMedico(Medico a) throws Exception;

    void eliminarMedico(int codigo) throws Exception;

    Medico obtenerMedico(int codigo) throws Exception;

    List<Medico> listarMedicos();
}
