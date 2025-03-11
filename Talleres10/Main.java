public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 5000, "Ahorros");
       //  System.out.println("Tipo de cuenta: " + cuenta.tipoCuenta);
        System.out.println("Saldo Inicial: " + cuenta.getSaldo());
        cuenta.setSaldo(7000.0);
        System.out.println("Saldo actualizado: " + cuenta.getSaldo());
        cuenta.mostrarDetalles();
    }
}
// Intenta acceder directamente a numeroCuenta (error de compilacion
 //System.out.println(cuenta.numeroCuenta); // Error: numeroCuenta es privado