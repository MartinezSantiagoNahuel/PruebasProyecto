/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.modelos;

import java.util.ArrayList;
import usuarios.modelos.Clientes;
import usuarios.modelos.Empleados;
import usuarios.modelos.Encargados;
import usuarios.modelos.Productos;


/**
 *
 * @author estudiante
 */
public class ControladorPrincipal
{
    
    public static void main (String[] args)
    {
        
        ArrayList<Clientes> clientes = new ArrayList<>();
        ArrayList<Empleados> empleados = new ArrayList<>();
        ArrayList<Encargados> encargados = new ArrayList<>();
        ArrayList<Productos> productos = new ArrayList<>();
        
        Clientes cliente1 = new Clientes();
        Clientes cliente2 = new Clientes();
        Clientes cliente3 = new Clientes();
        
        Empleados empleado1 = new Empleados();
        Empleados empleado2 = new Empleados();
        Empleados empleado3 = new Empleados();

        Encargados encargado1 = new Encargados();
        Encargados encargado2 = new Encargados();
        Encargados encargado3 = new Encargados();

        Productos producto1 = new Productos();
        Productos producto2 = new Productos();
        Productos producto3 = new Productos();
        
        //Asigno valores
        cliente1.nombre= "c1";
        cliente2.nombre= "c2";
        cliente3.nombre= "c3";
        
        cliente1.apellido="c1";
        cliente2.apellido="c1";
        cliente3.apellido="c1";
        
        cliente1.correo="c1@mail.com";
        cliente2.correo="c2@mail.com";
        cliente3.correo="c3@mail.com";
        
        cliente1.clave="c1";
        cliente2.clave="c2";
        cliente3.clave="c3";
        //
        empleado1.nombre= "c1";
        empleado2.nombre= "c2";
        empleado3.nombre= "c3";
        
        empleado1.apellido="c1";
        empleado2.apellido="c1";
        empleado3.apellido="c1";
        
        empleado1.correo="c1@mail.com";
        empleado2.correo="c2@mail.com";
        empleado3.correo="c3@mail.com";
        
        empleado1.clave="c1";
        empleado2.clave="c2";
        empleado3.clave="c3";
        //
        encargado1.nombre= "c1";
        encargado2.nombre= "c2";
        encargado3.nombre= "c3";
        
        encargado1.apellido="c1";
        encargado2.apellido="c1";
        encargado3.apellido="c1";
        
        encargado1.correo="c1@mail.com";
        encargado2.correo="c2@mail.com";
        encargado3.correo="c3@mail.com";
        
        encargado1.clave="c1";
        encargado2.clave="c2";
        encargado3.clave="c3";
        //
        producto1.nombre="p1";
        producto2.nombre="p1";
        producto3.nombre="p1";
        
        producto1.categoria="p1";
        producto2.categoria="p1";
        producto3.categoria="p1";
        
        producto1.descripcion="p1";
        producto2.descripcion="p1";
        producto3.descripcion="p1";
        
        producto1.precio=1.2f;
        producto2.precio=1.2f;
        producto3.precio=1.2f;
        
        producto1.estado="disponible";
        producto2.estado="disponible";
        producto3.estado="disponible";
        
        producto1.codigo=1;
        producto2.codigo=2;
        producto3.codigo=3;
        
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
        
        
        for (Clientes unCliente : clientes) 
        {
            
            System.out.println(unCliente.nombre);
            System.out.println(unCliente.apellido);
            System.out.println(unCliente.correo);
            System.out.println(unCliente.clave);
            
        }
        
        for (Empleados unEmpleado : empleados) 
        {
            
            System.out.println(unEmpleado.nombre);
            System.out.println(unEmpleado.apellido);
            System.out.println(unEmpleado.correo);
            System.out.println(unEmpleado.clave);
            
            
        }
        
        for (Encargados unEncargado : encargados) 
        {
            
            System.out.println(unEncargado.nombre);
            System.out.println(unEncargado.apellido);
            System.out.println(unEncargado.correo);
            System.out.println(unEncargado.clave);
            
            
        }
        
        for (Productos unProducto : productos) 
        {
            
            System.out.println(unProducto.nombre);
            System.out.println(unProducto.estado);
            System.out.println(unProducto.descripcion);
            System.out.println(unProducto.estado);
            System.out.println(unProducto.categoria);
            System.out.println(unProducto.precio);
            
        }
        
    }
}
    
