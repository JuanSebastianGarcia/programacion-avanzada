package co.edu.uniquindio.proyecto.servicios.interfaces;



import co.edu.uniquindio.proyecto.entidades.Alergia;

import java.util.List;

public interface AlergiaServicio {

    Integer registrarAlergia(Alergia a)throws Exception;

    Integer actualizarAlergia(Alergia a)throws Exception;

    String eliminarAlergia(int id)throws Exception;

    Alergia buscarAlergia(int id)throws Exception;

    List<Alergia> listarAlergias();

}
