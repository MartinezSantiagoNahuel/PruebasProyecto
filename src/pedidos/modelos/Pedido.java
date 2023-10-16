/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import usuarios.modelos.Clientes;

/**
 *
 * @author Ana Kuenneth
 */
public class Pedido {
    //Atributos de la clase / Variables de instancia
    private int numero;
    private Estado estado;
    LocalTime hora = LocalTime.now();
    LocalDate fecha = LocalDate.now();
    private LocalDateTime fechaYhora = LocalDateTime.of(fecha, hora);
//    String patronFecha = "dd/MM/yyyy";
//    String patronHora = "hh:MM";
//    String fFormateada = f.format(DateTimeFormatter.ofPattern(patronFecha));
// String hFormateada = f.format(TimeFormatter.ofPattern(patronHora))
    private Clientes unCliente;
    
   
    //Constructor
    public Pedido(int numero, LocalDateTime fechaYhora, Estado estado) {
        this.numero = numero;
        this.fechaYhora = fechaYhora;
        this.estado = estado;
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

    public Estado verEstado() {
        return estado;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }
    
    public void mostrar(){
        System.out.println("*** PEDIDO: ");
        System.out.println("Nro: " + this.verNumero());
//        System.out.print("Fecha: " + this.verFechaYhora());
//        System.out.println("Fecha y Hora: "+this.fFormateada);
        System.out.println("Cliente: "+this.unCliente.verApellido()+", "+this.unCliente.verNombre());
        System.out.println("Estado: " + this.verEstado());
    }
}
