public class Coche {
   
    private final String marca;
    private final String modelo;
    private static int ContadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        ContadorCoches++;
    }

    public static void mostrarContador() {
        System.out.println("Total de coches creados: " + ContadorCoches);
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    @Override
    public String toString() {
        return "Coche: " + marca +"" + modelo;
    }

}



