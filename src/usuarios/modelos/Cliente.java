/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import pedido.modelos.Pedido;

/**
 * Atributos y comportamientos de los objetos creados como clientes
 * @author estudiante
 */
public class Cliente extends Usuario{
    //Atributos
//    private String correo;
//    private String clave;
//    private String apellido;
//    private String nombre;
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
        super(correo, clave, apellido, nombre);
    }

    //Métodos
    /**
     * Muestra los atributos del objeto Cliente creado
     */
    
    
    public void mostrar() {
        System.out.print("Cliente: ");
        super.mostrar();
    }
    
    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
