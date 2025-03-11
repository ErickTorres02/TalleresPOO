public class Libro {
    
    String titulo;
    String autor;
    int numeroPaginas;

    
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.numeroPaginas = 0;
        
    }

    
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

   
    public void mostrarDetalles() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numeroPaginas);
    }
}
