/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;

/**
 *
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

    
    private GestorUsuarios() {
    }
    
    public static GestorUsuarios crear(){
        if(gestor == null){
            gestor = new GestorUsuarios();
        }
        return gestor;
    }
    
    public String crearUsuario(String correo, String apellido, String nombre, Perfil perfil, String clave, String claveRepetida){
        if (correo == null || correo.isEmpty() || !correo.contains("@") || correo.indexOf("@") != correo.lastIndexOf("@")) {
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
            return this.ERROR_CONTRASENIA;
        }
        Usuario usuario;
        switch (perfil) {
            case CLIENTE: 
                usuario  = new Cliente(correo, clave, apellido, nombre);
                
                agregarUsuario(usuario);
                break;
            case ENCARGADO: 
                Usuario encargado = new Encargado(correo, clave, apellido, nombre);
                agregarUsuario(encargado);
                break;
            case EMPLEADO: 
                Usuario empleado = new Empleado(correo, clave, apellido, nombre);
                agregarUsuario(empleado);
                break;
            default:
                return this.ERROR;
        }
        
        return EXITO;
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<Usuario> verUsuarios(){ 
        return this.usuarios;
    }
    
    /**
     * Busca si existen usuarios con el apellido especificado (total o parcialmente)
     * @param apellido
     * @return 
     */
    public ArrayList<Usuario> buscarUsuarios(String apellido){
        ArrayList<Usuario> usuariosAp = new ArrayList<>();
        for(Usuario u : usuarios){
            if(u.verApellido().toLowerCase().contains(apellido.toLowerCase())){
                usuariosAp.add(u);
            }
        }
        return usuariosAp;
    }
    
    /**
     * Devuelve true si existe el usuario especificado, false en caso contrario.
     * @param usuario
     * @return 
     */
    public boolean existeEsteUsuario(Usuario usuario){
        for(Usuario u : usuarios){
            if(u.verCorreo().equals(usuario.verCorreo())){
                return true;
            }
        }
        return false;
    } 
     
    /**
     * Obtiene el usuario con el correo especificado. Si no hay un usuario con el correo, devuelve null.
     * @param correo
     * @return 
     */
    public Usuario obtenerUsuario(String correo){
        for(Usuario u : usuarios){
            if(u.verCorreo().equals(correo)){
                return u;
            }
        }
        return null;
    }    

    //Metodo auxiliar
    public String agregarUsuario(Usuario usuario){
        
        if(usuarios.contains(usuario)){ 
            return this.USUARIOS_DUPLICADOS;
        }
        else{
            usuarios.add(usuario);
            return this.EXITO;
        }
    }

}
