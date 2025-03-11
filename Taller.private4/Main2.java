public class Main2 {
    public static void main(String[] args) {
        
        Coche coche = new Coche("Toyota", "Corolla", 100.0);

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad Maxima: " + coche.getVelocidadMaxima());

        
        // Intentar acceder a las propiedades directamente (esto generará errores de compilación)
        // System.out.println(coche.marca); // Error: marca tiene acceso privado
        // System.out.println(coche.velocidadMaxima); // Error: velocidadMaxima tiene acceso privado

 
        System.out.println("\nAcelerando con un increento de 20.0.....");
        coche.acelerar(20.0);
        System.out.println("Nueva Velocidad Maxima " + coche.getVelocidadMaxima());

        System.out.println("\nIntentando acelerar con un Incremento de -10.0....");
        coche.acelerar(-10.0);
        System.out.println("Velocidad Maxima despues del intento " + coche.getVelocidadMaxima());

    }
    
}
