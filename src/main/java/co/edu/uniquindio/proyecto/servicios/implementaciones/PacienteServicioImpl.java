package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.Paciente;
import co.edu.uniquindio.proyecto.repositorios.PacienteRepository;
import co.edu.uniquindio.proyecto.servicios.excepciones.AtributeException;
import co.edu.uniquindio.proyecto.servicios.interfaces.PacienteServicio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class PacienteServicioImpl implements PacienteServicio {

    private final PacienteRepository repositorio;

    public PacienteServicioImpl(PacienteRepository pacienteRepo) {

        this.repositorio = pacienteRepo;
    }

    @Override
    public Paciente registrarPaciente(Paciente a) throws Exception {
        if(!estaDisponible(a.getEmail())){
            throw new AtributeException("El correo "+a.getEmail()+" ya está en uso");
        }

        return  repositorio.save(a);

    }
    public boolean estaDisponible(String email){
        Optional<Paciente> paciente = repositorio.findByEmail(email);
        return paciente.isEmpty();
    }


    @Override
    public Paciente actualizarPaciente(Paciente a) throws Exception {
        Optional<Paciente> guardado = repositorio.findById(a.getCedula());
        if(guardado.isEmpty()){
            throw new AtributeException("El paciente no existe");
        }
        return repositorio.save(a);
    }

    @Override
    public void eliminarPaciente(int codigo) throws Exception {
        Optional<Paciente> guardado = repositorio.findById(codigo);
        if(guardado.isEmpty()){
            throw new AtributeException("El código "+codigo+" no está asociado a ningun paciente");
        }
        repositorio.delete(guardado.get());
    }

    @Override
    public Paciente obtenerPaciente(int codigo) throws Exception {
        Optional<Paciente> paciente = repositorio.findById(codigo);

        if(paciente.isEmpty()){
            throw new AtributeException("El código "+codigo+" no está asociado a ningún paciente");
        }
        return paciente.get();
    }

    @Override
    public List<Paciente> listarPacientes() {
        return repositorio.findAll();
    }
}
