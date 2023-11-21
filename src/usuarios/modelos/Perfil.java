/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author estudiante
 */
public enum Perfil {
    CLIENTE("Cliente"), EMPLEADO("Empleado"), ENCARGADO("Encargado");
    
    /**
     * Guarda el valor de la enumeración elegida
     */
    private String value;
    
    /**
     * Constructor
     * @param value value
     */
    private Perfil(String value){
        this.value = value;
    }
    
    ///Métodos
    /**
     * Muestra la instancia en forma de String, en este caso el valor elegido
     * @return value
     */
    @Override    
    public String toString() {
        return this.value ;
    }
}
