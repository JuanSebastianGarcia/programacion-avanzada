package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.Medico;
import co.edu.uniquindio.proyecto.servicios.interfaces.MedicoServicio;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@SpringBootTest
@Transactional
public class MedicoServicioTest {

    @Autowired
    private MedicoServicio medicoServicio;



    @Test
    public void  registrarMedicoServicioTest(){

        //Instanciamos al medico

        Medico medico = new Medico();

        String dateString = "2023-10-18 15:30:00";
        String dateString2 = "2013-10-18 18:20:00";
        LocalDateTime localDateTimeEntrada = parseStringToLocalDateTime(dateString);
        LocalDateTime localDateTimeSalida = parseStringToLocalDateTime(dateString2);


        medico.setCedula(1002367884);
        medico.setNombre("German");
        medico.setAcceso(1);
        medico.setEmail("german22312@gmail.com");
        medico.setTelefono("3137724606");
        medico.setCiudadResidencia("Armenia");
        medico.setEspecialidad("General");
        medico.setPassWord("Gato1");
        medico.setHotaEntrada(localDateTimeEntrada);
        medico.setHoraSalida(localDateTimeSalida);


        //Llamamos el servicio de registrar

        try {
            Medico nuevo = medicoServicio.registrarMedico(medico);
            Assertions.assertNotNull(nuevo);
            System.out.println(nuevo);
        }catch (Exception e){
            throw new RuntimeException(e);

        }

        // buscar el medico

        try {
            Medico buscado = medicoServicio.obtenerMedico(1002367884);
            System.out.println(buscado.getEmail());

        }catch (Exception e){

            throw new RuntimeException(e);

        }

        // Actualizar medico
        medico.setNombre("Dario");

        try {
            Medico actualizar= medicoServicio.actualizarMedico(medico);
            Medico buscado = medicoServicio.obtenerMedico(1002367884);
            System.out.println(buscado.getNombre());
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        // Eliminar medico
        try {
            medicoServicio.eliminarMedico(medico.getCedula());
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
