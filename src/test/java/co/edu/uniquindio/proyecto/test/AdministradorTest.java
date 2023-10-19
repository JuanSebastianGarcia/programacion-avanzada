package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.Administrador;
import co.edu.uniquindio.proyecto.repositorios.AdministradorRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AdministradorTest {

    @Autowired
    private AdministradorRepository repo;

    @Test
    @Transactional
    public void registrarAdministrador(){

        Administrador admin=new Administrador();

        admin.setCedula(1234);
        admin.setNombre("carlos");
        admin.setEmail("juan@");
        admin.setAcceso(3);

        repo.save(admin);


        Optional<Administrador> buscado=repo.findById(1234);
        System.out.println(buscado.get().getNombre());
    }

}
