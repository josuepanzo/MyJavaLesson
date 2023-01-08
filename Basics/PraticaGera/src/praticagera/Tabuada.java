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
public class Tabuada {
    
    public static void tabuadaG() {
        Scanner teclado = new Scanner(System.in);
        int cc = 1;
        
        System.out.println("***************************************");
        System.out.println("********** TABUADA GERAL HST **********");
        System.out.println("***************************************");
        System.out.println("");
        
        System.out.print("Qual número da tabuada deseja exibir? ==> ");
        int nTabuada = teclado.nextInt();
        System.out.print("Deseja multiplicar até quanto? ==> ");
        int vezesMult = teclado.nextInt();
        System.out.println("");
        
        while (cc <= vezesMult) {
            int tabuada = nTabuada * cc;
            System.out.println(nTabuada + " * " + cc + " = " + tabuada);
            cc++;
        }
        
        System.out.println("");
        System.out.println("***************************************");
        System.out.println("********** DEV JOSUÉ PANZO JP *********");
        System.out.println("***************************************");
    }
    
}
