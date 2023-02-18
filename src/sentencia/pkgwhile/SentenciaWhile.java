/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencia.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Ivan Ramirez
 */
public class SentenciaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in); //activa la lectura de informacion
        System.out.println("Indique el valor de la nota");
        int nota = leer.nextInt();                 //Declara la variable
        
        while (nota>10 || nota<1) {   //Mientras se cumpla la condicion
  
            System.out.println("Valor Invalido, Intente nuevamente");
            nota = leer.nextInt();
            
        }
        System.out.println("La nota es " + nota);
    }
    
}
