/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosdowhile;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class NumerosDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0;
        String respo;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite o número ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer continuar (S/N)? ");
            respo = teclado.next();
        } while (respo.equals("s"));
        System.out.println("A soma entre todos valores é: " + s);
    }
    
}
