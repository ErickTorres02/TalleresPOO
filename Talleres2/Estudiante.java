public class Estudiante {
    String Nombre;
    int Edad;

    public Estudiante() {
      this("Desconocido", 18);

    
}
public Estudiante(String Nombre, int Edad) {
    this.Nombre = Nombre;
    this.Edad = Edad;
}
public void mostrarDetalles() {
    System.out.println("Nombre" + this.Nombre);
    System.out.println("Edad" + this.Edad);

}
}
