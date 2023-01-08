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
public class Moeda {
    static float ConversorMoeda(float real, float dolar) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantas vezes quer converter? ==> ");
        int q = teclado.nextInt();
        
        for (int cc = 1; cc<=q; cc++) {
            System.out.println(cc + " CONVERSÃO");
            System.out.println("=================================");
            System.out.println("====== CONVERSOR DE MOEDAS ======");
            System.out.println("=================================");
            System.out.println("");
        
            System.out.print("Digte a quantia em real a converter em US$");
            real = teclado.nextFloat();
        
            dolar = real/2.20f;
            System.out.println("");
            System.out.println("===== RESULTADO DA CONVERSÃO =====");
            System.out.println("");
            System.out.printf("A quantia convertida é de US$%.2f Dólares \n", dolar);
            System.out.println("");
            System.out.println("=================================");
            System.out.println("====== =================== ======");
            System.out.println("=================================");
            System.out.println("");
        }
        
        return dolar;
    }
}
