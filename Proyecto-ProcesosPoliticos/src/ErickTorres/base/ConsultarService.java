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
public class ConsultarService {
    public void mostrarCandidatosPorComuna(Comuna comuna) {
        System.out.println("Candidatos en la comuna " + comuna.getNombre() + ":");
        for (Candidato candidato : comuna.getCandidatos()) {
            System.out.println(candidato.getNombre() + " - " + candidato.getPartido());
        }
    }

    // 2. Consultar la cantidad de votantes por mesa en una comuna específica
    public void mostrarVotantesPorComuna(Comuna comuna) {
        System.out.println("Votantes en la comuna " + comuna.getNombre() + ":");
        for (LocalVotacion local : comuna.getLocales()) {
            for (MesaVotacion mesa : local.getMesas()) {
                System.out.println("Mesa " + mesa.getNumero() + ": " + mesa.getVotantes().size() + " votantes");
            }
        }
    }

    // 3. Listar los locales de votación disponibles en todas las comunas
    public void mostrarLocalesPorComuna(Comuna comuna) {
        System.out.println("Locales de votación en la comuna " + comuna.getNombre() + ":");
        for (LocalVotacion local : comuna.getLocales()) {
            System.out.println(local.getNombre() + " - " + local.getDireccion());
        }
    }

    // 4. Consultar el partido político con más candidatos en cada comuna
    public void mostrarPartidoConMasCandidatos(Comuna comuna) {
        Map<String, Integer> partidos = new HashMap<>();
        for (Candidato candidato : comuna.getCandidatos()) {
            partidos.put(candidato.getPartido(), partidos.getOrDefault(candidato.getPartido(), 0) + 1);
        }
        String partidoMasCandidatos = partidos.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No hay candidatos");
        System.out.println("Partido con más candidatos en " + comuna.getNombre() + ": " + partidoMasCandidatos);
    }

    // 5. Listar los vocales de mesa en un local de votación determinado
    public void mostrarVocalesPorLocal(LocalVotacion local) {
        System.out.println("Vocales en el local " + local.getNombre() + ":");
        for (MesaVotacion mesa : local.getMesas()) {
            for (VocalMesa vocal : mesa.getVocales()) {
                System.out.println(vocal.getNombre() + " - " + vocal.getRol());
            }
        }
    }

    // 6. Obtener el porcentaje de participación electoral por comuna
    public void mostrarParticipacionPorComuna(Comuna comuna) {
        int totalVotantes = 0;
        int totalVotos = 0;
        for (LocalVotacion local : comuna.getLocales()) {
            for (MesaVotacion mesa : local.getMesas()) {
                totalVotantes += mesa.getVotantes().size();
                totalVotos += mesa.getEscrutinio().getVotosCandidato().values().stream().mapToInt(Integer::intValue).sum()
                        + mesa.getEscrutinio().getVotosBlancos() + mesa.getEscrutinio().getVotosNulos();
            }
        }
        double porcentajeParticipacion = (totalVotos * 100.0) / totalVotantes;
        System.out.println("Porcentaje de participación en " + comuna.getNombre() + ": " + porcentajeParticipacion + "%");
    }

    // 7. Consultar el nombre completo del presidente de mesa en una comuna determinada
    public void mostrarPresidentesPorComuna(Comuna comuna) {
        System.out.println("Presidentes de mesa en la comuna " + comuna.getNombre() + ":");
        for (LocalVotacion local : comuna.getLocales()) {
            for (MesaVotacion mesa : local.getMesas()) {
                for (VocalMesa vocal : mesa.getVocales()) {
                    if (vocal.getRol().equals("Presidente")) {
                        System.out.println(vocal.getNombre() + " - Mesa " + mesa.getNumero());
                    }
                }
            }
        }
    }
    }

    
    

