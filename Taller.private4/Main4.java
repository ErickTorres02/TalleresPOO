public class Main4 {
    public static void main(String[] args) {
        @SuppressWarnings("unused") // pongo el wearning para que producto no me aparezca en amarrillo
        Producto producto = new Producto(100.0); 
       // System.out.println(producto.precio); // Error: precio tiene acceso privado

    }
}
// No podemos ver  o modificar el precio directamente
