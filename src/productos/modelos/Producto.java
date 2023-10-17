/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author Ana Kuenneth
 */
public class Producto {
    //Atributos de la clase
    private Estado estado;
    private int codigo;
    private String descripcion;
    private float precio;
    private Categoria categoria;
    
    /**
     * Constructor
     * Instancia objetos del tipo Producto
     * @param codigo Código
     * @param descripcion Descripción del producto
     * @param categoria Categoría
     * @param estado Estado del producto
     * @param precio Precio producto
     */
    public Producto(int codigo, String descripcion, Categoria categoria, Estado estado, float precio) {
        this.estado = estado;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
    }

    //Métodos
    //Métodos GET/SET
    /**
     * Devuelve el estado
     * @return 
     */
    public Estado verEstado() {
        return estado;
    }
    /**
     * Asigna el estado al producto
     * @param estado 
     */
    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }
    
    /**
     * Devuelve el código del producto
     * @return codigo
     */
    public int verCodigo() {
        return codigo;
    }
    /**
     * Asigna el codigo a un producto
     * @param codigo 
     */
    public void asignarCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Devuelve la descripcion del producto
     * @return descripcion
     */
    public String verDescripcion() {
        return descripcion;
    }
    /**
     *Asigna el precio al producto
     * @param descripcion 
     */
    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Decuelve el precio de un producto
     * @return precio
     */
    public float verPrecio() {
        return precio;
    }
    /**
     * Asigna el precio de un producto
     * @param precio 
     */
    public void asignarPrecio(float precio) {
        this.precio = precio;
    }
 
    /**
     * Devuelve la categoría de un producto
     * @return categoria
     */
    public Categoria verCategoria() {
        return categoria;
    }
    /**
     * Asigna la categoría al producto
     * @param categoria 
     */
    public void asignarCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    /**
     * Muestra los atributos del producto creado
     */
    public void mostrar(){
        System.out.println("*** PRODUCTO: ");
        System.out.println("Estado: " + this.verEstado());
        System.out.println("Descripcion: " + this.verDescripcion());
        System.out.println("Codigo: " + this.verCodigo());
        System.out.println("Categoria: " + this.verCategoria());
        System.out.println("Precio: $" + this.verPrecio());
    }

    /**
     * Muestra la instancia en forma de String
     * @return Producto
     */
    @Override
    public String toString() {
        return "Producto{" + "estado=" + estado + ", codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", categoria=" + categoria + '}';
    }
    
}
