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
import productos.modelos.Categoria;
//import productos.modelos.Estado;

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {

    public static void main(String[] args) {
        //Implementación de ArrayLists para el guardado de cada tipo de objetos
        ArrayList<Clientes> clientes = new ArrayList<>();
        ArrayList<Empleados> empleados = new ArrayList<>();
        ArrayList<Encargados> encargados = new ArrayList<>();
        ArrayList<Producto> prods = new ArrayList<>();
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

        Producto producto1 = new Producto(1, "Comida1", Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE, 15.2f);                
        Producto producto2 = new Producto(2, "Comida2", Categoria.PLATO_PRINCIPAL, productos.modelos.Estado.DISPONIBLE, 50.0f);
        Producto producto3 = new Producto(3, "Comida3", Categoria.POSTRE, productos.modelos.Estado.DISPONIBLE, 20.2f);

        Pedido pedido1 = new Pedido(1, LocalDateTime.now(), Estado.CREADO, cliente1);
        Pedido pedido2 = new Pedido(2, LocalDateTime.now(), Estado.SOLICITADO, cliente2);
        Pedido pedido3 = new Pedido(3, LocalDateTime.now(), Estado.PROCESANDO, cliente3);
        
        
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
