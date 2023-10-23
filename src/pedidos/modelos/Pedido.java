/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import usuarios.modelos.Clientes;

/**
 * Atributos y comportamientos de los objetos creados como pedidos
 * @author Ana Kuenneth
 */
public class Pedido {
    //Atributos de la clase / Variables de instancia
    private int numero;
    private Estado estado;
    private LocalDateTime fechaYhora;
    private Clientes unCliente;
    
    /**
     * Constructor
     * Instancia objetos del tipo Pedido
     * @param numero
     * @param fechaYhora
     * @param estado
     * @param unCliente 
     */
    public Pedido(int numero, LocalDateTime fechaYhora, Estado estado, Clientes unCliente) {
        this.numero = numero;
        this.fechaYhora = fechaYhora;
        this.estado = estado;
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
    
    /**
     * Devuelve el estado del pedido
     * @return estado del pedido
     */
    public Estado verEstado() {
        return estado;
    }
    /**
     * Asigna el estado del pedido
     * @param estado estado
     */
    public void asignarEstado(Estado estado) {
        this.estado = estado;
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
        System.out.println("Estado: " + this.verEstado());
    }
}
