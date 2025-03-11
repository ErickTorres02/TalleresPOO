
 
public class Productos {
    String nombre;
    Double precio;
    int stock;

    Productos(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        
       
        
    }
    void mostrarInfo() {
        System.out.println("Nombre:" + nombre + ", Precio:" + precio + ",Stock:" + stock);
        
    }
    
    
    
    
}
