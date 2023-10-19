package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.Pqrs;
import co.edu.uniquindio.proyecto.servicios.interfaces.PqrsServicio;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootTest
@Transactional
public class PqrsServicioTest {

    @Autowired
    private PqrsServicio pqrsServicio;

    @Test
    public void registrarPqrsServicioTest(){

        // instanciamos el pqrs

        Pqrs pqrs = new Pqrs();


        String dateString = "2023-10-18 15:30:00";
        LocalDateTime localDateTime = parseStringToLocalDateTime(dateString);
        pqrs.setId(1);
        pqrs.setEstado("proceso");
        pqrs.setTipo("Evaluada");
        pqrs.setFechaCreacion(localDateTime);





        // Llmamamos el servicio de registrar
        try {
            Pqrs nuevo = pqrsServicio.registrarpqrs(pqrs);
            Assertions.assertNotNull(nuevo);
            System.out.println(nuevo);

        }catch (Exception e){

            throw new RuntimeException(e);

        }

        // buscar el pqrs
        try {
            Pqrs buscado = pqrsServicio.obtenerPqrs(1);
            System.out.println(buscado.getEstado());

        }catch (Exception e){

            throw new RuntimeException(e);

        }

        // Llamamos el servicio de actualizar

        pqrs.setEstado("finalizada");
        try {
            Pqrs actualizar = pqrsServicio.actualizarPqrs(pqrs);
           // Pqrs buscado= pqrsServicio.obtenerPqrs(1);
           // System.out.println(buscado.getEstado());


        }catch (Exception e){

            throw new RuntimeException(e);
        }

        // eliminar el pqrs
        try {
            pqrsServicio.eliminarPqrs(pqrs.getId());
            System.out.println("se elimino");

        }catch (Exception e){

            throw new RuntimeException(e);
        }


    }


        public LocalDateTime parseStringToLocalDateTime(String dateString) {
            // Define un patrón que coincida con el formato de tu cadena de fecha y hora.
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            // Intenta analizar la cadena en un LocalDateTime.
            try {
                LocalDateTime localDateTime = LocalDateTime.parse(dateString, formatter);
                return localDateTime;
            } catch (Exception e) {
                // Manejar cualquier error que pueda ocurrir al analizar la cadena.
                // Por ejemplo, DateTimeParseException si la cadena no coincide con el patrón.
                e.printStackTrace();
                return null;
            }

        }

















    }


