public class Vendedor extends Empleado {
    private final double comision;

    public Vendedor(String nombre, double comision) {
        super(nombre);
        this.comision = comision;
    }
    @Override
    public double calcularSalario() {
        return 3000 + comision;
    }
    
}
