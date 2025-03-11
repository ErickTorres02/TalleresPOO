/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ErickTorres.base;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adsep
 */
public class Apoderado {
    private String rut;
    private String nombre;
    private List<MesaVotacion> mesasAsignadas;
    
    public Apoderado(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
        this.mesasAsignadas = new ArrayList<>();
    }
    
    public String getRut() {
        return rut;
    }
    
    public void setRut(String rut) {
        this.rut = rut;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<MesaVotacion> getMesasAsignadas() {
        return mesasAsignadas;
    }
    
    public void agregarMesa(MesaVotacion mesa) {
        mesasAsignadas.add(mesa);
    }
    
}
