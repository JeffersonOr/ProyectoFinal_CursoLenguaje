/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.RegistroPersona;

/**
 *
 * @author Usuario
 */
public class Singleton {

    private static Singleton INSTANCE = new Singleton();
    //////////////////////////////////////////Lists
    private ArrayList<RegistroPersona> listRegistroPersonas;
    /////////////////////////////////////////

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public Singleton() {
        listRegistroPersonas = read();
    }

    public ArrayList<RegistroPersona> getListRegistroPersona() {
        return this.listRegistroPersonas;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////ListaUsuarios
    public void writeObject(ArrayList<RegistroPersona> listRegistroPersonas) {//////////Metodo para hacer cambios
        try {
            FileOutputStream file
                    = new FileOutputStream("RegistroPersonas.dat");
            ObjectOutputStream writer
                    = new ObjectOutputStream(file);
            writer.writeObject(listRegistroPersonas);
        } catch (IOException ex) {
            //ex.printStackTrace();
        }
    }

    private ArrayList<RegistroPersona> read() {///////////////Metodo para actualizar
        try {
            FileInputStream file
                    = new FileInputStream("RegistroPersonas.dat");
            ObjectInputStream reader
                    = new ObjectInputStream(file);
            return (ArrayList<RegistroPersona>) reader.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            //ex.printStackTrace();
            return new ArrayList<>();
        }
    }
}
