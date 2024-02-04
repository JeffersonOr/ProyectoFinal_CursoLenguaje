package model;

import java.time.LocalDateTime;

/**
 * Clase RegistroPersona Esta clase se encargará de registrar el ingreso y la
 * salida de la persona Tambien será la encaragada de contabilizar el tiempo de
 * estadia en la universidad Hereda de la clase persona para poder realizar el
 * registro con sus datos personales
 */
public class RegistroPersona extends Persona {

    ////Declaracion de atributos
    private LocalDateTime fechaIngreso;
    private LocalDateTime fechaSalida;
    private String duracionEstadia;
    ///////////////////

    //////////Constructor
    public RegistroPersona(LocalDateTime fechaIngreso, LocalDateTime fechaSalida, String duracionEstadia, String nombres, String apellidos, int documento, String ocupacion, String estado) {
        super(nombres, apellidos, documento, ocupacion, estado);
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.duracionEstadia = duracionEstadia;
    }
    ////////////////////////////

    ///////////////Metodos getters and setters
    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getDuracionEstadia() {
        return duracionEstadia;
    }

    public void setDuracionEstadia(String duracionEstadia) {
        this.duracionEstadia = duracionEstadia;
    }
    
    ///////////////////////////////
    
    ////Los metodos personalizados de esta clase se encuentran en el paquete controlador

}
