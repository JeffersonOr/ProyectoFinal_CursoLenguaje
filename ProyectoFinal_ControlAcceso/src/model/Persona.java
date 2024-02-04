
package model;

/*Clase persona
 *Se crea la clase persona para poder almacenar su informacion basica
 */
public class Persona {
    /////Declaracion de atributos
    private String nombres;
    private String apellidos;
    private int documento;
    private String ocupacion;
    private String estado;//el atributo estado sirve para identificar si el usuario se encuentra dento o fuera de la universidad (Retirado o ingresado)
    ///////////////////////////

    ///////////Constructor
    public Persona(String nombres, String apellidos, int documento, String ocupacion, String estado) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.ocupacion = ocupacion;
        this.estado = estado;
    }
    ///////////////////////////////////////
    
    
    ////////////Metodos getters and setters

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    ////////////////////
    
    ////Los metodos personalizados de esta clase se encuentran en el paquete controlador
    
    
}
