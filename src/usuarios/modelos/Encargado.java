/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 * Atributos y comportamientos de los objetos creados como encargados
 * @author estudiante
 */
public class Encargado {
    //Atributos
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;

    /**
     * Constructor
     * Instancia objetos del tipo Encargados
     * @param correo Correo electrónico del encargado
     * @param clave Contraseña del encargado
     * @param apellido Apellido encargado
     * @param nombre Nombre encargado
     */
    public Encargado(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    //Métodos
    //Métodos GET/SET
    public String verCorreo() {
        return correo;
    }
    public void asignarCorreo(String correo) {
        this.correo = correo;
    }


    public String verClave() {
        return clave;
    }
    public void asignarClave(String clave) {
        this.clave = clave;
    }

    
    public String verApellido() {
        return apellido;
    }
    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public String verNombre() {
        return nombre;
    }
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    /**
     * Muestra los atributos del objeto creado
     */
    public void mostrar(){
        //System.out.println("*** ENCARGADO: ");
//        System.out.println("Nombre: " + this.verNombre());
//        System.out.println("Apellido: " + this.verApellido());
        System.out.println("Encargado:" + this.verApellido()+ " " +this.verNombre());
        System.out.println("Correo:" + this.verCorreo());
//        System.out.println("Clave: " + this.verClave());
    }
}
