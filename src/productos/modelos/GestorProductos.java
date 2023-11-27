/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

import interfaces.IGestorProductos;
import java.util.ArrayList;

/**
 * Clase destinada a crear y manejar las instancias Producto
 * @author martinez
 */
public class GestorProductos implements IGestorProductos{
    //Atributos
    private static GestorProductos gestor;
    private ArrayList<Producto> productos = new ArrayList<>();
    
    /**
     * Constructor
     */
    private GestorProductos() {
    }
    
    //Métodos
    /**
     * Mecanismo para que sólo se pueda crear una instancia de GestorProductos.
     * @return gestor como única instancia
     */
    public static GestorProductos crear(){
        if(gestor == null){
            gestor = new GestorProductos();
        }
        return gestor;
    }
    
    /**
     * Crea un nuevo producto
     * @param codigo Código del producto
     * @param descripcion Descripción del producto
     * @param precio Precio del producto
     * @param categoria Categoría del producto
     * @param estado Estado del producto
     * @return Resultado de la operación
     */
    @Override
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        String validacion = validarProducto(codigo, descripcion, precio, categoria, estado);
        if(validacion.equals(this.VALIDACION_EXITO)){
            Producto producto = new Producto(codigo, descripcion, precio, categoria, estado);
            return agregarProducto(producto);
        }
        else {
            return validacion;
        }
    }
    
    /**
     * Modifica un producto
     * @param productoAModificar Producto que debe ser modificado
     * @param codigo Nuevo código
     * @param descripcion Nueva descripción
     * @param precio Nuevo precio
     * @param categoria Nueva categoría
     * @param estado Nuevo estado
     * @return Resultado de la operación
     */
    @Override
    public String modificarProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        if(this.productos.contains(productoAModificar)){
            int posicion = this.productos.indexOf(productoAModificar);
            Producto productoCambios = new Producto(codigo, descripcion, precio, categoria, estado);  
           
            String validacion = validarProducto(codigo, descripcion, precio, categoria, estado);
            if(validacion.equals(this.VALIDACION_EXITO)){
                this.productos.set(posicion, productoCambios);
                return this.EXITO; 
            }
            else{
                return validacion;
            }   
        }
        return this.PRODUCTO_INEXISTENTE;  
    }   
   
    /**
     * Devuelve todos los productos
     * @return Productos del menú del restaurante
     */
    @Override
    public ArrayList<Producto> menu(){
        return this.productos;
    }
    
    /**
     * Busca si existen productos con la descripción especificada (total o parcialmente).
     * @param descripcion Descripción del producto a buscar
     * @return Lista de productos con la descripción ingresada
     */
    @Override
    public ArrayList<Producto> buscarProductos(String descripcion){
        ArrayList<Producto> productosDesc = new ArrayList<>();
        for(Producto p : this.productos){
            if(p.verDescripcion().toLowerCase().contains(descripcion.toLowerCase())){
                productosDesc.add(p);
            }
        }
        return productosDesc;
    }
    
    /**
     * Devuelve true si existe el producto especificado, false en caso contrario.
     * @param producto Producto posible del menu
     * @return True or False, producto existente o no
     */
    @Override
    public boolean existeEsteProducto(Producto producto){
        for(Producto p : this.productos){
            if(p.verCodigo() == producto.verCodigo()){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Devuelve los productos con la categoría especificada
     * @param categoria Categoría de productos
     * @return Lista con todos los productos de la categoría ingresada
     */
    @Override
    public ArrayList<Producto> verProductosPorCategoria(Categoria categoria){
        ArrayList<Producto> productosCat = new ArrayList<>();
        for (Producto p : this.productos) {
            if (p.verCategoria().equals(categoria)) {
                productosCat.add(p);
            }
        }   
        return productosCat;
    }
    
    /**
     * Obtiene el producto con el código especificado
     * Si no hay un producto con el código, devuelve null.
     * @param codigo Código de un producto
     * @return El producto con el código ingresado
     */
    @Override
    public Producto obtenerProducto(Integer codigo){
        for(Producto p : this.productos){
            if(p.verCodigo() == codigo){
                return p;
            }
        }
        return null;
    }
    
    /**
     * Borra un producto siempre y cuando no haya pedidos con el mismo
     * @param producto Producto a eliminar
     * @return Resultado de la operación
     */
    @Override
    public String borrarProducto(Producto producto) {
        return "";
    }
    
    //Métodos auxiliares
    /**
     * Verifica si un producto cumple con los requisitos
     * @param codigo Código del producto
     * @param descripcion Descripción del producto
     * @param precio Precio del producto
     * @param categoria Categoria del producto
     * @param estado Estado del producto
     * @return Resultado de la operación
     */
    public String validarProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado){       
        if(codigo <= 0){
            return this.ERROR_CODIGO;
        }
        if(descripcion == null || descripcion.isEmpty()){
            return this.ERROR_DESCRIPCION;
        }
        if(precio <= 0.0f){
            return this.ERROR_PRECIO;
        }
        if(categoria == null){
            return this.ERROR_CATEGORIA;
        }
        if(estado == null){
            return this.ERROR_ESTADO;
        }
        
        return this.VALIDACION_EXITO;
    }
    
    /**
     * Agrega un producto a la lista dependiendo de si ya está agregado o no
     * @param producto Un producto
     * @return Resultado de la operación
     */
    public String agregarProducto(Producto producto){
        if(this.productos.contains(producto)){ 
            return this.PRODUCTOS_DUPLICADOS;
        }
        else{
            this.productos.add(producto);
            return this.EXITO;
        }
    }
    
    /**
     * Método auxiliar para revisión desde consola
     */
    public void mostrarProductos(){
        for (Producto p : this.productos){
            p.mostrar();
        }
    }
}


