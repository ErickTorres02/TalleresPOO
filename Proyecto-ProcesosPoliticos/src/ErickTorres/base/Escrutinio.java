/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ErickTorres.base;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author adsep
 */
public class Escrutinio {
    private Map<Candidato, Integer> votosCandidato;
    private int votosBlancos;
    private int votosNulos;
    
    public Escrutinio() {
        votosCandidato = new HashMap<>();
        votosBlancos = 0;
        votosNulos = 0;
    }
    
    public void agregarVoto(Candidato candidato) {
        votosCandidato.put(candidato, votosCandidato.getOrDefault(candidato, 0) + 1);
    }
    
    public void agregarVotoBlanco() {
        votosBlancos++;
    }
    
    public void agregarVotoNulo() {
        votosNulos++;
    }
    
    public Map<Candidato, Integer> getVotosCandidato() {
        return votosCandidato; 
    }
    
    public int getVotosNulos() {
        return votosNulos;
    }
   
    
    public void calcularPorcentajes() {
        int totalVotos = votosCandidato.values().stream().mapToInt(Integer::intValue).sum() + votosBlancos + votosNulos;
        votosCandidato.forEach((candidato, votos) -> {
            double porcentaje = (votos * 100.0) / totalVotos;
            System.out.println(candidato.getNombre() + ": " + porcentaje + "%");
        });
        System.out.println("Votos blancos: " + (votosBlancos * 100.0 / totalVotos) + "%");
        System.out.println("Votos nulos: " + (votosNulos * 100.0 / totalVotos) + "%");
        
    }
    
    public void generarInforme() {
        System.out.println("=== Informe de resultados ===");
        calcularPorcentajes();
        System.out.println("Votos blancos: " + votosBlancos);
        System.out.println("Votos nulos: " + votosNulos);
    }

     public int getVotosBlancos() {
        return votosBlancos;
    }
    
    
}
