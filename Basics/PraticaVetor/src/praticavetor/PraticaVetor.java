/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticavetor;

/**
 *
 * @author Joshua
 */
public class PraticaVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago",
            "Set","Out","Nov","Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
        
        for (int i = 0; i<mes.length; i++) {
            System.out.println("O mês de " + mes[i] + " tem " + tot[i] + " dias ao todo");
        }
        
        /*int n[] = {2,3,4,5,6,7};
        
        for (int c = 0; c<=5; c++) {
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }*/
    }
    
}
