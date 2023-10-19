package co.edu.uniquindio.proyecto.servicios.interfaces;



import co.edu.uniquindio.proyecto.entidades.Alergia;

import java.util.List;

public interface AlergiaServicio {

    Integer registrarAlergia(Alergia a)throws Exception;

    Integer actualizarAlergia(Alergia a)throws Exception;

    String eliminarAlergia(String alergia)throws Exception;


    Alergia buscarAlergia(String alergia)throws Exception;

    List<Alergia> listarAlergias();

}
