package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.Paciente;
import co.edu.uniquindio.proyecto.repositorios.PacienteRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class PacienteTest {

    @Autowired
    private PacienteRepository pacienteRep;

    @Test
    public void registrarPacienteTest() {

        int año = 2023;
        int mes = 10;
        int dia = 14;
        LocalDate fecha = LocalDate.of(año, mes, dia);
        LocalDate fechaBase = LocalDate.now();
        LocalDate fechaEnElFuturo = fechaBase.plusDays(7);


        ArrayList <Integer> alergias=new ArrayList<>();
        alergias.add(2);

        ArrayList <String> telefono=new ArrayList<>();
        telefono.add("3026419717");

        Paciente paciente = new Paciente();
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

        Paciente guardado = pacienteRep.save(paciente);

        Assertions.assertNotNull(guardado);

    }
    @Test
    public void eliminarPacienteTest(){

        int año = 2023;
        int mes = 10;
        int dia = 14;
        LocalDate fecha = LocalDate.of(año, mes, dia);
        LocalDate fechaBase = LocalDate.now();
        LocalDate fechaEnElFuturo = fechaBase.plusDays(7);


        ArrayList <Integer> alergias=new ArrayList<>();
        alergias.add(2);

        ArrayList <String> telefono=new ArrayList<>();
        telefono.add("3026419717");

        Paciente paciente = new Paciente();
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

        Paciente registrado = pacienteRep.save(paciente);

        pacienteRep.delete(registrado);

        Paciente buscado = pacienteRep.findById(1007053789).orElse(null);
        Assertions.assertNull(buscado);

    }

    public void actualizarPacienteTest(){


        int año = 2023;
        int mes = 10;
        int dia = 14;
        LocalDate fecha = LocalDate.of(año, mes, dia);
        LocalDate fechaBase = LocalDate.now();
        LocalDate fechaEnElFuturo = fechaBase.plusDays(7);


        ArrayList <Integer> alergias=new ArrayList<>();
        alergias.add(2);

        ArrayList <String> telefono=new ArrayList<>();
        telefono.add("3026419717");

        Paciente paciente = new Paciente();
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

        Paciente registrado = pacienteRep.save(paciente);
        registrado.setNombre("David");

        pacienteRep.save(registrado);

        Paciente buscado= pacienteRep.findById(1007053789).orElse(null);

        Assertions.assertEquals("David", buscado.getNombre());

    }

    public void listarPacientesTest(){

        List<Paciente> lista = pacienteRep.findAll();

        System.out.println(lista);
    }





}
