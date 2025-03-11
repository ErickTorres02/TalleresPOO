public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche ( String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;


  }
  public void acelerar(double incremento) {
    if (incremento > 0) {
        velocidadMaxima += incremento;

    }else {
        System.out.println("Error: El incremento debe ser positivo.");
    }
}

  public String getMarca() {
    return marca;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }
  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public double getVelocidadMaxima() {
    return velocidadMaxima;
  }

    }
        
    
  



