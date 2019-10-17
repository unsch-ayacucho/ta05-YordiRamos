/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

/**
 *
 * @author Añapa
 */
public class Ventana {
    String nombre;
    int tamaño;
    boolean abrir ;
    boolean cerrar ;
    boolean minimizar;
    boolean expandir;

   public void AbrirVentana(){
       System.out.println("Desea abrir la ventana" + abrir);
       }
   public void CerrarVentana(){
       System.out.println("Desea cerrar la ventana" + cerrar);
       }
   public void MinimizarVentana(){
       System.out.println("Desea minimizar la ventana" + minimizar);
       }
   public void ExpandirVentana(){
       System.out.println("Desea expandir la ventana" + expandir);
       }
   
}