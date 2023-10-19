package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.Cita;
import co.edu.uniquindio.proyecto.repositorios.CitaRepository;
import co.edu.uniquindio.proyecto.servicios.interfaces.CitaServicio;

import java.util.List;

public class CitaServicioImpl implements CitaServicio {



    private final CitaRepository repository;

    public CitaServicioImpl(CitaRepository repo){
        this.repository=repo;
    }


    @Override
    public Integer registrarCita(Cita a) throws Exception {
        return null;
    }

    @Override
    public Integer actualizarCita(Cita a) throws Exception {
        return null;
    }

    @Override
    public String eliminarCita(int id) throws Exception {
        return null;
    }

    @Override
    public Cita buscarCita(int id) throws Exception {
        return null;
    }

    @Override
    public List<Cita> listarCita() {
        return null;
    }
}
