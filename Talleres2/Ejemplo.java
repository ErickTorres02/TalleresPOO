
public class Ejemplo {
   private final String mensaje = "Hola, mundo";

   
//  Método estático corregido sin `this`
   public static void mostrarMensajeCorregido(Ejemplo obj) {
       System.out.println(obj.mensaje); // Se accede mediante una instancia pasada como parámetro
   }
   // ERROR: No se puede usar `this` en un método estático
   
   // public static void mostrarMensaje() {
     //  System.out.println(this.mensaje); //  ERROR aquí

}

