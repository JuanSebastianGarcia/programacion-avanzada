package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.Alergia;
import co.edu.uniquindio.proyecto.servicios.interfaces.AlergiaServicio;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class AlergiaServicioTest {

    @Autowired
    private AlergiaServicio alerservice;

    @Test
    public void pruebas(){

        //se instancia un objeto tipo alergia
        Alergia a=new Alergia();
        a.setAlergia("polvo");



        //_________registro________________//
        try {
            System.out.println(alerservice.registrarAlergia(a));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        //________busqueda_______________//

        try {
            Alergia buscado=alerservice.buscarAlergia("polvo");
            System.out.println(buscado.getId() +" y " + buscado.getAlergia());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        //_________actualizar____________//

        a.setAlergia("mani");

        try {
            alerservice.actualizarAlergia(a);
            Alergia buscado=alerservice.buscarAlergia("mani");
            System.out.println(buscado.getId() +" y " + buscado.getAlergia());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        //__________-eliminar________________//

        try {
            System.out.println(alerservice.eliminarAlergia("mani"));
            Alergia buscado=alerservice.buscarAlergia("mani");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
