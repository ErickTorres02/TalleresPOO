public class Main {
    public static void main(String[] args) {
        Estudiante estudante = new Estudiante("Ana", 22,  7.5);
        System.out.println("Nombre:" + estudante.getNombre());
        System.out.println("Edad:" + estudante.getEdad());
        System.out.println("Nota Promedio:" + estudante.getNotaPromedio());

        estudante.setEdad(-5);
        estudante.setNotaPromedio( 15);

        estudante.setEdad(22);
        estudante.setNotaPromedio( 9.0);

        System.out.println("Edad actualizada: " + estudante.getEdad());
        System.out.println("Nota Promedio actualizada: " + estudante.getNotaPromedio());

    }
    
}
