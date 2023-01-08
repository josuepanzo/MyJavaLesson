/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03poo;

/**
 *
 * @author Joshua
 */
public class Aula03POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa("Alberto","Branca",19,1.34f);
        Pessoa p2 = new Pessoa("Jose","Negra",45,1.70f);
        p1.infoPessoa();
        p2.infoPessoa();
        /*p1.nome = "Alberto";
        p1.idade = 19;
        p1.raca = "Branca";
        p1.altura = 1.79f;
        p1.infoPessoa();*/
    }
    
}
