public class Main2 {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Carlos", 2000);
        Empleado vendedor = new Vendedor("Ana", 1000);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}
