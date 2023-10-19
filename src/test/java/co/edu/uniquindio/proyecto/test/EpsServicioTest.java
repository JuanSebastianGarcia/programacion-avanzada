package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.Eps;
import co.edu.uniquindio.proyecto.servicios.interfaces.EpsServicio;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class EpsServicioTest {

    @Autowired
    private EpsServicio epsServicio;


    @Test
    public void registrarEpsServicioTest(){

        // instanciamos a la eps
        Eps eps = new Eps();

        eps.setId(12);
        eps.setNombre("Medimas");

        // Servicio de registrar
        try {
            Eps nuevo= epsServicio.registrarEps(eps);
            Assertions.assertNotNull(nuevo);
            System.out.println(nuevo);
        }catch (Exception e){

            throw new RuntimeException(e);

        }

        // buscar la eps

        try {
            Eps buscado= epsServicio.obtenerEps(12);
            System.out.println(buscado.getNombre());

        }catch (Exception e){

            throw new RuntimeException(e);

        }

        // Actualizar servicio

        eps.setNombre("Medimax");
        try {
            Eps actualizar = epsServicio.actualizarEps(eps);
            Eps buscado= epsServicio.obtenerEps(12);
            System.out.println(buscado.getNombre());

        }catch (Exception e){

            throw new RuntimeException(e);
        }

        // eliminar la eps

        try {
            epsServicio.eliminarEps(eps.getId());
            System.out.println("se elimino");

        }catch (Exception e){

            throw new RuntimeException(e);
        }

    }


}
