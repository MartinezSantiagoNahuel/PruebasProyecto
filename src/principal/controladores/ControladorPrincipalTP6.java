/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import interfaces.IGestorPedidos;
import interfaces.IGestorProductos;
import interfaces.IGestorUsuarios;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import pedido.modelos.GestorPedidos;
import pedido.modelos.ProductoDelPedido;
import productos.modelos.Categoria;
import productos.modelos.Estado;
import productos.modelos.GestorProductos;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.GestorUsuarios;
import usuarios.modelos.Perfil;

/**
 *
 * @author Ana Kuenneth
 */
public class ControladorPrincipalTP6 {
    public static void main(String[] args) {
       IGestorPedidos gestorPedidos = GestorPedidos.crear();
        IGestorUsuarios gestorUsuarios = GestorUsuarios.crear();
        IGestorProductos gestorProductos = GestorProductos.instanciar();  
        
        //GESTOR PRODUCTOS**********************************************************
        //Productos
        System.out.println();
        System.out.println("2."+gestorProductos.crearProducto(2, "Producto2", 2, Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE));
        System.out.println("1."+gestorProductos.crearProducto(1, "Producto1", 1, Categoria.ENTRADA, Estado.DISPONIBLE));
        System.out.println("4."+gestorProductos.crearProducto(4, "Producto4", 4, Categoria.POSTRE, Estado.DISPONIBLE)); 
        System.out.println("3."+gestorProductos.crearProducto(3, "Producto3", 3, Categoria.ENTRADA, Estado.DISPONIBLE)); 
        System.out.println("5."+gestorProductos.crearProducto(5, "Producto5", 5, Categoria.ENTRADA, Estado.DISPONIBLE));
        
//        System.out.println("\nProductos:");
//        System.out.println("==========");
//        gestorProductos.mostrarProductos();
//        
//        System.out.println("\nResultado del metodo menu()");
//        System.out.println(gestorProductos.menu());
//        
//        System.out.println("\nResultado del metodo verProductosPorCategoria()");
//        System.out.println(gestorProductos.verProductosPorCategoria(Categoria.ENTRADA));
//        System.out.println(gestorProductos.verProductosPorCategoria(Categoria.PLATO_PRINCIPAL));
//        System.out.println(gestorProductos.verProductosPorCategoria(Categoria.POSTRE));

        
        //GESTOR USUARIOS****************************************************************
        //Clientes
        System.out.println("12."+gestorUsuarios.crearUsuario("cliente2@bar.com", "ApellidoCliente1", "NombreCliente2", Perfil.CLIENTE, "claveCliente2", "claveCliente2"));
        System.out.println("11."+gestorUsuarios.crearUsuario("cliente1@bar.com", "ApellidoCliente1", "NombreCliente1", Perfil.CLIENTE, "claveCliente1", "claveCliente1")); 
        System.out.println("44."+gestorUsuarios.crearUsuario("cliente4@bar.com", "ApellidoCliente4", "NombreCliente4", Perfil.CLIENTE, "claveCliente4", "claveCliente4")); 
        System.out.println("33."+gestorUsuarios.crearUsuario("cliente3@bar.com", "ApellidoCliente3", "NombreCliente3", Perfil.CLIENTE, "claveCliente3", "claveCliente3"));
        System.out.println("35."+gestorUsuarios.crearUsuario("cliente5@bar.com", "ApellidoCliente3", "NombreCliente5", Perfil.CLIENTE, "claveCliente5", "claveCliente5"));
        
//        System.out.println("\nResultado del metodo verUsuarios()");
//        gestorUsuarios.mostrarUsuarios();
//        System.out.println(gestorUsuarios.verUsuarios()); 
//        gestorUsuarios.mostrarUsuarios();

//        System.out.println("\nResultado del metodo buscarUsuarios()");
//        System.out.println(gestorUsuarios.buscarUsuarios("ApellidoCliente1")); //búsqueda estricta
//        System.out.println(gestorUsuarios.buscarUsuarios("apellidocliente1")); //búsqueda relajada
//        System.out.println(gestorUsuarios.buscarUsuarios("1")); //búsqueda parcial
//        System.out.println(gestorUsuarios.buscarUsuarios("apellido")); //búsqueda parcial
//        System.out.println(gestorUsuarios.buscarUsuarios("7")); //búsqueda parcial

        //GESTOR PEDIDOS**********************************************************
//        Producto productoExito = new Producto(1, "Producto1", 1, Categoria.ENTRADA, Estado.DISPONIBLE);
        Producto productoError = new Producto(0, "", Categoria.PLATO_PRINCIPAL, Estado.NO_DISPONIBLE, 0);
        ArrayList<ProductoDelPedido> productosDelPedido1 = new ArrayList<>();
        ProductoDelPedido pdp1 = new ProductoDelPedido(gestorProductos.menu().get(0), 1); //Se agrega producto exito
        ProductoDelPedido pdp2 = new ProductoDelPedido(productoError, 2);        
        if (!productosDelPedido1.contains(pdp1))
            productosDelPedido1.add(pdp1);
        if (!productosDelPedido1.contains(pdp2))
            productosDelPedido1.add(pdp2);
        ArrayList<ProductoDelPedido> productosDelPedido2 = new ArrayList<>();
        //Pedidos
        System.out.println();
        System.out.println("1."+gestorPedidos.crearPedido(LocalDate.now(), LocalTime.now(), productosDelPedido1, (Cliente)gestorUsuarios.verUsuarios().get(0)));
        System.out.println("2."+gestorPedidos.crearPedido(LocalDate.now(), LocalTime.now(), productosDelPedido1, (Cliente)gestorUsuarios.verUsuarios().get(3))); //fecha nula
        System.out.println("3."+gestorPedidos.crearPedido(LocalDate.now(), LocalTime.now(), productosDelPedido1, (Cliente)gestorUsuarios.verUsuarios().get(4))); //horario nulo
        System.out.println("4."+gestorPedidos.crearPedido(LocalDate.now(), LocalTime.now(), productosDelPedido1, (Cliente)gestorUsuarios.verUsuarios().get(2))); //pdp nulo
        System.out.println("5."+gestorPedidos.crearPedido(LocalDate.now(), LocalTime.now(), productosDelPedido1, (Cliente)gestorUsuarios.verUsuarios().get(1))); //pdp vacío

        System.out.println("\nPedidos:");
        System.out.println("==========");
        gestorPedidos.mostrarPedidos();
        
        System.out.println("\nResultado del metodo verPedidos()");
        System.out.println(gestorPedidos.verPedidos());

        System.out.println("\nPedidos:");
        System.out.println("==========");
        gestorPedidos.mostrarPedidos();
    }
}
