/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kevincortéz;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class KevinCortéz {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner KC = new Scanner(System.in);
        
        EvaluarNumeros KCM = new EvaluarNumeros();
        
        System.out.println("Ingrese el primer numero");
       double primernumero = KC.nextDouble();
       
       System.out.println("Ingrese el segundo numero");
       double segundonumero= KC.nextDouble();
       
       System.out.println("Ingrese el tercer numero");
       double tercernumero = KC.nextDouble();
       
       System.out.println("El Numero mayor es:"+ KCM.mayor(primernumero, segundonumero, tercernumero) );
    }
    
}
