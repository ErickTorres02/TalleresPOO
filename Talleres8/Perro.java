public class Perro extends Animal{
    public Perro(String nombre) {
        super(nombre);
    }
    public void mostrarNombre() {
       // System.out.println(nombre); // Error de compilacion: "nombre" es privado
       System.out.println("Nombre: " + getNombre()); // acceso correcto usando un metodo publico
    }
    
}
