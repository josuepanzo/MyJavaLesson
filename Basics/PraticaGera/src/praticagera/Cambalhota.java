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
public class Cambalhota {
    
    static void smartCambalhota() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("**********************************");
        System.out.println("******** SMART CAMBALHOTA ********");
        System.out.println("**********************************");
        System.out.println("");
        
        System.out.print("INICIO : ");
        int inicio = teclado.nextInt();
        System.out.print("FIM : ");
        int fim = teclado.nextInt();
        System.out.println("");
        
        int cont = 0;
        
        if (fim > inicio) {
            cont = inicio;
            while (cont<=fim) {
                System.out.println(cont + "º " + " CAMBALHOTA POR TRÁS");
                cont++;
            }
        } else {
            cont = inicio;
            while (cont>=fim) {
                System.out.println(cont + "º " + " CAMBALHOTA POR FRENTE");
                cont--;
            }
        }
        
        System.out.println("");
        System.out.println("**********************************");
        System.out.println("******** **************** ********");
        System.out.println("**********************************");
        
    }
    
}
