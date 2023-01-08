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
public class PraticaGera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //numCambalhota();
        //Cambalhota.smartCambalhota();
        //Moeda.ConversorMoeda(0,0);
        //smartCont();
        //Tabuada.tabuadaG();
        RaizQuadrada.dobroTriploSqrt();
    }
    
    public static void smartCont() {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("INICIO ");
        int inicio = teclado.nextInt();
        System.out.print("FIM ");
        int fim = teclado.nextInt();
        int cc;
        
        if (fim >= inicio) {
            cc = inicio;
            while(cc <= fim) {
                System.out.println(cc);
                cc++;
            }
        } else {
            cc = inicio;
            while(cc >= fim) {
                System.out.println(cc);
                cc--;
            }
        }
        
    }
    
}
