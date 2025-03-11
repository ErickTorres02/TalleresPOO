public class Main {
    public static void main(String[] args) {
       
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        System.out.println(); 

       
        Libro libro2 = new Libro("1984", "George Orwell", 328);
        libro2.mostrarDetalles();
    }
}
