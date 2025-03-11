public class Main2 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 3000.0);
        System.out.println("Nombre: " + empleado.nombre);
        System.out.println("Sañario Inicial: " + empleado.getSalario());

        empleado.setSalario(3500.0);
        System.out.println("Salario actualizado: " + empleado.getSalario());

        empleado.setSalario(-1000.0); // muestra un mensaje de error.
    }
}
