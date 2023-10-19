package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.Atencion;
import co.edu.uniquindio.proyecto.servicios.interfaces.AtencionServicio;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Transactional
@SpringBootTest
public class AtencionServicioTest {

    @Autowired
    private AtencionServicio atencionService;


    @Test
    public void pruebas(){

        //se instancia un objeto tipo atencion
        Atencion a=new Atencion();
        a.setDiagnostico("este es el diagnostico inicial");
        a.setCitaId(1);
        a.setTratamiento("papi, llorela, no hay tratamiento");


        //___________registro___________________//
        try {
            System.out.println(atencionService.registrarAtencion(a));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        //_______busqueda__________________//

        try {
            Atencion buscado=atencionService.buscarAtencion(1);
            System.out.println(buscado.getDiagnostico());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        //_________actualizar________________//

        a.setTratamiento("lo siento, ahora si hay tratamiento, se salvo");

        try {
            atencionService.actualizarAtencion(a);
            Atencion buscado=atencionService.buscarAtencion(1);
            System.out.println(buscado.getTratamiento());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        //___________eliminar__________________//

        try {
            System.out.println(atencionService.eliminarAtencion(1));
            atencionService.buscarAtencion(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
