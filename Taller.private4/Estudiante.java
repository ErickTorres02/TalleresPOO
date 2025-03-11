public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.setEdad(edad);
        this.setNotaPromedio(notaPromedio);


    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }else {
            System.out.println("Error: La edad no puede ser negativa");
        }
    }
    public double getNotaPromedio() {
        return notaPromedio;

    

        }
        public void setNotaPromedio(double notaPromedio) {
            if (notaPromedio >= 0 && notaPromedio <= 10) {
                this.notaPromedio = notaPromedio;
            }else{
                System.out.println("Error: La nota promedio debe estar entre 0 y 10");

            }
        }
    }
