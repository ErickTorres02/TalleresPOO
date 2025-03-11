public class CuentaBancaria {
    String numeroCuenta;
    double Saldo;
    String TipoCuenta;

    public CuentaBancaria() {
        this.numeroCuenta = "00000";
        this.Saldo = 0.0;
        this.TipoCuenta = "Desconocida";
    }
    public CuentaBancaria (String numeroCuenta, String TipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.Saldo = 0.0;
        this.TipoCuenta = TipoCuenta;
    }
    public CuentaBancaria (String numeroCuenta, double Saldo, String TipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.Saldo =Saldo;
        this.TipoCuenta = TipoCuenta;
    }
    public void mostrarDetalles() {
        System.out.println("Numero de cuenta" + this.numeroCuenta);
        System.out.println("Saldo" + this.Saldo);
        System.out.println("TipoCuenta" + this.TipoCuenta);

    }

}