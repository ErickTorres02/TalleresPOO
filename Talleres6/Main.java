public class Main {
    public static void main(String[] args) {
         Coche coche1 = new Coche("Toyota ", "Corolla");
            Coche coche2 = new Coche("Honda ", "Civic");
            Coche coche3 = new Coche("Ford ", "Mustang");

            System.out.println("Coche 1  " + coche1.getMarca() + coche1.getModelo());
            System.out.println("Coche 2  " + coche2.getMarca() + coche2.getModelo());
            System.out.println("Coche 3  " + coche3.getMarca() +  coche3.getModelo());
    
      
        Coche.mostrarContador();
    }
}
