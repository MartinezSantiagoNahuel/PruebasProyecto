/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pedidos.modelos;

/**
 *
 * @author Ana Kuenneth
 */
public enum Estado {
    //Variable de instancia
    CREADO("Creado"), SOLICITADO("Solicitado"), PROCESANDO("Procesando"), ENTREGRADO("Entregado");
    private String value;

    //Constructor
    private Estado(String value) {
        this.value = value;
    }
    
    //Métodos
    @Override
    public String toString() {
        return "Estado{" + "value=" + this.value + '}';
    }
    
}
