/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ErickTorres.base;

/**
 *
 * @author adsep
 */
public class Votante {
    private String dni;
    private String nombre;
    
    
    public Votante(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
        
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
