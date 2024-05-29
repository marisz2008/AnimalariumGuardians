/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author MARISELA
 */
public class Encargado {
    
    //Creación de los atributos
    String idEncargado,nombre,apellido;
    int annioNacimiento,contrasena;
    
  public static final String[] IDENTIFICACIONES_ENCARGADOS={"IDENTIFICACION ENCARGADO","NOMBRE","APELLIDO","AÑO NACIMIENTO","CONTRASEÑA"};
    
  //Creación del constructor con parámetros
    public Encargado(String idEncargado, String nombre, String apellido, int annioNacimiento, int contrasena) {
        this.idEncargado = idEncargado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.annioNacimiento = annioNacimiento;
        this.contrasena = contrasena;
    }
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  
 //Creación del constructor sin parámetros 

    public Encargado() {
        this.idEncargado = "";
        this.nombre = "";
        this.apellido = "";
        this.annioNacimiento = 0;
        this.contrasena = 0;
    }
 //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   
  //Creación de los métodos Setters y Getters

    public String getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(String idEncargado) {
        this.idEncargado = idEncargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnnioNacimiento() {
        return annioNacimiento;
    }

    public void setAnnioNacimiento(int annioNacimiento) {
        this.annioNacimiento = annioNacimiento;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }
   
    
    
    
    
    
    
}//Fin de la clase
