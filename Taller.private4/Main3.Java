public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        System.out.println(p.nombre); // Error de compilacion: nombreno tiene acceso privado
        
    }
}