import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre del Estudiante");
            String Nombre = scanner.nextLine();
            
            System.out.println("Ingrese la edad del Estudiante");
            int Edad = scanner.nextInt();
            
            Estudiante estudiante = new Estudiante (Nombre, Edad);
            
            estudiante.mostrarDetalles();
        }

    
    }
}
