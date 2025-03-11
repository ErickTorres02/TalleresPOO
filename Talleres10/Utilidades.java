public class Utilidades {
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicador(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division por cero. ");
            return 0;
        }
    }
}
