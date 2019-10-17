/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author Añapa
 */
public class PruebaEmpleado {
    
    public static void main(String[] args) {
        
        Empleado p1 = new Empleado();
        System.out.println("## CALCULO DE SUELSO NETO");
        
       
        p1.sueldo = 1000;
               
        p1.horas_extras = 10;
    
        p1.Sueldo();
    
    }
    
    
}
