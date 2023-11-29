/**
 *  Clase que contiene al método principal del proyecto
 * @author estudiante
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import interfaces.IGestorPedidos;
import interfaces.IGestorProductos;
import interfaces.IGestorUsuarios;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import pedido.modelos.GestorPedidos;
import pedido.modelos.Pedido;
import pedido.modelos.ProductoDelPedido;
import productos.modelos.Categoria;
import productos.modelos.Estado;
import productos.modelos.GestorProductos;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import usuarios.modelos.GestorUsuarios;
import usuarios.modelos.Perfil;
import usuarios.modelos.Usuario;

/**
 *
 * @author Ana Kuenneth
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
    
        IGestorPedidos gestorPedidos = GestorPedidos.crear();
        IGestorUsuarios gestorUsuarios = GestorUsuarios.crear();
        IGestorProductos gestorProductos = GestorProductos.crear();
        
        //GESTOR USUARIOS****************************************************************
        //Clientes
        System.out.println("1."+gestorUsuarios.crearUsuario("cliente1@bar.com", "ApellidoCliente1", "NombreCliente1", Perfil.CLIENTE, "claveCliente1", "claveCliente1"));
//        System.out.println("2."+gestorUsuarios.crearUsuario("cliente1@bar.com", "ApellidoCliente2", "NombreCliente2", Perfil.CLIENTE, "claveCliente2", "claveCliente2")); //cliente repetido
//        System.out.println("3."+gestorUsuarios.crearUsuario("cliente3@bar.com", "ApellidoCliente3", "NombreCliente3", Perfil.CLIENTE, "claveCliente3", "claveCliente")); //claves no coinciden
//        System.out.println("4."+gestorUsuarios.crearUsuario("cliente4bar.com", "ApellidoCliente4", "NombreCliente4", Perfil.CLIENTE, "claveCliente4", "claveCliente4")); //correo no coincide
//        System.out.println("5."+gestorUsuarios.crearUsuario("cliente5@bar.com", "", "NombreCliente5", Perfil.CLIENTE, "claveCliente5", "claveCliente5")); //apellido incorrecto
//        System.out.println("6."+gestorUsuarios.crearUsuario("cliente6@bar.com", "ApellidoCliente6", "", Perfil.CLIENTE, "claveCliente6", "claveCliente6")); //nombre incorrecto
        System.out.println("7."+gestorUsuarios.crearUsuario("cliente7@bar.com", "ApellidoCliente7", "NombreCliente7", Perfil.CLIENTE, "claveCliente7", "claveCliente7"));
//        System.out.println("\nUsuarios:");
//        System.out.println("==========");
//        gestorUsuarios.mostrarUsuarios();
        
        //Empleados
        System.out.println();
        System.out.println("1."+gestorUsuarios.crearUsuario("empleado1@bar.com", "ApellidoEmpleado1", "NombreEmpleado1", Perfil.EMPLEADO, "claveEmpleado1", "claveEmpleado1"));
//        System.out.println("2."+gestorUsuarios.crearUsuario("empleado1@bar.com", "ApellidoEmpleado2", "NombreEmpleado2", Perfil.EMPLEADO, "claveEmpleado2", "claveEmpleado2")); //empleado repetido
//        System.out.println("3."+gestorUsuarios.crearUsuario("empleado3@bar.com", "ApellidoEmpleado3", "NombreEmpleado3", Perfil.EMPLEADO, "claveEmpleado3", "claveEmpleado")); //claves no coinciden
//        System.out.println("4."+gestorUsuarios.crearUsuario("empleado4bar.com", "ApellidoEmpleado4", "NombreEmpleado4", Perfil.EMPLEADO, "claveEmpleado4", "claveEmpleado4")); //correo no coincide
//        System.out.println("5."+gestorUsuarios.crearUsuario("empleado5@bar.com", "", "NombreEmpleado5", Perfil.EMPLEADO, "claveEmpleado5", "claveEmpleado5")); //apellido incorrecto
//        System.out.println("6."+gestorUsuarios.crearUsuario("empleado6@bar.com", "ApellidoEmpleado6", "", Perfil.EMPLEADO, "claveEmpleado6", "claveEmpleado6")); //nombre incorrecto
        System.out.println("7."+gestorUsuarios.crearUsuario("empleado7@bar.com", "ApellidoEmpleado7", "NombreEmpleado7", Perfil.EMPLEADO, "claveEmpleado7", "claveEmpleado7"));
//        System.out.println("\nUsuarios:");
//        System.out.println("==========");
//        gestorUsuarios.mostrarUsuarios();
//        
        //Encargados
        System.out.println();
        System.out.println("1."+gestorUsuarios.crearUsuario("encargado1@bar.com", "ApellidoEncargado1", "NombreEncargado1", Perfil.ENCARGADO, "claveEncargado1", "claveEncargado1"));
//        System.out.println("2."+gestorUsuarios.crearUsuario("encargado1@bar.com", "ApellidoEncargado2", "NombreEncargado2", Perfil.ENCARGADO, "claveEncargado2", "claveEncargado2")); //encargado repetido
//        System.out.println("3."+gestorUsuarios.crearUsuario("encargado3@bar.com", "ApellidoEncargado3", "NombreEncargado3", Perfil.ENCARGADO, "claveEncargado3", "claveEncargado")); //claves no coinciden
//        System.out.println("4."+gestorUsuarios.crearUsuario("encargado4bar.com", "ApellidoEncargado4", "NombreEncargado4", Perfil.ENCARGADO, "claveEncargado4", "claveEncargado4")); //correo no coincide
//        System.out.println("5."+gestorUsuarios.crearUsuario("encargado5@bar.com", "", "NombreEncargado5", Perfil.ENCARGADO, "claveEncargado5", "claveEncargado5")); //apellido incorrecto
//        System.out.println("6."+gestorUsuarios.crearUsuario("encargado6@bar.com", "ApellidoEncargado6", "", Perfil.ENCARGADO, "claveEncargado6", "claveEncargado6")); //nombre incorrecto
        System.out.println("7."+gestorUsuarios.crearUsuario("encargado7@bar.com", "ApellidoEncargado7", "NombreEncargado7", Perfil.ENCARGADO, "claveEncargado7", "claveEncargado7"));
        System.out.println("\nUsuarios:");
        System.out.println("==========");
        gestorUsuarios.mostrarUsuarios();
        
//        System.out.println("\nResultado del metodo verUsuarios()");
//        System.out.println(gestorUsuarios.verUsuarios()); 
        
//        System.out.println("\nResultado del metodo buscarUsuarios()");
//        System.out.println(gestorUsuarios.buscarUsuarios("ApellidoCliente1")); //búsqueda estricta
//        System.out.println(gestorUsuarios.buscarUsuarios("apellidocliente1")); //búsqueda relajada
//        System.out.println(gestorUsuarios.buscarUsuarios("1")); //búsqueda parcial
//        System.out.println(gestorUsuarios.buscarUsuarios("apellido")); //búsqueda parcial
//        System.out.println(gestorUsuarios.buscarUsuarios("7")); //búsqueda parcial
//        
//        System.out.println("\nResultado del metodo existeEsteUsuario()");
//        Usuario usuarioTrue = new Cliente("cliente1@bar.com", "", "", "");
//        Usuario usuarioFalse = new Cliente("cliente1bar.com", "", "", "");
//        System.out.println(gestorUsuarios.existeEsteUsuario(usuarioTrue));
//        System.out.println(gestorUsuarios.existeEsteUsuario(usuarioFalse));
//        
//        System.out.println("\nResultado del metodo obtenerUsuario()");
//        System.out.println(gestorUsuarios.obtenerUsuario(""));
//        System.out.println(gestorUsuarios.obtenerUsuario("cliente1@bar.com"));
        
        
        //GESTOR PRODUCTOS**********************************************************
        //Productos
        System.out.println();
        System.out.println("1."+gestorProductos.crearProducto(1, "Producto1", 1, Categoria.ENTRADA, Estado.DISPONIBLE));
//        System.out.println("2."+gestorProductos.crearProducto(0, "Producto2", 2, Categoria.ENTRADA, Estado.DISPONIBLE)); //código incorrecto
//        System.out.println("3."+gestorProductos.crearProducto(3, "", 3, Categoria.ENTRADA, Estado.DISPONIBLE)); //descripcion incorrecta
//        System.out.println("4."+gestorProductos.crearProducto(4, "Producto4", 0, Categoria.ENTRADA, Estado.DISPONIBLE)); //precio incorrecto
//        System.out.println("5."+gestorProductos.crearProducto(5, "Producto5", 5, null, Estado.DISPONIBLE)); //sin categoría
//        System.out.println("6."+gestorProductos.crearProducto(6, "Producto6", 6, Categoria.ENTRADA, null)); //sin estado
//        System.out.println("7."+gestorProductos.crearProducto(1, "Producto7", 7, Categoria.ENTRADA, Estado.DISPONIBLE)); //producto repetido
        System.out.println("8."+gestorProductos.crearProducto(8, "Producto8", 8, Categoria.PLATOPRINCIPAL, Estado.NO_DISPONIBLE)); //producto repetido
        
        System.out.println("\nProductos:");
        System.out.println("==========");
        gestorProductos.mostrarProductos();
        
//        System.out.println("\nResultado del metodo modificarProducto()");
        Producto productoExito = new Producto(1, "Producto1", 1, Categoria.ENTRADA, Estado.DISPONIBLE);
        Producto productoError = new Producto(0, "", 0, Categoria.PLATOPRINCIPAL, Estado.NO_DISPONIBLE);
//        Producto modificacionError = new Producto(8, "", 0, Categoria.PLATOPRINCIPAL, Estado.NO_DISPONIBLE);
//        System.out.println(gestorProductos.modificarProducto(productoExito, 2, "cambio", 2, Categoria.ENTRADA, Estado.DISPONIBLE));
//        System.out.println(gestorProductos.modificarProducto(productoError, 9, "productoError", 2, Categoria.ENTRADA, Estado.DISPONIBLE));
//        System.out.println(gestorProductos.modificarProducto(modificacionError, 9, "", 2, Categoria.ENTRADA, Estado.DISPONIBLE));
//        
//        System.out.println("\nResultado del metodo menu()");
//        System.out.println(gestorProductos.menu());
//        
//        System.out.println("\nResultado del metodo buscarProductos()");
//        System.out.println(gestorProductos.buscarProductos("Producto1")); //búsqueda estricta
//        System.out.println(gestorProductos.buscarProductos("producto1")); //búsqueda relajada
//        System.out.println(gestorProductos.buscarProductos("1")); //búsqueda parcial
//        System.out.println(gestorProductos.buscarProductos("prod")); //búsqueda parcial
//        System.out.println(gestorProductos.buscarProductos("8")); //búsqueda parcial
//        
//        System.out.println("\nResultado del metodo existeEsteProducto()");
//        Producto productoTrue = new Producto(1, "", 0, Categoria.ENTRADA, Estado.DISPONIBLE);
//        Producto productoFalse = new Producto(0, "", 0, Categoria.PLATOPRINCIPAL, Estado.DISPONIBLE);
//        System.out.println(gestorProductos.existeEsteProducto(productoTrue));
//        System.out.println(gestorProductos.existeEsteProducto(productoFalse));
//        
//        System.out.println("\nResultado del metodo verProductosPorCategoria()");
//        System.out.println(gestorProductos.verProductosPorCategoria(Categoria.ENTRADA));
//        System.out.println(gestorProductos.verProductosPorCategoria(Categoria.PLATOPRINCIPAL));
//        System.out.println(gestorProductos.verProductosPorCategoria(Categoria.POSTRE));
        
//        System.out.println("\nResultado del metodo obtenerProducto()");
//        System.out.println(gestorProductos.obtenerProducto(200));
//        System.out.println(gestorProductos.obtenerProducto(1));

        //GESTOR PEDIDOS**********************************************************
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
//        System.out.println("2."+gestorPedidos.crearPedido(null, LocalTime.now(), productosDelPedido1, (Cliente)gestorUsuarios.verUsuarios().get(1))); //fecha nula
//        System.out.println("3."+gestorPedidos.crearPedido(LocalDate.now(), null, productosDelPedido1, (Cliente)gestorUsuarios.verUsuarios().get(0))); //horario nulo
//        System.out.println("4."+gestorPedidos.crearPedido(LocalDate.now(), LocalTime.now(), null, (Cliente)gestorUsuarios.verUsuarios().get(0))); //pdp nulo
//        System.out.println("5."+gestorPedidos.crearPedido(LocalDate.now(), LocalTime.now(), productosDelPedido2, (Cliente)gestorUsuarios.verUsuarios().get(0))); //pdp vacío
//        System.out.println("6."+gestorPedidos.crearPedido(LocalDate.now(), LocalTime.now(), productosDelPedido1, null)); //cliente nulo
        System.out.println("7."+gestorPedidos.crearPedido(LocalDate.now(), LocalTime.now(), productosDelPedido2, (Cliente)gestorUsuarios.verUsuarios().get(0)));
        
        System.out.println("\nPedidos:");
        System.out.println("==========");
        gestorPedidos.mostrarPedidos();
        
//        System.out.println("\nResultado del metodo cambiarEstado()");
//        Pedido pedidoExito = new Pedido(10, LocalDateTime.now(), productosDelPedido1, (Cliente)gestorUsuarios.verUsuarios().get(0));
//        System.out.println(pedidoExito.estado);
//        System.out.println(gestorPedidos.cambiarEstado(pedidoExito)); //Se modifica a PROCESANDO
//        System.out.println(pedidoExito.estado);
//        System.out.println(gestorPedidos.cambiarEstado(pedidoExito)); //Se modifica a ENTREGADO
//        System.out.println(pedidoExito.estado);
//        
//        System.out.println("\nResultado del metodo verPedidos()");
//        System.out.println(gestorPedidos.verPedidos());
//        
//        System.out.println("\nResultado del metodo hayPedidosConEsteCliente()");
//        System.out.println(gestorPedidos.hayPedidosConEsteCliente((Cliente)gestorUsuarios.verUsuarios().get(0))); //True
//        System.out.println(gestorPedidos.hayPedidosConEsteCliente((Cliente)gestorUsuarios.verUsuarios().get(1))); //False
//        
//        System.out.println("\nResultado del metodo hayPedidosConEsteProducto()");
//        System.out.println(gestorPedidos.hayPedidosConEsteProducto(gestorProductos.menu().get(0))); 
//        System.out.println(gestorPedidos.hayPedidosConEsteProducto(productoError));
        
        System.out.println("\nResultado del metodo existeEstePedido()");
        Pedido pedidoTrue = new Pedido(1, null, null, null);
        Pedido pedidoFalse = new Pedido(12, null, null, null);
        System.out.println(gestorPedidos.existeEstePedido(pedidoTrue));
        System.out.println(gestorPedidos.existeEstePedido(pedidoFalse));
        
        System.out.println("\nResultado del metodo obtenerPedido()");
        System.out.println(gestorPedidos.obtenerPedido(200));
        System.out.println(gestorPedidos.obtenerPedido(1));
        
        
        //--------------------------------
        // ---Métodos borrar y cancelar---
        //--------------------------------
        System.out.println("\nResultado del metodo borrarProducto()");
//        Producto noEstaEnLosPedidos = new Producto(3, "ProductoNEELP", 1, Categoria.ENTRADA, Estado.DISPONIBLE);
//        noEstaEnLosPedidos.mostrar();
//        System.out.println();
//        System.out.println(gestorProductos.crearProducto(3, "ProductoNEELP", 1, Categoria.ENTRADA, Estado.DISPONIBLE));
//        System.out.println();
//        System.out.println(gestorProductos.menu());
//        System.out.println();
//        gestorPedidos.mostrarPedidos();
//        System.out.println();
//        System.out.println(gestorProductos.borrarProducto(productoExito));
//        System.out.println(gestorProductos.menu());
//        System.out.println();
//        System.out.println(gestorProductos.borrarProducto(noEstaEnLosPedidos));
//        System.out.println(gestorProductos.menu());
        
        
        System.out.println("\nResultado del metodo borrarUsuario()");
//        Cliente clienteSiEsta = new Cliente ("cliente1@bar.com",  "claveCliente1", "ApellidoCliente1", "NombreCliente1");
//        Cliente noEstaEnLosPedidos = new Cliente("clienteX@bar.com", "ApellidoClienteX", "NombreClienteX", "claveClienteX");
//        noEstaEnLosPedidos.mostrar();
//        System.out.println();
//        System.out.println(gestorUsuarios.crearUsuario("clienteX@bar.com", "ApellidoClienteX", "NombreClienteX", Perfil.CLIENTE, "claveClienteX", "claveClienteX"));
//        System.out.println();
//        System.out.println(gestorUsuarios.verUsuarios());
//        System.out.println();
//        gestorPedidos.mostrarPedidos();
//        System.out.println();
//        System.out.println(gestorUsuarios.borrarUsuario(clienteSiEsta));
//        gestorUsuarios.mostrarUsuarios();
//        System.out.println();
//        System.out.println(gestorUsuarios.borrarUsuario(noEstaEnLosPedidos));
//        gestorUsuarios.mostrarUsuarios();

        System.out.println("\nResultado del metodo cancelarPedido()");
//        Cliente clienteSiEsta = new Cliente ("cliente1@bar.com",  "claveCliente1", "ApellidoCliente1", "NombreCliente1");
//        Cliente clienteNoPedido = new Cliente("clienteX@bar.com", "ApellidoClienteX", "NombreClienteX", "claveClienteX");
//        Pedido pedidoExito = new Pedido(10, LocalDateTime.now(), productosDelPedido1, clienteSiEsta);
//        Pedido pedidoEstaEnLaLista = new Pedido(10, LocalDateTime.now(), productosDelPedido1, clienteNoPedido);
//        pedidoExito.mostrar();
//        pedidoEstaEnLaLista.mostrar();
//        System.out.println();
//        System.out.println(gestorPedidos.verPedidos());
//        System.out.println();
//        gestorPedidos.mostrarPedidos();
//        System.out.println();
//        System.out.println(gestorPedidos.crearPedido(LocalDate.EPOCH, LocalTime.NOON, productosDelPedido1, clienteNoPedido));
//        gestorPedidos.mostrarPedidos();
//        System.out.println(gestorPedidos.cancelarPedido(pedidoExito));
//        gestorPedidos.mostrarPedidos();
//        System.out.println();
//        System.out.println(gestorPedidos.verPedidos());
//        gestorUsuarios.mostrarUsuarios();
        
        
    }
}
