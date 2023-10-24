/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 * Atributos y comportamientos de los objetos creados como empleados
 * @author estudiante
 */
public class Empleado{
   //Atributos
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;

    /**
     * Constructor
     * Instancia objetos del tipo Empleados
     * @param correo Correo electrónico del empleado
     * @param clave Contraseña del empleado
     * @param apellido Apellido del empleado
     * @param nombre Nombre del empleado
     */
    public Empleado(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
    }

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
    
    public void mostrar(){
        //System.out.println("*** EMPLEADO: ");
        System.out.println("Empleado:" + this.verApellido()+ " " +this.verNombre());
        System.out.println("Correo:" + this.verCorreo());
        //System.out.println("Clave: " + this.verClave());
    }
}
