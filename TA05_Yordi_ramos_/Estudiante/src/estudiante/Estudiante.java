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
public class Estudiante {
    private String apellidos ;
    private String especialidad ;
    private int codigo;
    private int nota1 ;
    private int nota2 ;
    private int nota3 ;
    private int nota4 ;
    private int promedio;
    
    
    
    public Estudiante(String apellidos, String especialidad, int codigo,int nota1, int nota2, int nota3, int nota4,int promedio) {
        
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.promedio = promedio;
    }
    
    Estudiante() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    public void Promedio(){ 
        System.out.println(" alumno " + apellidos);
        System.out.println(" ### especialidad ### " + especialidad);
        System.out.println(" ### codigo ### " + codigo);
        System.out.println(" ### EL PROMEDIO ### ");
        if(nota1<nota2 && nota2<nota3 && nota2<nota4){
            promedio = (nota2+nota3+nota4)/3;
            System.out.println("el promedio es:"+promedio);
            if(nota2<nota3 && nota2<nota4 && nota2<nota1){
                promedio = (nota1+nota3+nota4)/3;
                System.out.println("el promedio es:"+promedio);
                if(nota3<nota4 && nota3<nota1 && nota3<nota2){
                    promedio = (nota2+nota1+nota4)/3;
                    System.out.println("el promedio es:"+promedio);
                        if(nota4<nota1 && nota4<nota2 && nota4<nota3){
                            promedio = (nota2+nota3+nota1)/3;
                            System.out.println("el promedio es:"+promedio);

            }
            }
            }
            }
    
    
    
}
}    
      
