
package vehiculos;


public class Moto extends Vehiculo {
    private int cilindrada;
    
    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }
    public void mostrarDetalles() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca:" + marca );
        System.out.println("Cilindrada" + cilindrada + "cc");
    }
    
    
}
