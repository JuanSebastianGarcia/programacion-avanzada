package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.HistorialDescanso;
import co.edu.uniquindio.proyecto.servicios.interfaces.HistorialDescansoServicio;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
@Transactional
public class HistorialDescansoServicioTest {

    @Autowired
    private HistorialDescansoServicio historialDescansoServicio;


    @Test
    public void registrarHistorialServicioTest(){

        // Instanciamos el historial

        int año = 2023;
        int mes = 10;
        int dia = 14;
        LocalDate fecha = LocalDate.of(año, mes, dia);
        LocalDate fechaBase = LocalDate.now();
        LocalDate fechaEnElFuturo = fechaBase.plusDays(7);

        HistorialDescanso historialDescanso= new HistorialDescanso();

        historialDescanso.setId(10);
        historialDescanso.setMedicoCedula("1002367884");
        historialDescanso.setFecha(fecha);

        // llamamos registrar

        try {
            HistorialDescanso nuevo= historialDescansoServicio.registrarHistorialDescanso(historialDescanso);
            Assertions.assertNotNull(nuevo);
            System.out.println(nuevo);

        }catch (Exception e){
            throw new RuntimeException(e);

        }
/*
        // buscar el historial

        try {
            HistorialDescanso buscado = historialDescansoServicio.buscarHistorialDescanso(10);

        }catch (Exception e){

            throw new RuntimeException(e);

        }
       // llamamos el servicio de actualizar
        try {
          //  HistorialDescanso actualizar = historialDescansoServicio.actualizarHistorialDescanso(historialDescanso);
         //   HistorialDescanso buscado = historialDescansoServicio.buscarHistorialDescanso(10);
        //    System.out.println(buscado.getMedicoCedula());
        }catch (Exception e){

            throw new RuntimeException(e);
        }
        // eliminar el historial

        try {
            historialDescansoServicio.eliminarHistorialDescanso(historialDescanso.getId());
            System.out.println("se elimino");
        }catch (Exception e){

            throw new RuntimeException(e);
        }



*/
    }
}
