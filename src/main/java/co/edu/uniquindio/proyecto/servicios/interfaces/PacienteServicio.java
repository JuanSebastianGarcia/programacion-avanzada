package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.entidades.Atencion;
import co.edu.uniquindio.proyecto.entidades.Paciente;

import java.util.List;

public interface PacienteServicio {


    public Paciente registrarPaciente(Paciente a) throws Exception;
    public Paciente actualizarPaciente(Paciente a) throws Exception;
    void eliminarPaciente(int codigo) throws Exception;
    Paciente obtenerPaciente(int codigo) throws Exception;
    List<Paciente> listarPacientes();
}
