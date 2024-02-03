/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Administrador;

/**
 *
 * @author Usuario
 */
public class ControllerAdministrador {

    /////Se crea un objeto para poder iniciar sesion
    Administrador administrador1 = new Administrador("Admin", "123", "Carlos", "Osorio", 123645, "Admin",null);
    /////////////////////////////////////////////////////////

    //////Metodo iniciar sesion para el administrador, retorna true en caso de iniciar sesion satisfactoriamente, y false en caso de alguna falla
    public boolean iniciarSesion(String usuario, String contrasenia) {
        if (usuario.equals(administrador1.getUsuario()) && contrasenia.equals(administrador1.getContrasenia())) {
            return true;
        }

        return false;
    }
}
