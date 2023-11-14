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
      
    
    public static GestorProductos crear(){
        if(gestor == null){
            gestor = new GestorProductos();
        }
        return gestor;
    }
    
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
            
            return PRODUCTOS_DUPLICADOS;
        }
        else{
            productos.add(producto);
            return EXITO;
        }
        
    } 
    
    //consultar
    public String modificarProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        
        if(productos.contains(productoAModificar)){
            int posicion = productos.indexOf(productoAModificar);
            Producto prod = new Producto(codigo, descripcion, categoria, estado, precio);  
           
            boolean existencia = validarProducto(prod);
            if(existencia == true){
                productos.set(posicion, prod);
                return EXITO; 
            }
            else{
                return VALIDACION_ERROR;
            }
            
        }
        return PRODUCTO_INEXISTENTE;  
    }   
   
    
    public ArrayList<Producto> menu(){
        return this.productos;
    }
    
    public ArrayList<Producto> buscarProductos(String descripcion){
        ArrayList<Producto> productosDesc = new ArrayList<>();
        for(Producto p : productos){
            if(descripcion.equalsIgnoreCase(p.verDescripcion())){
                productosDesc.add(p);
            }
        }
        
        return productosDesc;
    }
    
    
    public boolean existeEsteProducto(Producto producto){
        for(Producto p : productos){
            if(p.verCodigo() == producto.verCodigo()){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Producto> verProductosPorCategoria(Categoria categoria){
        ArrayList<Producto> productosCat = new ArrayList<>();
        for (Producto p : productos) {
            if (p.verCategoria() == categoria) {
                productosCat.add(p);
            }
        }   
        return productosCat;
    }
    
    public Producto obtenerProducto(Integer codigo){
        for(Producto p : productos){
            if(p.verCodigo() == codigo){
                return p;
            }
        }
        return null;
    }
    
    
    //metodo auxiliar
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
        } //consultar
        System.out.println(VALIDACION_EXITO);
        return true;
    }
    
}

