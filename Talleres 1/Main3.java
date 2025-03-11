public class Main3 {
    public static void main(String[] args) {
        Estudiante estudiante1 =  new Estudiante();
        estudiante1.mostrarDetalles();

        System.out.println();

        Estudiante estudiante2 = new Estudiante ("Juan", 20);
        estudiante2.mostrarDetalles();

        System.out.println();

        Estudiante estudiante3 = new  Estudiante ("Lorena",  21,  "Matematca");
        estudiante3.mostrarDetalles();


    }

}