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
public class Comuna {
    private String nombre;
    private List<Candidato> candidatos;
    private List<LocalVotacion> locales;
    
    public Comuna(String nombre) {
        this.nombre = nombre;
        this.candidatos = new ArrayList<>();
        this.locales = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }
    
    public List<Candidato> getCandidatos() {
        return candidatos;
    }
    
    public void agregarLocal(LocalVotacion local) {
        locales.add(local);
    }
    
    public List<LocalVotacion> getLocales() {
        return locales;
    }
}    

