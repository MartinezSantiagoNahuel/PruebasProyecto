/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

/**
 * Atributos y comportamientos de los objetos creados como clientes
 * @author estudiante
 */
public class Cliente{
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
    public Cliente(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    //Métodos
    //Métodos GET/SET
    /**
     * Muestra el correo electrónico del cliente
     * @return correo
     */
    public String verCorreo() {
        return correo;
    }
    /**
     * Asigna el correo electronico del cliente
     * @param correo correo
     */
    public void asignarCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Muestra la contraseña del Cliente
     * @return clave
     */
    public String verClave() {
        return clave;
    }
    /**
     * Asigna la contraseña del cliente
     * @param clave clave
     */
    public void asignarClave(String clave) {
        this.clave = clave;
    }
    
    /**
     * Muestra el apellido del cliente
     * @return apellido
     */
    public String verApellido() {
        return apellido;
    }
    /**
     * Asigna el apellido del cliente
     * @param apellido apellido
     */
    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Muestra el nombre del cliente
     * @return nombre
     */
    public String verNombre() {
        return nombre;
    }
    /**
     * Asigna el nombre del cliente
     * @param nombre nombre
     */
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Métodos
    
    /**
     * Muestra los atributos del objeto Cliente creado
     */
    public void mostrar(){
        //System.out.println("*** CLIENTE: ");
//        System.out.println("Apellido:" + this.verApellido());
//        System.out.println("Nombre:" + this.verNombre());
        System.out.println("Cliente:" + this.verApellido()+ " " +this.verNombre());
        System.out.println("Correo:" + this.verCorreo());
//        System.out.println("Clave:" + this.verClave());
    }
}
