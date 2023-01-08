/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopoo;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class BancoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("=== HOSPITAL GEORGINA ANGOLA ===");
        System.out.println("================================");
        System.out.println("");
        Pessoa p1 = new Pessoa();
        p1.setNome("Manuel");
        p1.setAltura(teclado.nextFloat());
        //p1.setAltura(1.98f);
        //p1.setPeso(90);
        p1.setPeso(teclado.nextInt());
        p1.infoPessoa();
        
        
        System.out.println("");
        System.out.println("================================");
        System.out.println("=== SP 17, SÃO PAULO, -> ANG ===");
        System.out.println("================================");
    }
    
}


/*System.out.println("================================");
        System.out.println("=== BANCO DE FORMENTO ANGOLA ===");
        System.out.println("================================");
        System.out.println("");
        
        ContaBanco cb1 = new ContaBanco();
        cb1.setNumConta(222);
        cb1.setDonoConta("Manuel Pedro");
        cb1.abrirConta("CC");
        cb1.pagarMensal();
        //cb1.saldo = 0;
        //cb1.status = false;
        cb1.infoConta();
        
        System.out.println("");
        System.out.println("================================");
        System.out.println("=== SP 17, SÃO PAULO, -> ANG ===");
        System.out.println("================================");*/