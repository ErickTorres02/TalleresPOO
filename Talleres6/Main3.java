public class Main3 {
    public static void main(String[] args) {
        @SuppressWarnings("unused") // se pone esto para que desaparezca la linea amarilla en persona
        Persona perosna = new Persona("Marcos");
        Persona.mostrarNombre(); // esto no compilara
    }
}
// Los metodos static no pueden acceder a atribustos no static porque pertenecen a la clade, no a la peticion especifica, lo que genera error de compilacion