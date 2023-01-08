/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladortv;

/**
 *
 * @author Joshua
 */
public class ControladorTv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*******************************");
        System.out.println("********* COMANDO ZAP *********");
        System.out.println("*******************************");
        System.out.println("");
        
        ControloRemoto c1 = new ControloRemoto();
        c1.ligar();
        c1.play();
        c1.maisVolume();
        c1.ligarMudo();
        c1.abrirMenu();
        
        System.out.println("");
        System.out.println("*******************************");
        System.out.println("********* SÉRIE 782LZ *********");
        System.out.println("*******************************");
    }
    
}
