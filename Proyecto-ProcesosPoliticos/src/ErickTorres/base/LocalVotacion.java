/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ErickTorres.base;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author adsep
 */
public class LocalVotacion {
    private String nombre;
    private String direccion;
    private Comuna comuna;
     private List<MesaVotacion> mesas;
     
     public LocalVotacion(String nombre, String direccion, Comuna comuna) {
         this.nombre = nombre;
         this.direccion = direccion;
         this.comuna = comuna;
         this.mesas = new ArrayList<>();
     }
     
     public String getNombre() {
         return nombre;
     }
     
     public void setNombre(String nombre) {
         this.nombre = nombre;
     }
     
     public String getDireccion() {
         return direccion;
     }
     
     public void setDireccion(String direccion) {
         this.direccion = direccion;
     }
     
     public Comuna getComuna() {
         return comuna;
     }
     
     public void setComuna(Comuna comuna) {
         this.comuna = comuna;
     }
     
     public void agregarMesa(MesaVotacion mesa) {
         mesas.add(mesa);
     }
     
     public List<MesaVotacion> getMesas() {
         return mesas;
     }
     
}
    
    
   