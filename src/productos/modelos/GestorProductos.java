/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

import java.util.ArrayList;

/**
 *
 * @author marti
 */
public class GestorProductos {
    //Atributos
    private static GestorProductos gestor;
    private ArrayList<Producto> productos = new ArrayList<>();
    
    public static final String ERROR_CODIGO = "El código del producto es incorrecto";
    public static final String EXITO = "Producto creado/modificado con éxito";
    public static final String ERROR_DESCRIPCION = "La descripción del producto es incorrecta";
    public static final String ERROR_PRECIO = "El precio del producto es incorrecto";
    public static final String ERROR_CATEGORIA = "La categoría del producto es incorrecta";
    public static final String ERROR_ESTADO = "El precio del producto es incorrecto";
    public static final String PRODUCTOS_DUPLICADOS = "Ya existe un producto con ese código";
    public static final String VALIDACION_EXITO = "Los datos del producto son correctos";
    public static final String VALIDACION_ERROR = "Los datos del producto son incorrectos";
    public static final String PRODUCTO_INEXISTENTE = "No existe el producto especificado";
    
    //Constructor
    private GestorProductos() {
    }
    
    //Métodos
    /**
     * 
     * @return 
     */
    public static GestorProductos crear(){
        if(gestor == null){
            gestor = new GestorProductos();
        }
        return gestor;
    }
    
    /**
     * 
     * @param codigo Código del producto
     * @param descripcion Descripción del producto
     * @param precio Precio del producto
     * @param categoria Categoría del producto
     * @param estado Estado del producto
     * @return Descripción de la operación
     */
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        
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
        
        Producto producto = new Producto(codigo, descripcion, categoria, estado, precio);
        if(productos.contains(producto)){ 
            return this.PRODUCTOS_DUPLICADOS;
        }
        else{
            productos.add(producto);
            return this.EXITO;
        }
        
    } 
    
    /**
     * 
     * @param productoAModificar
     * @param codigo
     * @param descripcion
     * @param precio
     * @param categoria
     * @param estado
     * @return 
     */
    public String modificarProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        if(productos.contains(productoAModificar)){
            int posicion = productos.indexOf(productoAModificar);
            Producto productoCambios = new Producto(codigo, descripcion, categoria, estado, precio);  
           
            boolean validacion = validarProducto(productoCambios);
            if(validacion == true){
                productos.set(posicion, productoCambios);
                return EXITO; 
            }
            else{
                return VALIDACION_ERROR;
            }   
        }
        return PRODUCTO_INEXISTENTE;  
    }   
   
    /**
     * 
     * @return Productos del Menú del restaurante
     */
    public ArrayList<Producto> menu(){
        return this.productos;
    }
    
    /**
     * 
     * @param descripcion Descripción del producto
     * @return Lista de productos con la descripción ingresada
     */
    public ArrayList<Producto> buscarProductos(String descripcion){
        ArrayList<Producto> productosDesc = new ArrayList<>();
        for(Producto p : productos){
            if(p.verDescripcion().toLowerCase().contains(descripcion.toLowerCase())){
                productosDesc.add(p);
            }
        }
        return productosDesc;
    }
    
    /**
     * devuelve true si existe el producto especificado, false en caso contrario.
     * @param producto Producto posible del menu
     * @return True or False
     */
    public boolean existeEsteProducto(Producto producto){
        for(Producto p : productos){
            if(p.verCodigo() == producto.verCodigo()){
                return true;
            }
        }
        return false;
    }
    
    /**
     * 
     * @param categoria Una categoría de los productos
     * @return Lista con todos los productos de la categoría ingresada
     */
    public ArrayList<Producto> verProductosPorCategoria(Categoria categoria){
        ArrayList<Producto> productosCat = new ArrayList<>();
        for (Producto p : productos) {
            if (p.verCategoria() == categoria) {
                productosCat.add(p);
            }
        }   
        return productosCat;
    }
    
    /**
     * 
     * @param codigo Código de un producto
     * @return El producto con el código ingresado
     */
    public Producto obtenerProducto(Integer codigo){
        for(Producto p : productos){
            if(p.verCodigo() == codigo){
                return p;
            }
        }
        return null;
    }
    
    
    //Métodos auxiliares
    /**
     * Verifica si un producto cumple con los requerimientos
     * @param producto Producto del menu
     * @return true or false. producto validado o no
     */
    public Boolean validarProducto(Producto producto){
        if(producto.verCodigo() <= 0){
            return false;
        }
        
        if(producto.verDescripcion() == null || producto.verDescripcion().isEmpty()){
            return false;
        }
        
        if(producto.verPrecio() <= 0.0f){
            return false;
        } 
        
        if(producto.verCategoria() == null){
            return false;
        } 
        
        if(producto.verEstado() == null){
            return false;
        }
        
        System.out.println(VALIDACION_EXITO);
        return true;
    }
    
}


