/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adsep
 */
public class PruebaProducto {
    public static void main(String[] args) {
        Productos producto = new Productos ("Laptop", 1200.50, 10);
        producto.mostrarInfo();
        System.out.println("Nombre del producto:" + producto.nombre);
        System.out.println("Precio del producto:" + producto.precio);
        System.out.println("Stock del producto:" + producto.stock);
        
    }
    
}
