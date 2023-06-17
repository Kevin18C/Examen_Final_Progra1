/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kevincortéz;

/**
 *
 * @author kevin
 */
public class EvaluarNumeros {
    
    public double mayor(double primernumero, double segundonumero, double tercernumero){
        double mayor=primernumero;
        
        if (segundonumero > mayor) {
            mayor = segundonumero;
        }
        
        if (tercernumero > mayor) {
            mayor = tercernumero;
        }
        
        return mayor;
    }
}
