package co.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.Administrador;
import co.edu.uniquindio.proyecto.repositorios.AdministradorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UsuarioTest {

    @Autowired
    private AdministradorRepository administradorRepository;


    @Test
    public void registrarAdministradorTest(){

        Administrador admin=new Administrador();
        admin.setAcceso(1);
        admin.setEmail("admins@gmail.com");
        admin.setCedula(1005);
        admin.setNombre("juan");

        Administrador guardado=administradorRepository.save(admin);

        Assertions.assertNotNull(guardado);

    }


    public void eliminarAdministrasdorTest(){

        Administrador admin=new Administrador();
        admin.setAcceso(1);
        admin.setEmail("admins@gmail.com");
        admin.setCedula(1005);
        admin.setNombre("juan");

        administradorRepository.delete(admin);

        admin=administradorRepository.findById(1).orElse(null);

        Assertions.assertNull(admin);
    }
}
