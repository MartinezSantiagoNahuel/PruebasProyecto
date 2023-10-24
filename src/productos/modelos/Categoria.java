/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 * Establece el tipo de un producto del restaurante
 * @author marti
 */
public enum Categoria {
    ENTRADA("Entrada"), PLATOPRINCIPAL("Plato Principal"), POSTRE("Postre");
    
    /**
     * Muestra el valor de la enumeración elegida
     */
    private String value;
    
    /**
     * Constructor
     * @param value value
     */
    private Categoria(String value){
        this.value=value;
    }
    
    /**
     * Muestra la instancia en forma de String, en este caso el valor elegido
     * @return value
     */
    @Override    
    public String toString() {
        return this.value;
    }
    
}
