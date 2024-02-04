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

/**
 *
 * @author Usuario
 */
public class ControllerRegistroPersona {

    ArrayList<RegistroPersona> listRegistroPersonas;

    public ControllerRegistroPersona() {

        listRegistroPersonas = Singleton.getInstance().getListRegistroPersona();

    }

    /////////////////Create personas
    public boolean registrarIngreso (RegistroPersona registroPersona) {
        RegistroPersona aux = readUsers(registroPersona.getDocumento());

        if (aux == null) {
            listRegistroPersonas.add(registroPersona);
            Singleton.getInstance().writeObject(listRegistroPersonas);
            return true;
        }

        return false;
    }

    ///////////////Read Personas
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
        Duration duracion;

        if (aux) {
            for (int i = 0; i < listRegistroPersonas.size(); i++) {

                listRegistroPersonas.get(i).setEstado("Retirado");
                listRegistroPersonas.get(i).setFechaSalida(LocalDateTime.now());
                duracion = Duration.between(listRegistroPersonas.get(i).getFechaIngreso(), listRegistroPersonas.get(i).getFechaSalida());
                listRegistroPersonas.get(i).setDuracionEstadia("Tiempo duracion: " + + duracion.toDaysPart() + " dias " + duracion.toHours() + " horas " + duracion.toMinutesPart() + " minutos " + duracion.toSecondsPart() + " Segundos");
                Singleton.getInstance().writeObject(listRegistroPersonas);

                System.out.println("Fecha salida: " + listRegistroPersonas.get(i).getFechaSalida() + " Fecha ingreso: " + listRegistroPersonas.get(i).getFechaIngreso());
                
                System.out.println(listRegistroPersonas.get(i).getEstado());
                System.out.println(listRegistroPersonas.get(i).getDuracionEstadia());
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

//    /////////////Delete Users
//    public boolean deleteUsers(User user) {
//        User aux = readUsers(user.getIdPerson());
//        for (int i = 0; i < listUsers.size(); i++) {
//            if (aux != null) {
//                listUsers.remove(i);
//                Singleton.getInstance().writeObject(listUsers);
//                return true;
//            }
//        }
//        return false;
//    }
}
