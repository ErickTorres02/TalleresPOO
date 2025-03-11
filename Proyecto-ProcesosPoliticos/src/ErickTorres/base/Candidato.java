/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ErickTorres.base;

/**
 *
 * @author adsep
 */
public class Candidato {
    private String dni;
    private String nombre;
    private String partido;
    private Comuna comuna;
    
    public Candidato(String dni, String nombre, String partido, Comuna comuna) {
        this.dni = dni;
        this.nombre = nombre;
        this.partido = partido;
        this.comuna = comuna;
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
    
    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPartido() {
        return partido;
    }
    
    public void setPartido(String partido) {
        this.partido = partido;
    }
    
    public Comuna getComuna() {
        return comuna;
    }
    
    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }
    
}
