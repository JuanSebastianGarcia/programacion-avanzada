package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.servicios.implementaciones.EmailServiceImpl;
import co.edu.uniquindio.proyecto.servicios.interfaces.EmailService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class EmailServiceTest {


    @Autowired
    private EmailService service;

    @Test
    public void prueba(){





        service.enviarEmail("clinica paso al infierno","te vas a morir el 24 de octubre","garciajuan312002@gmail.com");

    }

}
