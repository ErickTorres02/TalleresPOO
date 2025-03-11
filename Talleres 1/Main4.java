import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        
        
       
        System.out.println("=== Datos del Libro ===");
        System.out.print("Ingrese el título: ");
        String titulo = sc.nextLine();
        System.out.print("Ingrese el autor: ");
        String autor = sc.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        int paginas = sc.nextInt();
        sc.nextLine(); 
        
        
        Libro libro = new Libro(titulo, autor, paginas);
        
        
        System.out.println("\n=== Datos de la Cuenta Bancaria ===");
        System.out.print("Ingrese el número de cuenta: ");
        String numCuenta = sc.nextLine();
        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = sc.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldo = sc.nextDouble();
        sc.nextLine(); 
        
CuentaBancaria cuenta = new CuentaBancaria(numCuenta, saldo, tipoCuenta);
        
       
        System.out.println("\n=== Datos del Estudiante ===");
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Ingrese el curso: ");
        String curso = sc.nextLine();
        
         Estudiante estudiante= new Estudiante ( nombre, edad, curso);
         System.out.println("\n--- Detalles ingresados ---");
        System.out.println(libro);
        System.out.println();
        System.out.println(cuenta);
        System.out.println();
        System.out.println(estudiante);
        
        sc.close();
    }
}
}