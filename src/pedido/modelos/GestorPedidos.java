/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;

/**
 * Clase destinada a crear y manejar las instancias Pedido
 * @author estudiante
 */
public class GestorPedidos {
    private static GestorPedidos gestor;
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public static final String EXITO = "Pedido creado/modificado/cancelado con éxito";
    public static final String ERROR = "No se pudo crear/modificar el pedido";
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
     * Constructor
     */
    public GestorPedidos() {
    }
    
    /**
     * Mecanismo para que sólo se pueda crear una instancia de GestorPedidos
     * @return gestor como única instancia 
     */
    public static GestorPedidos crear(){
        if(gestor == null){
            gestor = new GestorPedidos();
        }
        return gestor;
    }
    
    /**
     * Crea un nuevo pedido
     * Al crear el pedido, el mismo se agrega al cliente especificado
     * (empleando el método agregarPedido() definido en la clase Cliente)
     * @param fecha Fecha de creación del pedido
     * @param hora Hora de creación del pedido
     * @param productosDelPedido Lista de productos a agregar en el nuevo pedido
     * @param cliente Cliente que hace el pedido
     * @return Resultado de la operación
     */
    public String crearPedido(LocalDate fecha, LocalTime hora, ArrayList<ProductoDelPedido> productosDelPedido, Cliente cliente){
        String validacion = validarPedido(fecha, hora, productosDelPedido, cliente);
        if(validacion.equals(this.VALIDACION_EXITO)){
            LocalDateTime fechaYhora = LocalDateTime.of(fecha, hora);
            int numPedido = this.pedidos.size() + 1;
            Pedido pedido = new Pedido(numPedido, fechaYhora, productosDelPedido, cliente);
            return agregarPedido(pedido);
        }
        else{
            return validacion;
        }
    }
    
    /**
     * Cambia el estado de un pedido
     * Si el pedido está en el estado Estado.CREADO lo pasa a Estado.PROCESANDO. 
     * Si el pedido está en el estado Estado.PROCESANDO lo pasa a Estado.ENTREGADO.
     * @param pedidoAModificar Pedido que hay que modificar
     * @return Resultado de la operación
     */
    public String cambiarEstado(Pedido pedidoAModificar){
        if(pedidoAModificar.estado.toString().toLowerCase().equalsIgnoreCase("Creado")){
            pedidoAModificar.estado = Estado.PROCESANDO;
            return this.EXITO;
        }
        if(pedidoAModificar.estado.toString().toLowerCase().equalsIgnoreCase("Procesando")){
            pedidoAModificar.estado = Estado.ENTREGRADO;
            return this.EXITO;
        }
        return this.ERROR_ESTADO;  
    }

    /**
     * Devuelve todos los pedidos
     * @return Lista de todos los pedidos
     */
    public ArrayList<Pedido> verPedidos(){
        return this.pedidos;
    }
    
    /**
     * Devuelve true si hay al menos un pedido con el cliente especificado, false en caso contrario.
     * @param cliente Cliente de un pedido
     * @return true or false
     */
    public boolean hayPedidosConEsteCliente(Cliente cliente){
        for(Pedido p : this.pedidos){
            if(p.verUnCliente().equals(cliente)){
                return true;
            } 
        }
        return false;
    }

    /**
     * Devuelve true si hay al menos un pedido con el producto especificado, false en caso contrario.
     * @param producto Un producto
     * @return true or false
     */
    public boolean hayPedidosConEsteProducto(Producto producto){
        for (Pedido pedido : this.pedidos){
            for(ProductoDelPedido pdp : pedido.verPdp()){
                if(pdp.verUnProducto().equals(producto)){
                    return true;
                }  
            }
        }
        return false;
    }
  
  /**
   * Devuelve true si existe el pedido especificado, false en caso contrario.
   * @param pedido Un pedido
   * @return true or false
   */  
    public boolean existeEstePedido(Pedido pedido){
        for(Pedido p : this.pedidos){
            if(p.verNumero() == pedido.verNumero()){
                return true;
            }
        }
        return false;
    }
       
    /**
     * Obtiene el pedido con el número especificado. Si no hay un pedido con el número, devuelve null.
     * @param numero Numero de un pedido
     * @return Pedido con el número especificado
     */
    public Pedido obtenerPedido(Integer numero){
        for(Pedido p : this.pedidos){
            if(p.verNumero() == numero){
                return p;
            }
        }
        return null;
    }
    
    //Métodos auxiliares
    /**
     * Verifica si un pedido cumple con los requisitos
     * @param fecha Fecha del pedido
     * @param hora Hora del pedido
     * @param productosDelPedido Lista de productos del pedido
     * @param cliente Cliente que hace el pedido
     * @return Resultado de la operación
     */
    public String validarPedido(LocalDate fecha, LocalTime hora, ArrayList<ProductoDelPedido> productosDelPedido, Cliente cliente){
        if (fecha == null){
            return this.ERROR_FECHA;
        }
        if (hora == null) {
            return this.ERROR_HORA;
        }
        if(cliente == null){
            return this.ERROR_CLIENTE;
        }
        if (productosDelPedido == null || productosDelPedido.isEmpty()) {
            return this.ERROR_PRODUCTOS_DEL_PEDIDO;
        }
        
        return this.VALIDACION_EXITO;
    }
    
    /**
     * Agrega un pedido a la lista dependiendo de si ya está agregado o no
     * @param pedido Un pedido
     * @return Resultado de la operación
     */
    public String agregarPedido(Pedido pedido){
        if(this.pedidos.contains(pedido)){ 
            return this.PEDIDOS_DUPLICADOS;
        }
        else{
            this.pedidos.add(pedido);
            return this.EXITO;
        }
    }
    
    /**
     * Método auxiliar para revisión desde consola
     */
    public void mostrarPedidos(){
        for (Pedido p : this.pedidos){
            p.mostrar();
        }
    }
}
