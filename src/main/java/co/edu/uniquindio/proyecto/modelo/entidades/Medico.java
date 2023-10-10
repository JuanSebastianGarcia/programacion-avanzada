package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Time;

@Entity
public class Medico {

    //atributos
    @Id
    private int cedula;
    private String nombre;
    private String password;
    private String email;
    private String telefono;
    private String CiudadResidencia;
    private String especialidad;
    private Time hotaEntrada;
    private Time horaSalida;
    private int acceso;


    public Medico(){

    }




    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCiudadResidencia() {
        return CiudadResidencia;
    }
    public void setCiudadResidencia(String ciudadResidencia) {
        CiudadResidencia = ciudadResidencia;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public Time getHotaEntrada() {
        return hotaEntrada;
    }
    public void setHotaEntrada(Time hotaEntrada) {
        this.hotaEntrada = hotaEntrada;
    }
    public Time getHoraSalida() {
        return horaSalida;
    }
    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }
    public int getAcceso() {
        return acceso;
    }
    public void setAcceso(int acceso) {
        this.acceso = acceso;
    }
}
