/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author marti
 */
public enum Estado {
    //Atributos
    DISPONIBLE("Disponible"), NO_DISPONIBLE("No Disponible");
    private String value;
    
    //Constructor
    private Estado(String value){
        this.value=value;
    }
    
    ///Métodos
    @Override    
    public String toString() {
        return "Estado{" + this.value+ "}" ;
    }
}
