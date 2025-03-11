public class Gerente extends Empleado {
    private final double bono;

    public Gerente(String nombre, double bono) {
        super(nombre);
        this.bono = bono;

    }

    @Override
    public double calcularSalario() {
        return 5000 + bono;
    }
    
}
