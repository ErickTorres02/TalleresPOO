public class Main3 {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Suma: " + Utilidades.sumar(num1, num2));
        System.out.println("Resta: " + Utilidades.restar(num1, num2));
        System.out.println("Multiplicacion: " + Utilidades.multiplicador(num1, num2));
        System.out.println("Division: " + Utilidades.dividir(num1, num2));

        System.out.println("Division por cero: " + Utilidades.dividir(num1, 0));

    }
}
