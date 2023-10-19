package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.Comentario;
import co.edu.uniquindio.proyecto.servicios.interfaces.ComentarioServicio;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class ComentarioServicioTest {

    @Autowired
    private ComentarioServicio comentarioService;

    @Test
    public void pruebas(){


        //se instancia un objeto tipo comentario
        Comentario c=new Comentario();
        c.setMensaje("hola que mas");


        //______registro__________//
        try {
            c.setId(comentarioService.registrarComentario(c));
            System.out.println(c.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        //_______busqueda______________//
        try {
            Comentario buscado= comentarioService.buscarComentario(c.getId());
            System.out.println(buscado.getMensaje());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        //______actualizar______________//

        c.setMensaje("bien y usted");

        try {
            comentarioService.actualizarComentario(c);
            Comentario buscado= comentarioService.buscarComentario(c.getId());
            System.out.println(buscado.getMensaje());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }





        //________eliminar________________//
        try {
            System.out.println(comentarioService.eliminarComentario(c.getId()));
            comentarioService.buscarComentario(c.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
