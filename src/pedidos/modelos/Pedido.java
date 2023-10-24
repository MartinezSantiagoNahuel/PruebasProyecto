/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import usuarios.modelos.Clientes;

/**
 * Atributos y comportamientos de los objetos creados como pedidos
 * @author Ana Kuenneth
 */
public class Pedido {
    //Atributos de la clase / Variables de instancia
    private int numero;
    public Estado estado;
    private LocalDateTime fechaYhora;
    private Clientes unCliente;
    private ArrayList<ProductoDelPedido> pdp = new ArrayList<>();
    
    /**
     * Constructor
     * Instancia objetos del tipo Pedido
     * @param numero Número de pedido
     * @param fechaYhora Fecha y hora del pedido
     * @param unCliente Cliente que realiza el pedido
     * @param pdp Lista de productos que forman parte del pedido
     */
    public Pedido(int numero, LocalDateTime fechaYhora, ArrayList<ProductoDelPedido> pdp, Clientes unCliente) {
        this.numero = numero;
//        this.estado = estado.CREADO;
        this.fechaYhora = fechaYhora;
        this.pdp = pdp;
        this.unCliente = unCliente;
    }

    //Métodos
    //Métodos GET/SET
    /**
     * Muestra el número de pedido
     * @return numero
     */
    public int verNumero() {
        return numero;
    }
    /**
     * Asigna el numero de pedido
     * @param numero numero 
     */
    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Devuelve la fecha del pedido
     * @return fecha en la que se hizo el pedido
     */
    public LocalDate verFecha() {
        return fechaYhora.toLocalDate();
    }
    /**
     * Devuelve la hora del pedido
     * @return hora en la se hizo el pedido
     */
    public LocalTime verHora() {
        return fechaYhora.toLocalTime();
    }
    /**
     * Asigna la fecha y la hora en la que se hizo el pedido
     * @param fechaYhora fecha y hora
     */
    public void asignarFechaYhora(LocalDateTime fechaYhora) {
        this.fechaYhora = fechaYhora;
    }
    
    /**
     * Devuelve el cliente que hizo el pedido
     * @return un cliente
     */
    public Clientes verUnCliente() {
        return unCliente;
    }
    /**
     * Asigna el cliente del pedido
     * @param unCliente cliente del pedido
     */
    public void asignarUnCliente(Clientes unCliente) {
        this.unCliente = unCliente;
    }
    
//    /**
//     * Devuelve el estado del pedido
//     * @return estado del pedido
//     */
//    public Estado verEstado() {
//        return estado;
//    }
//    /**
//     * Asigna el estado del pedido
//     * @param estado estado
//     */
//    public void asignarEstado(Estado estado) {
//        this.estado = estado;
//    }
    
    /**
     * Muestra el producto del pedido
     * @return pdp - producto del pedido
     */
    public ArrayList<ProductoDelPedido> verPdp() {
        return pdp;
    }
    /**
     * Asigna el producto del pedido
     * @param pdp producto del pedido
     */
    public void asignarPdp(ArrayList<ProductoDelPedido> pdp) {
        this.pdp = pdp;
    }
    
    
    /**
     * Muestra los atributos del producto creado
     */
    public void mostrar(){
        String patronFecha = "dd/MM/yyyy";
        String patronHora = "HH:mm";
    
        System.out.println("*** PEDIDO: ");
        System.out.println("Nro: " + this.verNumero());
        System.out.print("Fecha: " + this.verFecha().format(DateTimeFormatter.ofPattern(patronFecha)));
        System.out.println("\tHora: "+this.verHora().format(DateTimeFormatter.ofPattern(patronHora)));
        System.out.println("Cliente: "+this.unCliente.verApellido()+", "+this.unCliente.verNombre());
        System.out.println("Estado: " + this.estado.CREADO);
        System.out.println("\tPedido\t\tCantidad");
        System.out.println("\t================================");
        System.out.print("\t");
        for(ProductoDelPedido p : pdp){
            System.out.print((p.verUnProducto().verDescripcion())+"\t\t"+(p.verCantidad())+"\n");
            System.out.print("\t");
        }
    }
}
