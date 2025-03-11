/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ErickTorres.base;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adsep
 */
public class MesaVotacion {
    private int numero;
    private String ubicacion;
    private String genero;
    private LocalVotacion local;
    private List<Votante> votantes;
    private List<Candidato> candidatos;
    private Escrutinio escrutinio;
    private List<Apoderado> apoderados;
    private List<VocalMesa> vocales;
    
    public MesaVotacion(int numero, String ubicacion, String genero, LocalVotacion local) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.genero = ubicacion;
        this.local  = local;
        this.votantes = new ArrayList<>();
        this.candidatos = new ArrayList<>();
        this.escrutinio = new Escrutinio();
        this.apoderados = new ArrayList<>();
        this.vocales = new ArrayList<>();
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public LocalVotacion getLocal() {
        return local;
    }
    
    public void setLocal(LocalVotacion local) {
        this.local = local;
    }
    
    public void agregarVotante(Votante votante) {
        votantes.add(votante);
    }
    
    public List<Votante> getVotantes() {
        return votantes;
    }
    
    public void agregarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }
    
    public List<Candidato> getCandidatos() {
        return candidatos;
    }
    
    public void agregarApoderado(Apoderado apoderado) {
        if (apoderado.getMesasAsignadas().size() < 2) {
            apoderados.add(apoderado);
            apoderado.agregarMesa(this);
        } else {
            System.out.println("El apoderado ya esta asignado a 2 mesas. ");
        }
    }
    
    public List<Apoderado> getApoderados() {
        return apoderados;
    }
    
    public void agregarVocal(VocalMesa vocal) {
        vocales.add(vocal);
    }
    
    public List<VocalMesa> getVocales() {
        return vocales;
    }
    
    public Escrutinio getEscrutinio() {
        return escrutinio;
    }
 
 }
