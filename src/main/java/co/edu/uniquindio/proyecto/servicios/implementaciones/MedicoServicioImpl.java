package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.Medico;
import co.edu.uniquindio.proyecto.repositorios.MedicoRepository;
import co.edu.uniquindio.proyecto.servicios.excepciones.AtributeException;
import co.edu.uniquindio.proyecto.servicios.interfaces.MedicoServicio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class MedicoServicioImpl implements MedicoServicio {

    private final MedicoRepository medicorepo;

    public MedicoServicioImpl(MedicoRepository medicoRepo) {

        this.medicorepo = medicoRepo;
    }


    @Override
    public Medico registrarMedico(Medico a) throws Exception {
        if(!estaDisponible(a.getEmail())){
            throw new AtributeException("El correo "+a.getEmail()+" ya está en uso");
        }

        return  medicorepo.save(a);

    }
    public boolean estaDisponible(String email){
        Optional<Medico> medico = medicorepo.findByEmail(email);
        return medico.isEmpty();
    }


    @Override
    public Medico actualizarMedico(Medico a) throws Exception {
        Optional<Medico> guardado = medicorepo.findById(a.getCedula());
        if(guardado.isEmpty()){
            throw new AtributeException("El medico no existe");
        }
        return medicorepo.save(a);
    }

    @Override
    public void eliminarMedico(int codigo) throws Exception {
        Optional<Medico> guardado = medicorepo.findById(codigo);
        if(guardado.isEmpty()){
            throw new AtributeException("El código "+codigo+" no está asociado a ningún medico");
        }
        medicorepo.delete(guardado.get());


    }

    @Override
    public Medico obtenerMedico(int codigo) throws Exception {
        Optional<Medico> medico = medicorepo.findById(codigo);

        if(medico.isEmpty()){
            throw new AtributeException("El código "+codigo+" no está asociado a ningún medico");
        }
        return medico.get();
    }

    @Override
    public List<Medico> listarMedicos() {
        return medicorepo.findAll();
    }
}
