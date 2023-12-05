/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import java.util.List;
import pedido.modelos.GestorPedidos;
import pedido.modelos.Pedido;

/**
 * Atributos y comportamientos de los objetos creados como empleados
 *
 * @author estudiante
 */
public class Empleado extends Usuario {
    //Atributos heredados de la super clase Usuario (correo, clave, apellido, nombre)

    /**
     * Constructor Instancia objetos del tipo Empleados
     *
     * @param correo Correo electrónico del empleado
     * @param clave Contraseña del empleado
     * @param apellido Apellido del empleado
     * @param nombre Nombre del empleado
     */
    public Empleado(String correo, String apellido, String nombre, String clave) {
        super(correo, apellido, nombre, clave);
    }

    //Métodos
    //Métodos GET/SET heredados
    //Método mostrar() heredado
    /**
     * Método hashCode Establece y devuelve el código hash del objeto a partir
     * de su correos (correo electrónico del Empleado) Email debe ser único para
     * cada objeto del tipo Empleado
     *
     * @return hash
     */
    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     * Método equals Compara dos objetos del tipo Empleado a partir de sus
     * correos
     *
     * @param obj obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     * Método que devuelve todos los pedidos creados Se utiliza el patrón
     * Singleton
     *
     * @return pedidos
     */
    @Override
    public List<Pedido> verPedidos() {
        GestorPedidos gp = GestorPedidos.crear();
        return gp.verPedidos();
    }
}
