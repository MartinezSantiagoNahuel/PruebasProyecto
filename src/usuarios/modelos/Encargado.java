/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 * Atributos y comportamientos de los objetos creados como encargados
 * @author estudiante
 */
public class Encargado extends Usuario{
    //Atributos
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;

    /**
     * Constructor
     * Instancia objetos del tipo Encargados
     * @param correo Correo electrónico del encargado
     * @param clave Contraseña del encargado
     * @param apellido Apellido encargado
     * @param nombre Nombre encargado
     */
    public Encargado(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }

    //Métodos
    //Métodos GET/SET
    
    
    /**
     * Muestra los atributos del objeto creado
     */
    
    public void mostrar(){
        System.out.print("ENCARGADO: ");
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
