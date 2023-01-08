/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int cc = 1;
        System.out.print("Digite o número de vezes a cambalhotar ");
        int vezes = teclado.nextInt();
        while (cc<vezes){
            cc++;
            if (cc == 7 || cc == 9) {
                break;
            }
            System.out.println("Cambalhota " + cc);
        }
    }
    
}
