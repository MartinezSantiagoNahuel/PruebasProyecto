/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;

/**
 * Clase destinada a crear y manejar las instancias Usuario
 * @author martinez
 */
public class GestorUsuarios{
    private static GestorUsuarios gestor;
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public static final String EXITO = "Usuario creado/modificado con éxito";
    public static final String ERROR = "No se pudo crear/modificar el usuario";
    public static final String ERROR_CORREO = "El correo del usuario es incorrecto";
    public static final String ERROR_APELLIDO = "El apellido del usuario es incorrecto";
    public static final String ERROR_NOMBRE = "El nombre del usuario es incorrecto";
    public static final String ERROR_CLAVES = "Las claves especificadas no coinciden o son incorrectas";
    public static final String ERROR_PERFIL = "El perfil del usuario es incorrecto";
    public static final String PERFIL_CAMBIO = "El usuario no puede cambiarse de perfil";
    public static final String ERROR_PERMISOS = "No se tienen los permisos para realizar esta funcionalidad";
    public static final String USUARIOS_DUPLICADOS = "Ya existe un usuario con ese correo";
    public static final String USUARIO_INEXISTENTE = "No existe el usuario especificado";
    public static final String VALIDACION_EXITO = "Los datos del usuario son correctos";
    public static final String ERROR_CONTRASENIA = "La clave es incorrecta";

    /**
     * Constructor
     */
    private GestorUsuarios() {
    }
    
    /**
     * Mecanismo para que sólo se pueda crear una instancia de GestorUsuarios
     * @return gestor como única instancia
     */
    public static GestorUsuarios crear(){
        if(gestor == null){
            gestor = new GestorUsuarios();
        }
        return gestor;
    }
    
    /**
     * Crea un nuevo usuario
     * @param correo Correo del usuario
     * @param apellido Apellido del usuario
     * @param nombre Nombre del usuario
     * @param perfil Perfil del usuario
     * @param clave Clave del usuario
     * @param claveRepetida Clave repetida para verificación
     * @return Resultado de la operación
     */
    public String crearUsuario(String correo, String apellido, String nombre, Perfil perfil, String clave, String claveRepetida){
        String validacion = validarUsuario(correo, apellido, nombre, perfil, clave, claveRepetida);
        if(validacion.equals(this.VALIDACION_EXITO)){
            Usuario usuario;
            switch (perfil) {
                case CLIENTE: 
                    usuario = new Cliente(correo, apellido, nombre, clave);
                    return agregarUsuario(usuario);
                case ENCARGADO: 
                    usuario = new Encargado(correo, apellido, nombre, clave);
                    return agregarUsuario(usuario);
                case EMPLEADO: 
                    usuario = new Empleado(correo, apellido, nombre, clave);
                    return agregarUsuario(usuario);
                default:
                    return this.ERROR;
            }
        }
        else{
            return validacion;
        }
    }
    
    /**
     * Devuelve todos los usuarios
     * @return Lista con todos los usuarios
     */
    public ArrayList<Usuario> verUsuarios(){ 
        return this.usuarios;
    }
    
    /**
     * Busca si existen usuarios con el apellido especificado (total o parcialmente)
     * @param apellido Apellido del usuario a buscar
     * @return Lista de usuarios con el apellido ingresado
     */
    public ArrayList<Usuario> buscarUsuarios(String apellido){
        ArrayList<Usuario> usuariosAp = new ArrayList<>();
        for(Usuario u : this.usuarios){
            if(u.verApellido().toLowerCase().contains(apellido.toLowerCase())){
                usuariosAp.add(u);
            }
        }
        return usuariosAp;
    }
    
    /**
     * Devuelve true si existe el usuario especificado, false en caso contrario.
     * @param usuario Usuario a buscar
     * @return true or false, usuario existente o no
     */
    public boolean existeEsteUsuario(Usuario usuario){
        for(Usuario u : this.usuarios){
            if(u.verCorreo().equals(usuario.verCorreo())){
                return true;
            }
        }
        return false;
    } 
     
    /**
     * Obtiene el usuario con el correo especificado
     * Si no hay un usuario con el correo, devuelve null.
     * @param correo Correo del usuario
     * @return El usuario con el correo ingresado
     */
    public Usuario obtenerUsuario(String correo){
        for(Usuario u : this.usuarios){
            if(u.verCorreo().equals(correo)){
                return u;
            }
        }
        return null;
    }    

    //Métodos auxiliares
    /**
     * Verifica si un usuario cumple con los requisitos
     * @param correo Correo del usuario
     * @param apellido Apellido del usuario
     * @param nombre Nombre del usuario
     * @param perfil Perfil del usuario
     * @param clave Clave del usuario
     * @param claveRepetida Clave repetida para verificación
     * @return true or false, usuario validado o no
     */
    public String validarUsuario(String correo, String apellido, String nombre, Perfil perfil, String clave, String claveRepetida){
        if (correo == null || correo.isEmpty() || !correo.contains("@") || (correo.indexOf("@") != correo.lastIndexOf("@"))) {
            return this.ERROR_CORREO;
        }
        if (apellido == null || apellido.isEmpty()) {
            return this.ERROR_APELLIDO;
        }
        if(nombre == null || nombre.isEmpty()){
            return this.ERROR_NOMBRE;
        }
        if (clave == null || clave.isEmpty()) {
            return this.ERROR_CONTRASENIA;
        }
        if (claveRepetida == null || claveRepetida.isEmpty() || !claveRepetida.equals(clave)) {
            return this.ERROR_CLAVES;
        }
        
        return this.VALIDACION_EXITO;
    }
    
    /**
     * Agrega un usuario a la lista dependiendo de si ya está agregado o no
     * @param usuario Un usuario
     * @return Resultado de la operación
     */
    public String agregarUsuario(Usuario usuario){
        if(this.usuarios.contains(usuario)){ 
            return this.USUARIOS_DUPLICADOS;
        }
        else{
            this.usuarios.add(usuario);
            return this.EXITO;
        }
    }

    /**
     * Método auxiliar para revisión desde consola
     */
    public void mostrarUsuarios(){
        for (Usuario u : this.usuarios){
            u.mostrar();
        }
    }
}
