public class Persona {
    @SuppressWarnings("unused")
    private final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    //Metodo Static que intenta acceder a un atributo no Static
    public static void mostrarNombre() {
       //  System.out.println("Nombre: " + nombre); // toca ponerlo de esta manera para dejar mandar esta carpeta

    //Error de comppilacion
    }
    
}
