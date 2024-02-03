/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class RegistroPersona extends Persona {

    private LocalDateTime fechaIngreso;
    private LocalDateTime fechaSalida;

    public RegistroPersona(LocalDateTime fechaIngreso, LocalDateTime fechaSalida, String nombres, String apellidos, int documento, String ocupacion, String estado) {
        super(nombres, apellidos, documento, ocupacion, estado);
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

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

    


    
    
}
