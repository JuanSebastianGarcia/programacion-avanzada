package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.Paciente;
import co.edu.uniquindio.proyecto.servicios.interfaces.PacienteServicio;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;


@SpringBootTest
@Transactional
public class PacienteServicioTest {

    @Autowired
    private PacienteServicio pacienteServicio;


    @Test
    public void registrarPacienteServicioTest(){

        //Instanciamos al paciente
        Paciente paciente = new Paciente();


        int año = 2023;
        int mes = 10;
        int dia = 14;
        LocalDate fecha = LocalDate.of(año, mes, dia);
        LocalDate fechaBase = LocalDate.now();
        LocalDate fechaEnElFuturo = fechaBase.plusDays(7);


        ArrayList<Integer> alergias=new ArrayList<>();
        alergias.add(2);

        ArrayList <String> telefono=new ArrayList<>();
        telefono.add("3026419717");

        paciente.setCedula(1007053789);
        paciente.setNombre("Brahian");
        paciente.setAcceso(1);
        paciente.setEmail("brahiand320519@gmail.com");
        paciente.setAlergias(alergias);
        paciente.setCiudadResidencia("calarca");
        paciente.setTelefono(telefono);
        paciente.setFechaNacimiento(fecha);
        paciente.setPassWord("12345");
        paciente.setGrupoSanguineo("A+");

        // Llmamamos el servicio de registrar
        try {
            Paciente nuevo = pacienteServicio.registrarPaciente(paciente);
            Assertions.assertNotNull(nuevo);
        } catch (Exception e){

            throw new RuntimeException(e);

        }

        // Llamamos el servicio de actualizar
        try {
            Paciente actualizar = pacienteServicio.actualizarPaciente(paciente);
            Assertions.assertNotNull(actualizar);
        }catch (Exception e){

            throw new RuntimeException(e);
        }












    }


}
