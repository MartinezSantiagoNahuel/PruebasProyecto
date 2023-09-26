/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.util.ArrayList;
import usuarios.modelos.Clientes;
import usuarios.modelos.Empleados;
import usuarios.modelos.Encargados;
import productos.modelos.Productos;

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {

    public static void main(String[] args) {

        ArrayList<Clientes> clientes = new ArrayList<>();
        ArrayList<Empleados> empleados = new ArrayList<>();
        ArrayList<Encargados> encargados = new ArrayList<>();
        ArrayList<Productos> productos = new ArrayList<>();

        Clientes cliente1 = new Clientes("c1@mail.com", "c1", "c1", "c1");
        Clientes cliente2 = new Clientes("c2@mail.com", "c2", "c2", "c2");
        Clientes cliente3 = new Clientes("c3@mail.com", "c3", "c3", "c3");

        Empleados empleado1 = new Empleados("c1@mail.com", "c1", "c1", "c1");
        Empleados empleado2 = new Empleados("c2@mail.com", "c2", "c2", "c2");
        Empleados empleado3 = new Empleados("c3@mail.com", "c3", "c3", "c3");

        Encargados encargado1 = new Encargados("c1@mail.com", "c1", "c1", "c1");
        Encargados encargado2 = new Encargados("c2@mail.com", "c2", "c2", "c2");
        Encargados encargado3 = new Encargados("c3@mail.com", "c3", "c3", "c3");

        Productos producto1 = new Productos("p1", "disponible", 1, "p1", 1.2f, "p1");
        Productos producto2 = new Productos("p2", "disponible", 2, "p2", 1.2f, "p2");
        Productos producto3 = new Productos("p3", "disponible", 3, "p3", 1.2f, "p3");

        //Asigno valores
//        cliente1.verNombre() = "c1";
//        cliente2.verNombre() = "c2";
//        cliente3.verNombre() = "c3";
//
//        cliente1.verApellido() = "c1";
//        cliente2.verApellido() = "c1";
//        cliente3.verApellido() = "c1";
//
//        cliente1.verCorreo() = "c1@mail.com";
//        encargado1.verClave() = "c1";
//        encargado2.verClave() = "c2";
//        encargado3.verClave() = "c3";
//        //
//        cliente2.verCorreo() = "c2@mail.com";
//        cliente3.verCorreo() = "c3@mail.com";
//
//        cliente1.verClave() = "c1";
//        cliente2.verClave() = "c2";
//        cliente3.verClave() = "c3";
//
//        empleado1.verNombre() = "c1";
//        empleado2.verNombre() = "c2";
//        empleado3.verNombre() = "c3";
//
//        empleado1.verApellido() = "c1";
//        empleado2.verApellido() = "c1";
//        empleado3.verApellido() = "c1";
//
//        empleado1.verCorreo() = "c1@mail.com";
//        empleado2.verCorreo() = "c2@mail.com";
//        empleado3.verCorreo() = "c3@mail.com";
//
//        empleado1.verClave() = "c1";
//        empleado2.verClave() = "c2";
//        empleado3.verClave() = "c3";
//
//        encargado1.verNombre() = "c1";
//        encargado2.verNombre() = "c2";
//        encargado3.verNombre() = "c3";
//
//        encargado1.verApellido() = "c1";
//        encargado2.verApellido() = "c1";
//        encargado3.verApellido() = "c1";
//
//        encargado1.verCorreo() = "c1@mail.com";
//        encargado2.verCorreo() = "c2@mail.com";
//        encargado3.verCorreo() = "c3@mail.com";
//
//        encargado1.verClave() = "c1";
//        encargado2.verClave() = "c2";
//        encargado3.verClave() = "c3";
//
//        producto1.verNombre() = "p1";
//        producto2.verNombre() = "p1";
//        producto3.verNombre() = "p1";
//
//        producto1.verCategoria() = "p1";
//        producto2.verCategoria() = "p1";
//        producto3.verCategoria() = "p1";
//
//        producto1.verDescripcion() = "p1";
//        producto2.verDescripcion() = "p1";
//        producto3.verDescripcion() = "p1";
//
//        producto1.verPrecio() = 1.2f;
//        producto2.verPrecio() = 1.2f;
//        producto3.verPrecio() = 1.2f;
//
//        producto1.verEstado() = "disponible";
//        producto2.verEstado() = "disponible";
//        producto3.verEstado() = "disponible";
//
//        producto1.codigo = 1;
//        producto2.codigo = 2;
//        producto3.codigo = 3;  
        

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

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        for (Clientes unCliente : clientes) {

            System.out.println(unCliente.verNombre());
            System.out.println(unCliente.verApellido());
            System.out.println(unCliente.verCorreo());
            System.out.println(unCliente.verClave());
            
        }

        for (Empleados unEmpleado : empleados) {

            System.out.println(unEmpleado.verNombre());
            System.out.println(unEmpleado.verApellido());
            System.out.println(unEmpleado.verCorreo());
            System.out.println(unEmpleado.verClave());

        }

        for (Encargados unEncargado : encargados) {

            System.out.println(unEncargado.verNombre());
            System.out.println(unEncargado.verApellido());
            System.out.println(unEncargado.verCorreo());
            System.out.println(unEncargado.verClave());

        }

        for (Productos unProducto : productos) {

            System.out.println(unProducto.verNombre());
            System.out.println(unProducto.verEstado());
            System.out.println(unProducto.verDescripcion());
            System.out.println(unProducto.verCodigo());
            System.out.println(unProducto.verCategoria());
            System.out.println(unProducto.verPrecio());
        }

    }
}
