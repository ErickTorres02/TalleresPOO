public class Estudiante {
    String Nombre;
    int Edad;
    String Curso;

    public Estudiante() {
        this.Nombre = "Desconocido";
        this.Edad = 0;
        this.Curso = "Sin asignar";


    }
    public Estudiante (String nombre, int edad) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.Curso = "Sin asignar";
    }
    public Estudiante (String nombre, int Edad, String Curso) {
        this(nombre, Edad);
        this.Curso = Curso;
    }
    public void mostrarDetalles() {
        System.out.println("Nombre" + this.Nombre);
        System.out.println("edad" + this.Edad);
        System.out.println("Curso" + this.Curso);
    }
    @Override
    public String toString() {
        return "Estudiante:\n  Nombre: " + Nombre + "\n  Edad: " + Edad + "\n  Curso: " + Curso;
    }


}