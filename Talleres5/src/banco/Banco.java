/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author adsep
 */
public class Banco {
    protected double saldo;
    
    public Banco(double saldo) {
        this.saldo = saldo;
    }
    
}
//Por qué no es segura la implementación con protected
//Acceso no controlado: Cualquier clase del mismo paquete o subclases pueden modificar saldo directamente, sin validaciones.

//Falta de validaciones: No se asegura que el saldo sea positivo o que las operaciones sean válidas.

// Rompe el encapsulamiento: Expone detalles internos de la clase, violando un principio clave de la programación orientada a objetos.

//solucion
//Usar private para saldo y proporcionar métodos get y set con validaciones.

//Añadir métodos específicos (como depositar y retirar) para operaciones seguras.
