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
public class Empleado {
    
    int codigo;
    String nombre;
    String area_laboral;
    int sueldo;
    int horas_extras;
    boolean afiliacion_afp;
    
              
    
    public void Sueldo(){
        float descuento_1 = sueldo * 11/100;
        float descuento_2 = sueldo * 13/100;
        float descuento_3 = sueldo * 3/100;
        
        float descuento_total = descuento_1+ descuento_2 +descuento_3;
        System.out.println("el descuento total es:"+descuento_total);
        int h_extras = sueldo/240 * horas_extras;
        System.out.println("el aumento total por horas extras es:"+h_extras);
        int sueldo_total = sueldo + h_extras;
        System.out.println("el sueldo total es:"+sueldo_total);
        float sueldo_neto = sueldo_total - descuento_total;
        System.out.println("el sueldo neto es:"+sueldo_neto);
    }
    
    
    
    
}
