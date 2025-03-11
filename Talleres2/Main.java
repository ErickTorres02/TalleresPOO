import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre del producto");
            String Nombre = scanner.nextLine();
            
            System.out.println("Ingrese el Precio del producto");
            double Precio = scanner.nextDouble();
            
            producto producto = new producto(Nombre, Precio);

            producto.mostrarProducto();

            scanner.close();

        }
    }
}