/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.time.LocalDateTime;
import java.util.ArrayList;
import pedidos.modelos.Pedido;
import pedidos.modelos.Estado;
import usuarios.modelos.Clientes;
import usuarios.modelos.Empleados;
import usuarios.modelos.Encargados;
import productos.modelos.Producto;
//import productos.modelos.Categoria;
//import productos.modelos.Estado;

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {

    public static void main(String[] args) {

        ArrayList<Clientes> clientes = new ArrayList<>();
        ArrayList<Empleados> empleados = new ArrayList<>();
        ArrayList<Encargados> encargados = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();

        Clientes cliente1 = new Clientes("c1@mail.com", "c1", "c1", "c1");
        Clientes cliente2 = new Clientes("c2@mail.com", "c2", "c2", "c2");
        Clientes cliente3 = new Clientes("c3@mail.com", "c3", "c3", "c3");

        Empleados empleado1 = new Empleados("c1@mail.com", "c1", "c1", "c1");
        Empleados empleado2 = new Empleados("c2@mail.com", "c2", "c2", "c2");
        Empleados empleado3 = new Empleados("c3@mail.com", "c3", "c3", "c3");

        Encargados encargado1 = new Encargados("c1@mail.com", "c1", "c1", "c1");
        Encargados encargado2 = new Encargados("c2@mail.com", "c2", "c2", "c2");
        Encargados encargado3 = new Encargados("c3@mail.com", "c3", "c3", "c3");
//
//        Producto producto1 = new Producto(1, "disponible", Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE, 1.2f);
//        Producto producto2 = new Producto(2, "disponible", Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE, 1.2f);
//        Producto producto3 = new Producto(3, "disponible", Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE, 1.2f);

        Pedido unPedido = new Pedido(1, LocalDateTime.now(), Estado.CREADO, cliente1);
        
        //Agregado de objetos a los ArrayLists
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente2);

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);

        encargados.add(encargado1);
        encargados.add(encargado2);
        encargados.add(encargado2);
//
//        productos.add(producto1);
//        productos.add(producto2);
//        productos.add(producto3);
        
        
        for (Producto p : productos) {
            p.mostrar();
        }
        
        for (Clientes c : clientes) {
            c.mostrar();
        }
        
        for (Empleados e : empleados) {
            e.mostrar();
        }
        
        for (Encargados e2 : encargados) {
            e2.mostrar();
        }
        
        unPedido.mostrar();
        
    }
}
