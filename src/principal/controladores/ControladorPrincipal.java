/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.time.LocalDateTime;
import java.util.ArrayList;
import pedidos.modelos.Pedido;
import pedidos.modelos.ProductoDelPedido;
import usuarios.modelos.Clientes;
import usuarios.modelos.Empleados;
import usuarios.modelos.Encargados;
import productos.modelos.Producto;
import productos.modelos.Categoria;
import productos.modelos.Estado;

/**
 *  Clase que contiene al método principal del proyecto
 * @author estudiante
 */
public class ControladorPrincipal {

    public static void main(String[] args) {
        //Implementación de ArrayLists para el guardado de cada tipo de objetos
        ArrayList<Clientes> clientes = new ArrayList<>();
        ArrayList<Empleados> empleados = new ArrayList<>();
        ArrayList<Encargados> encargados = new ArrayList<>();
        ArrayList<Producto> prods = new ArrayList<>();
        ArrayList<ProductoDelPedido> pdps1 = new ArrayList<>();
        ArrayList<ProductoDelPedido> pdps2 = new ArrayList<>();
        ArrayList<ProductoDelPedido> pdps3 = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();

        //Se instancian las clases
        Clientes cliente1 = new Clientes("c1@mail.com", "c1", "ApellidoCliente1", "NombreCliente1");
        Clientes cliente2 = new Clientes("c2@mail.com", "c2", "ApellidoCliente2", "NombreCliente2");
        Clientes cliente3 = new Clientes("c3@mail.com", "c3", "ApellidoCliente3", "NombreCliente3");

        Empleados empleado1 = new Empleados("em1@mail.com", "em1", "ApellidoEmpleado1", "NombreEmpleado1");
        Empleados empleado2 = new Empleados("em2@mail.com", "em2", "ApellidoEmpleado2", "NombreEmpleado2");
        Empleados empleado3 = new Empleados("em3@mail.com", "em3", "ApellidoEmpleado3", "NombreEmpleado3");

        Encargados encargado1 = new Encargados("en1@mail.com", "en1", "ApellidoEncargado1", "NombreEncargado1");
        Encargados encargado2 = new Encargados("en2@mail.com", "en2", "ApellidoEncargado2", "NombreEncargado2");
        Encargados encargado3 = new Encargados("en3@mail.com", "en3", "ApellidoEncargado3", "NombreEncargado3");

        Producto producto1 = new Producto(1, "Producto1", Categoria.ENTRADA, Estado.DISPONIBLE, 15.2f);                
        Producto producto2 = new Producto(2, "Producto2", Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE, 50.0f);
        Producto producto3 = new Producto(3, "Producto3", Categoria.POSTRE, Estado.DISPONIBLE, 20.2f);

        ProductoDelPedido pdp1 = new ProductoDelPedido(producto1, 3);
        ProductoDelPedido pdp2 = new ProductoDelPedido(producto2, 2);
        ProductoDelPedido pdp3 = new ProductoDelPedido(producto3, 1);
        
        //Agregado de objetos a los ArrayLists
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente2);

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);

        encargados.add(encargado1);
        encargados.add(encargado2);
        encargados.add(encargado3);

        prods.add(producto1);
        prods.add(producto2);
        prods.add(producto3);
        
        pdps1.add(pdp1);
        pdps2.add(pdp2);
        pdps3.add(pdp3);
        pdps3.add(pdp2);
        
        Pedido pedido1 = new Pedido(1, LocalDateTime.now(), pdps1, cliente1);
        Pedido pedido2 = new Pedido(2, LocalDateTime.now(), pdps2, cliente2);
        Pedido pedido3 = new Pedido(3, LocalDateTime.now(), pdps3, cliente3);
        
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        
        //Se muestran las instancias recorriendo cada ArrayList
        for (Producto p : prods) {
            p.mostrar();
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        for (Clientes c : clientes) {
            c.mostrar();
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        for (Empleados e : empleados) {
            e.mostrar();
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        for (Encargados e2 : encargados) {
            e2.mostrar();
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        //Se muestra un pedido
        for (Pedido p2 : pedidos) {
            p2.mostrar();
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
    }
}
