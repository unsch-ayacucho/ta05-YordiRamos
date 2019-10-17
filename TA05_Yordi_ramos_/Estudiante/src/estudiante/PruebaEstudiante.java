/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

/**
 *
 * @author Añapa
 */
public class PruebaEstudiante {
    
    public static void main(String[] args){
        // Creación de un objeto
        Estudiante obj = new Estudiante();
        obj.apellidos = "ramos conga";
        // Llamando a un método sdel objeto creado
        System.out.println("Valores por default del objeto Persona");
        obj.Promedio();
        System.out.println("el prodeio es : " + obj);
    }
}
