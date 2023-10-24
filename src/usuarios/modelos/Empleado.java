/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 * Atributos y comportamientos de los objetos creados como empleados
 * @author estudiante
 */
public class Empleado extends Usuario{
   //Atributos
//    private String correo;
//    private String clave;
//    private String apellido;
//    private String nombre;

    /**
     * Constructor
     * Instancia objetos del tipo Empleados
     * @param correo Correo electrónico del empleado
     * @param clave Contraseña del empleado
     * @param apellido Apellido del empleado
     * @param nombre Nombre del empleado
     */
    public Empleado(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);

    }
    
    public void mostrar(){
        System.out.print("EMPLEADO: ");
        super.mostrar();
    }
    
    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
