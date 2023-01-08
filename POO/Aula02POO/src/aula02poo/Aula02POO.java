/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02poo;

/**
 *
 * @author Joshua
 */
public class Aula02POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começando Projecto");
        System.out.println("");
        
        Carro c1 = new Carro();
        c1.modelo = "Hyundai 20";
        c1.cor = "Vermelho";
        // c1.matricula = "123-345-LDA";
        c1.porta = 4;
        c1.combustivel = "Gasoleo";
        c1.desligado();
        c1.status();
        c1.infoCarro();
        
        System.out.println("");
        System.out.println("Terminado Projecto");
    }
    
}
