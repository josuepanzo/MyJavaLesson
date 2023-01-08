/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticagera;

import java.util.Scanner;
/**
 *
 * @author Joshua
 */
public class RaizQuadrada {
    
    public static void dobroTriploSqrt() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o valor ");
        int numero = teclado.nextInt();
        
        int dobro = numero * 2;
        int triplo = numero * 3;
        float sqrt = numero*(1/2);
        
        System.out.println("O valor digitado é " + numero + "o seu dobro é de "
                + "" +dobro+ "triplo de " +triplo+ "e raiq de " + sqrt);
        
        
        
    }
    
}
