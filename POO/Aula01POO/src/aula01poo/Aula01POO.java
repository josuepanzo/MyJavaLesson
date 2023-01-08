/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01poo;

/**
 *
 * @author Joshua
 */
public class Aula01POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começando Projecto");
        Caneta c1 = new Caneta();
        c1.modelo = "Style";
        c1.cor = "Azul";
        c1.ponta = 1.5f;
        c1.carga = 70;
        c1.tampar();
        c1.rabiscar();
        c1.status();
        
        Caneta c2 = new Caneta();
        c2.modelo = "BRAVO";
        c2.cor = "Vermelha";
        c2.ponta = 1.20f;
        c2.carga = 10;
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
    
}
