
package model;

/**Clase administrador
 *Se crea esta clase para el administrador
 *Será el encargado de iniciar sesion y ver el tiempo real de ingreso
 *Se hereda de la clase persona para reutilizar sus atributos
 */
public class Administrador extends Persona {
    
    /////Declaracion de atributos
    private String usuario;
    private String contrasenia;
    ////////////////////////////////

    ///////////Constructor
    public Administrador(String usuario, String contrasenia, String nombres, String apellidos, int documento, String ocupacion, String estado) {
        super(nombres, apellidos, documento, ocupacion, estado);
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    ////////////////////////////////////////////
    
    
    ////////////////Getters and setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    ///////////////////////////////////////////
    
    ////Los metodos personalizados de esta clase se encuentran en el paquete controlador

}
