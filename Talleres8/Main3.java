public class Main3 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Maria", 3000);
        Gerente gerente = new Gerente("Ana", 50000, "Ventas");
        empleado.mostrarDetalles();
        System.out.println("............");
        gerente.mostrarDetalles();

    }
}
