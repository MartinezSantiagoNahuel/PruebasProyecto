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
 *
 * @author Ana Kuenneth
 */
public class Pedido {
    //Atributos de la clase / Variables de instancia
    private int numero;
    private Estado estado;
    private LocalDateTime fechaYhora;
    private Clientes unCliente;
    
   
    //Constructor
    public Pedido(int numero, LocalDateTime fechaYhora, Estado estado, Clientes unCliente) {
        this.numero = numero;
        this.fechaYhora = fechaYhora;
        this.estado = estado;
        this.unCliente = unCliente;
    }
    
    //Métodos
    //Métodos GET/SET
    public int verNumero() {
        return numero;
    }
    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime verFechaYhora() {
        return fechaYhora;
    }
    public void asignarFechaYhora(LocalDateTime fechaYhora) {
        this.fechaYhora = fechaYhora;
    }
    
    public Clientes verUnCliente() {
        return unCliente;
    }
    public void asignarUnCliente(Clientes unCliente) {
        this.unCliente = unCliente;
    }
    
    public Estado verEstado() {
        return estado;
    }
    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }
    
    public void mostrar(){
        String patronFecha = "dd/MM/yyyy";
        String patronHora = "HH:mm";
    
        System.out.println("*** PEDIDO: ");
        System.out.println("Nro: " + this.verNumero());
        System.out.print("Fecha: " + this.verFechaYhora().format(DateTimeFormatter.ofPattern(patronFecha)));
        System.out.println("\tHora: "+this.verFechaYhora().format(DateTimeFormatter.ofPattern(patronHora)));
        System.out.println("Cliente: "+this.unCliente.verApellido()+", "+this.unCliente.verNombre());
        System.out.println("Estado: " + this.verEstado());
    }
}
