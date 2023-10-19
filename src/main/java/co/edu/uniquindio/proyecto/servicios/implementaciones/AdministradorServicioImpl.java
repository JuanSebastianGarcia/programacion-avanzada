package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.entidades.Administrador;
import co.edu.uniquindio.proyecto.repositorios.AdministradorRepository;
import co.edu.uniquindio.proyecto.servicios.excepciones.AttributeException;
import co.edu.uniquindio.proyecto.servicios.interfaces.AdministradorServicio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class AdministradorServicioImpl implements AdministradorServicio {

    private final AdministradorRepository repository;

    public AdministradorServicioImpl(AdministradorRepository repo){
        this.repository=repo;
    }


    //______________________METODOS PRINCIPALES______________________________________//
    @Override
    public Integer registrarAdministrador(Administrador a) throws Exception {

        Administrador creado;

        //se verifica la cedula y el email
        if(validarAdministrador(a)){
            creado = repository.save(a);

        }else{
            throw new AttributeException("verifique los datos porque parecen estar repetidos");
        }

        return creado.getCedula();
    }


    @Override
    public Integer actualizarAdministrador(Administrador a) throws Exception {

        Optional<Administrador> buscado=repository.findById(a.getCedula());

        //se verifica que el administrador existe
        if(buscado.isEmpty()) {
            throw new AttributeException("el administrador con estos datos no existe");
        }

        return repository.save(a).getCedula();
    }

    @Override
    public void eliminarAdministrador(int id) throws Exception {

        Optional<Administrador> a=repository.findById(id);

        //se verifica que el administrador existe
        if(a.isEmpty()){
            throw new AttributeException("no se encontro un administrador con este id");
        }

        repository.delete(a.get());

    }

    @Override
    public Administrador buscarAdministrador(int id) throws Exception {

        Optional<Administrador> a=repository.findById(id);

        if(a.isEmpty()){
            throw new AttributeException("no se encontro un administrador con este id");
        }


        return a.get();
    }

    @Override
    public List<Administrador> listarAdministradores() {
        return repository.findAll();
    }








    //_____________________-METODOS DE PROCESO_____________________________________//

    /*
    METODO QUE SE ENCARGA DE VERIFICAR SI EXISTE
     */
    public boolean validarAdministrador(Administrador a){

        boolean respuesta=false;

        Optional<Administrador> buscadoid=repository.findById(a.getCedula());
        Optional<Administrador> buscadoEmail=repository.findByEmail(a.getEmail());

        if(buscadoid.isEmpty() && buscadoEmail.isEmpty()){
            respuesta=true;
        }

        return respuesta;
    }

}
