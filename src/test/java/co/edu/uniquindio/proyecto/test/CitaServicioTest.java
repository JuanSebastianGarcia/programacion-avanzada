package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.Cita;
import co.edu.uniquindio.proyecto.servicios.interfaces.CitaServicio;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class CitaServicioTest {

    @Autowired
    private CitaServicio citaService;


    @Test
    public void pruebas(){


        //se instancia un objeto tipo Cita
        Cita c=new Cita();
        c.setEstado("pendiente");
        c.setMotivo("porque se muere");
        c.setPacienteCedula(123);



        //_______-registro_______//
        try {
            c.setId(citaService.registrarCita(c));
            System.out.println(c.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        //_______busqueda___________//
        try {
            Cita buscado=citaService.buscarCita(c.getId());
            System.out.println(buscado.getEstado());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        //_______actualizar______________//

        c.setEstado("realizada");

        try {
            citaService.actualizarCita(c);
            Cita buscado=citaService.buscarCita(c.getId());
            System.out.println(buscado.getEstado());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        //_______eliminado_____________//

        try {
            System.out.println(citaService.eliminarCita(c.getId()));
            citaService.buscarCita(c.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
