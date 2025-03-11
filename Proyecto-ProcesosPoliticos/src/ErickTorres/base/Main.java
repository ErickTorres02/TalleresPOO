/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ErickTorres.base;

/**
 *
 * @author adsep
 */
public class Main {
    public static void main(String[] args) {
        
       
        // Crear objetos
           Comuna comuna = new Comuna("Concepción");

        // Crear locales de votación
        LocalVotacion local = new LocalVotacion("Escuela 123", "Calle Principal 456", comuna);
        comuna.agregarLocal(local);

        // Crear mesas de votación
        MesaVotacion mesa = new MesaVotacion(1, "Aula 101", "Mixto", local);
        local.agregarMesa(mesa);

        // Crear candidatos
        Candidato candidato1 = new Candidato("12345678", "Juan Pérez", "Partido A", comuna);
        Candidato candidato2 = new Candidato("87654321", "Ana Gómez", "Partido B", comuna);
        comuna.agregarCandidato(candidato1);
        comuna.agregarCandidato(candidato2);

        // Crear votantes
        Votante votante1 = new Votante("11111111", "Pedro Sánchez");
        Votante votante2 = new Votante("22222222", "Laura Martínez");
        mesa.agregarVotante(votante1);
        mesa.agregarVotante(votante2);

        // Crear apoderados
        Apoderado apoderado = new Apoderado("98765432", "Carlos López");
        mesa.agregarApoderado(apoderado);

        // Crear vocales
        VocalMesa vocal = new VocalMesa("11223344", "María Díaz", "Presidente");
        mesa.agregarVocal(vocal);

        // Simular votos
        mesa.getEscrutinio().agregarVoto(candidato1); // Voto para Juan Pérez
        mesa.getEscrutinio().agregarVoto(candidato2); // Voto para Ana Gómez
        mesa.getEscrutinio().agregarVoto(candidato1); // Otro voto para Juan Pérez
        mesa.getEscrutinio().agregarVotoBlanco();     // Voto en blanco
        mesa.getEscrutinio().agregarVotoNulo();       // Voto nulo

        // Crear instancia de ConsultarService
        ConsultarService consultas = new ConsultarService();

        // Realizar consultas
        System.out.println("=== Consultas Adicionales ===");
        consultas.mostrarCandidatosPorComuna(comuna);
        consultas.mostrarVotantesPorComuna(comuna);
        consultas.mostrarLocalesPorComuna(comuna);
        consultas.mostrarPartidoConMasCandidatos(comuna);
        consultas.mostrarVocalesPorLocal(local);
        consultas.mostrarParticipacionPorComuna(comuna);
        consultas.mostrarPresidentesPorComuna(comuna);
    }
}
