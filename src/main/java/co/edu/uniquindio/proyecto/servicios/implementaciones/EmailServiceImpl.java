package co.edu.uniquindio.proyecto.servicios.implementaciones;

import co.edu.uniquindio.proyecto.servicios.interfaces.EmailService;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {


    private final JavaMailSender  sender;



    @Override
    public void enviarEmail(String asunto, String contenido, String destinatario){

        MimeMessage mensaje=sender.createMimeMessage();
        MimeMessageHelper helper=new MimeMessageHelper(mensaje);

        try {
            helper.setSubject(asunto);
            helper.setText(contenido,true);
            helper.setTo(destinatario);
            helper.setFrom("no_reply@dominio.com");

            sender.send(mensaje);

        }catch (Exception e){
            System.out.println("la cago");
        }

    }



}
