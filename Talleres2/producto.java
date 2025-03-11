public class producto {
    String Nombre;
    double Precio;

    public producto (String Nombre, double Precio) {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public void mostrarProducto() {
        System.out.println("Nombre del producto" + this.Nombre);
        System.out.println("Precio  $"  + this.Precio);
    }

    public String getNombre() {
        return Nombre;
    }
    public double getPrecio() {
        return Precio;
    }

}