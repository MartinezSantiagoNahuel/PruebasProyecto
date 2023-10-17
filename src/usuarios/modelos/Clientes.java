/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

/**
 *
 * @author estudiante
 */
public class Clientes{
    //Atributos
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;
    ArrayList<Pedido> pedidos = new ArrayList<>();

    //Constructor
    /**
     * Constructor
     * @param correo Correo electrónico del cliente
     * @param clave Contraseña de ingreso del cliente
     * @param apellido Apellido cliente
     * @param nombre Nombre Cliente
     */
    public Clientes(String correo, String clave, String apellido, String nombre) {
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
    
    //Métodos
    /**
     * Muestra los atributos del objeto Cliente creado
     */
    public void mostrar(){
        System.out.println("*** CLIENTE: ");
        System.out.println("Apellido:" + this.verApellido());
        System.out.println("Nombre:" + this.verNombre());
        System.out.println("Correo:" + this.verCorreo());
        System.out.println("Clave:" + this.verClave());
    }
}
