public class Main2 {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.mostrarDetalles();

        System.out.println();

        CuentaBancaria cuenta2 = new CuentaBancaria("123456789", "Ahorro");
        cuenta2.mostrarDetalles();

        System.out.println();

        CuentaBancaria cuenta3 = new CuentaBancaria("554187987", 50000.0, "Corriente");
        cuenta3.mostrarDetalles();
    }

}