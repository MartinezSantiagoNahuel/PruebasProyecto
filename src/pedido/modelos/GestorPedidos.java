/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido.modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import usuarios.modelos.Cliente;

/**
 *
 * @author estudiante
 */
public class GestorPedidos {
    private static GestorPedidos gestor;
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    public static final String EXITO = "Pedido creado/modificado/cancelado con éxito";
    public static final String ERROR_FECHA = "La fecha del pedido es incorrecta";
    public static final String ERROR_HORA = "La hora del pedido es incorrecta";
    public static final String ERROR_PRODUCTOS_DEL_PEDIDO = "El pedido no tienen productos";
    public static final String ERROR_CLIENTE = "El pedido no tiene un cliente";
    public static final String ERROR_ESTADO = "El pedido no tiene un estado";
    public static final String ERROR_CANCELAR = "No se puede cancelar el pedido en este estado";
    public static final String PEDIDOS_DUPLICADOS = "Ya existe un pedido con ese número";
    public static final String PEDIDO_INEXISTENTE = "No existe el pedido especificado";
    public static final String VALIDACION_EXITO = "El pedido tiene los datos correctos";
    
    
    /**
     * Crea un nuevo pedido, devolviendo el resultado de la operación. Al crear el pedido, el mismo se agrega al 
     * cliente especificado (empleando el método agregarPedido() definido en la clase Cliente)
     * 
     * @param fecha
     * @param hora
     * @param productosDelPedido
     * @param cliente
     * @return 
     */
    public String crearPedido(LocalDate fecha, LocalTime hora, ArrayList<ProductoDelPedido> productosDelPedido, Cliente cliente){
        return "";
    }
//
    
    
    /**
     * //cambia el estado de un pedido. Si el pedido está en el estado Estado.CREADO lo pasa a Estado.PROCESANDO. 
     * Si el pedido está en el estado Estado.PROCESANDO lo pasa a Estado.ENTREGADO.
     * Devuelve el resultado de la operación.
     * @param pedidoAModificar
     * @return 
     */
    public String cambiarEstado(Pedido pedidoAModificar){
        return "";
    }

    
    /**
     * devuelve todos los pedidos
     * @return 
     */
    public ArrayList<Pedido> verPedidos(){
        return this.pedidos;
    }
    
    /**
     * devuelve true si hay al menos un pedido con el cliente especificado, false en caso contrario.
     * @param cliente
     * @return 
     */
//    public boolean hayPedidosConEsteCliente(Cliente cliente){
//            if(pedidos.contains(cliente)){
//            int posicion = pedidos.indexOf(productoAModificar);
//            Producto productoCambios = new Producto(codigo, descripcion, categoria, estado, precio);  
//           
//            boolean validacion = validarProducto(productoCambios);
//            if(validacion == true){
//                productos.set(posicion, productoCambios);
//                return EXITO; 
//            }
//            else{
//                return VALIDACION_ERROR;
//            }   
//        }
//        return PRODUCTO_INEXISTENTE;
//    }

    /**
     * Devuelve true si hay al menos un pedido con el producto especificado, false en caso contrario.
     * @param producto
     * @return 
     */
//    public boolean hayPedidosConEsteProducto(Producto producto){
//        
//    }

    
  /**
   * devuelve true si existe el pedido especificado, false en caso contrario.
   * @param pedido
   * @return 
   */  
//    public boolean existeEstePedido(Pedido pedido){
//
//    }
    
    
    /**
     * obtiene el pedido con el número especificado. Si no hay un pedido con el número, devuelve null.
     * @param numero
     * @return 
     */
//    public Pedido obtenerPedido(Integer numero){
//
//    }
        
}
