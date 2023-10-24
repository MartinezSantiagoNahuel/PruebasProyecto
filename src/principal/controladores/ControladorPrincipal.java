/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.time.LocalDateTime;
import java.util.ArrayList;
import pedidos.modelos.Pedido;
import pedidos.modelos.ProductoDelPedido;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import productos.modelos.Producto;
import productos.modelos.Categoria;
import productos.modelos.Estado;

/**
 *  Clase que contiene al método principal del proyecto
 * @author estudiante
 */
public class ControladorPrincipal {
//  *******Método Main de la cátedra********
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Encargado> encargados = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        Cliente unCliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
        Cliente unCliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
        Cliente unCliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");
        
        clientes.add(unCliente1);
        clientes.add(unCliente2);
        clientes.add(unCliente3);
        
        System.out.println("Clientes");
        System.out.println("========");
        for(Cliente c : clientes) {
            c.mostrar();
            System.out.println();
        }
        System.out.println();        
        
        Empleado unEmpleado1 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");        
        Empleado unEmpleado2 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");        
        Empleado unEmpleado3 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");
                
        empleados.add(unEmpleado1);
        empleados.add(unEmpleado2);
        empleados.add(unEmpleado3);
        
        System.out.println("Empleados");
        System.out.println("=========");
        for(Empleado e : empleados) {
            e.mostrar();
            System.out.println();
        }
        System.out.println();
        
        Encargado unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
        Encargado unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
        Encargado unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");

        encargados.add(unEncargado1);
        encargados.add(unEncargado2);
        encargados.add(unEncargado3);
        
        System.out.println("Encargados");
        System.out.println("==========");
        for(Encargado e : encargados) {
            e.mostrar();
            System.out.println();
        }
        System.out.println();
        
        Producto unProducto1 = new Producto(1, "Producto1", Categoria.ENTRADA, Estado.DISPONIBLE, 1.0f);        
        Producto unProducto2 = new Producto(2, "Producto2", Categoria.PLATOPRINCIPAL, Estado.DISPONIBLE, 2.0f);
        Producto unProducto3 = new Producto(3, "Producto3", Categoria.POSTRE, Estado.DISPONIBLE, 3.0f);
        
        productos.add(unProducto1);
        productos.add(unProducto2);
        productos.add(unProducto3);
        
        System.out.println("Productos");
        System.out.println("=========");
        for(Producto p : productos) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();
        
        
        unCliente1.asignarCorreo("cliente10@bar.com");
        System.out.println("Clientes");
        System.out.println("========");
        for(Cliente c : clientes) {
            c.mostrar();
            System.out.println();
        }
        System.out.println();
        
        System.out.println(unProducto1);
        
        ArrayList<ProductoDelPedido> pdp1 = new ArrayList<>();
        pdp1.add(new ProductoDelPedido(unProducto1, 1));
        pdp1.add(new ProductoDelPedido(unProducto2, 2));
        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), pdp1, unCliente1);        
        
        ArrayList<ProductoDelPedido> pdp2 = new ArrayList<>();
        pdp2.add(new ProductoDelPedido(unProducto1, 10));
        pdp2.add(new ProductoDelPedido(unProducto2, 20));
        Pedido unPedido2 = new Pedido(2, LocalDateTime.now(), pdp2, unCliente2);        
        
        ArrayList<ProductoDelPedido> pdp3 = new ArrayList<>();
        pdp3.add(new ProductoDelPedido(unProducto1, 100));
        pdp3.add(new ProductoDelPedido(unProducto2, 200));
        Pedido unPedido3 = new Pedido(3, LocalDateTime.now(), pdp3, unCliente3);        
        
        pedidos.add(unPedido1);
        pedidos.add(unPedido2);
        pedidos.add(unPedido3);
        
        System.out.println("Pedidos");
        System.out.println("=======");
        for(Pedido p : pedidos) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();
        
    }   
//  *******Método Main de estudiante********
//    public static void main(String[] args) {
//        //Implementación de ArrayLists para el guardado de cada tipo de objetos
//        ArrayList<Clientes> clientes = new ArrayList<>();
//        ArrayList<Empleados> empleados = new ArrayList<>();
//        ArrayList<Encargados> encargados = new ArrayList<>();
//        ArrayList<Producto> prods = new ArrayList<>();
//        ArrayList<ProductoDelPedido> pdps1 = new ArrayList<>();
//        ArrayList<ProductoDelPedido> pdps2 = new ArrayList<>();
//        ArrayList<ProductoDelPedido> pdps3 = new ArrayList<>();
//        ArrayList<Pedido> pedidos = new ArrayList<>();
//
//        //Se instancian las clases
//        Clientes cliente1 = new Clientes("c1@mail.com", "c1", "ApellidoCliente1", "NombreCliente1");
//        Clientes cliente2 = new Clientes("c2@mail.com", "c2", "ApellidoCliente2", "NombreCliente2");
//        Clientes cliente3 = new Clientes("c3@mail.com", "c3", "ApellidoCliente3", "NombreCliente3");
//
//        Empleados empleado1 = new Empleados("em1@mail.com", "em1", "ApellidoEmpleado1", "NombreEmpleado1");
//        Empleados empleado2 = new Empleados("em2@mail.com", "em2", "ApellidoEmpleado2", "NombreEmpleado2");
//        Empleados empleado3 = new Empleados("em3@mail.com", "em3", "ApellidoEmpleado3", "NombreEmpleado3");
//
//        Encargados encargado1 = new Encargados("en1@mail.com", "en1", "ApellidoEncargado1", "NombreEncargado1");
//        Encargados encargado2 = new Encargados("en2@mail.com", "en2", "ApellidoEncargado2", "NombreEncargado2");
//        Encargados encargado3 = new Encargados("en3@mail.com", "en3", "ApellidoEncargado3", "NombreEncargado3");
//
//        Producto producto1 = new Producto(1, "Producto1", Categoria.ENTRADA, Estado.DISPONIBLE, 15.2f);                
//        Producto producto2 = new Producto(2, "Producto2", Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE, 50.0f);
//        Producto producto3 = new Producto(3, "Producto3", Categoria.POSTRE, Estado.DISPONIBLE, 20.2f);
//
//        ProductoDelPedido pdp1 = new ProductoDelPedido(producto1, 3);
//        ProductoDelPedido pdp2 = new ProductoDelPedido(producto2, 2);
//        ProductoDelPedido pdp3 = new ProductoDelPedido(producto3, 1);
//        
//        //Agregado de objetos a los ArrayLists
//        clientes.add(cliente1);
//        clientes.add(cliente2);
//        clientes.add(cliente2);
//
//        empleados.add(empleado1);
//        empleados.add(empleado2);
//        empleados.add(empleado3);
//
//        encargados.add(encargado1);
//        encargados.add(encargado2);
//        encargados.add(encargado3);
//
//        prods.add(producto1);
//        prods.add(producto2);
//        prods.add(producto3);
//        
//        pdps1.add(pdp1);
//        pdps2.add(pdp2);
//        pdps3.add(pdp3);
//        pdps3.add(pdp2);
//        
//        Pedido pedido1 = new Pedido(1, LocalDateTime.now(), pdps1, cliente1);
//        Pedido pedido2 = new Pedido(2, LocalDateTime.now(), pdps2, cliente2);
//        Pedido pedido3 = new Pedido(3, LocalDateTime.now(), pdps3, cliente3);
//        
//        pedidos.add(pedido1);
//        pedidos.add(pedido2);
//        pedidos.add(pedido3);
//        
//        //Se muestran las instancias recorriendo cada ArrayList
//        for (Producto p : prods) {
//            p.mostrar();
//            System.out.println();
//        }
//        
//        System.out.println();
//        System.out.println();
//        
//        for (Clientes c : clientes) {
//            c.mostrar();
//            System.out.println();
//        }
//        
//        System.out.println();
//        System.out.println();
//        
//        for (Empleados e : empleados) {
//            e.mostrar();
//            System.out.println();
//        }
//        
//        System.out.println();
//        System.out.println();
//        
//        for (Encargados e2 : encargados) {
//            e2.mostrar();
//            System.out.println();
//        }
//        
//        System.out.println();
//        System.out.println();
//        
//        //Se muestra un pedido
//        for (Pedido p2 : pedidos) {
//            p2.mostrar();
//            System.out.println();
//        }
//        
//        System.out.println();
//        System.out.println();
//    }
}
