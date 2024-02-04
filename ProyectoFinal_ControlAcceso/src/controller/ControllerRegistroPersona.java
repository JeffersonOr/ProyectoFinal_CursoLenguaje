/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

import model.RegistroPersona;
import singleton.Singleton;

/**Este es el controlador de la clase RegistroPersona
 *Aqui se alojan los metodos personalzados que maneja
 *
 */
public class ControllerRegistroPersona {

    ///////////Creamos una lista de tipo "RegistroPersona" para almacenar los registros 
    ArrayList<RegistroPersona> listRegistroPersonas;

    ///////////Constructor que se encargará de dar valor
    public ControllerRegistroPersona() {

        /////////Le damos la instancia a la lista que se encuentra creada en la clase singleton para no crear una nueva instacia
        listRegistroPersonas = Singleton.getInstance().getListRegistroPersona();

    }

    /////////////////Metodo para crear el ingreso de la persona. Este metodo guardá los datos de la persona en la lista
    public boolean registrarIngreso (RegistroPersona registroPersona) {
        RegistroPersona aux = readUsers(registroPersona.getDocumento());

        if (aux == null) {
            listRegistroPersonas.add(registroPersona);
            Singleton.getInstance().writeObject(listRegistroPersonas);
            return true;
        }

        return false;
    }

    ///////////////Este metodo se encargar de encontrar a la persona registrada
    public RegistroPersona readUsers(int code) {

        for (int i = 0; i < listRegistroPersonas.size(); i++) {
            if (code == listRegistroPersonas.get(i).getDocumento()) {
                return listRegistroPersonas.get(i);

            }
        }
        return null;
    }

    ///////////////Metodo para registrar la salida de la persona
    public boolean medirTiempoEstadia (int code) {

        boolean aux = validarIngreso(code);
        System.out.println("Entro al controlador " + "aux: " + aux + " parametro documento: " + code);
        
        /////////Creamos una variable de tipo duracion
        Duration duracion;

        if (aux) {
            for (int i = 0; i < listRegistroPersonas.size(); i++) {

                listRegistroPersonas.get(i).setEstado("Retirado");///////Cambia el estado de la persona a Retirado
                listRegistroPersonas.get(i).setFechaSalida(LocalDateTime.now());//////////Establece la fecha de salida
                duracion = Duration.between(listRegistroPersonas.get(i).getFechaIngreso(), listRegistroPersonas.get(i).getFechaSalida());////Se almacena en la varible duracion la diferencia entre la fecha ingreso y fecha salida
                listRegistroPersonas.get(i).setDuracionEstadia("Tiempo duracion: " + + duracion.toDaysPart() + " dias " + duracion.toHours() + " horas " + duracion.toMinutesPart() + " minutos " + duracion.toSecondsPart() + " Segundos");/////Se guarda la duracion fragmentado en dias, horas, minutos y segundos en el atributo
                Singleton.getInstance().writeObject(listRegistroPersonas);
                
                ////////////Se implementan estos souts para validar en la consola si los objetos continuen bien la informacion
                System.out.println("Fecha salida: " + listRegistroPersonas.get(i).getFechaSalida() + " Fecha ingreso: " + listRegistroPersonas.get(i).getFechaIngreso());
                System.out.println(listRegistroPersonas.get(i).getEstado());
                System.out.println(listRegistroPersonas.get(i).getDuracionEstadia());
                /////////////////////////////////////////////////////////////
            }

            return true;

        }
        return false;

    }

    //////Validamos su cedula para ver su estado
    public boolean validarIngreso(int code) {
        for (int i = 0; i < listRegistroPersonas.size(); i++) {
            if (code == listRegistroPersonas.get(i).getDocumento()) {
                if ("Ingresado".equals(listRegistroPersonas.get(i).getEstado())) {////Pestaña de registro salida
                    return true;
                }

                return false;

            }
        }

        return false;
    }

}
