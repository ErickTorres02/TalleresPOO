/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;



/**
 *
 * @author adsep
 */
public class Gerente extends Empleado {
    private String Departamento;
    
    public Gerente(String nombre, double salario, String Departamento) {
        super(nombre, salario);
        this.Departamento = Departamento;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + Departamento);
    }
    
    
}
