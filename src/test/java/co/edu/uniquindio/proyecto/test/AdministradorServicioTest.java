package co.edu.uniquindio.proyecto.test;


import co.edu.uniquindio.proyecto.entidades.Administrador;
import co.edu.uniquindio.proyecto.servicios.interfaces.AdministradorServicio;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class AdministradorServicioTest {


    @Autowired
    private AdministradorServicio adminService;

    @Test
    public void pruebas(){


        //_____se instancia un objeto tipo administrador
        Administrador a=new Administrador();
        a.setAcceso(3);
        a.setNombre("juan");
        a.setEmail("juan@");
        a.setPassWord("123");
        a.setCedula(1234);


        //______________registro________________________//
        try {
            System.out.println(adminService.registrarAdministrador(a));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        //______________busqueda______________________//
        try {
           Administrador buscado= adminService.buscarAdministrador(1234);
           System.out.println(buscado.getEmail());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        //_______actualizar_____________________//
        a.setEmail("sebas@");

        try {
            Integer codigo=adminService.actualizarAdministrador(a);
            Administrador buscado=adminService.buscarAdministrador(codigo);
            System.out.println(buscado.getEmail());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        //_______eliminar__________________//
        try {
            adminService.eliminarAdministrador(a.getCedula());
            System.out.println("se elimino");
            adminService.buscarAdministrador(a.getCedula());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
