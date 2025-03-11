

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adsep
 */
public class PruebaPersona {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona("Juan", 25);

        
        System.out.println("Nombre actual: " + persona.getNombre());
        System.out.println("Edad actual: " + persona.getEdad());

        
        persona.setNombre("Carlos");
        persona.setEdad(30);

        
        System.out.println("Nuevo nombre: " + persona.getNombre());
        System.out.println("Nueva edad: " + persona.getEdad());
    }
}
 
        
    
    

