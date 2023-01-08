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
public class BestAluno {
    
    static void melhorAluno() {
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        System.out.print("Quantos aluno tem na turma? ==> ");
        int qAluno = teclado.nextInt();
        int melhorNota = 0;
        String melhorAluno = "";
        
        System.out.println("=================================");
        System.out.println("==== ESCOLA JOSEFINA BAKHITA ====");
        System.out.println("=================================");
        System.out.println("");
        
        while (cont <= qAluno) {
            System.out.println(cont + "º Aluno");
            System.out.print("Nome do Aluno ");
            String nomeAluno = teclado.next();
            System.out.print("Nota do(a) " + nomeAluno + " : ");
            int notaAluno = teclado.nextInt();
            System.out.println("");
            if (notaAluno > melhorNota) {
                melhorNota = notaAluno;
                melhorAluno = nomeAluno;
            }
            cont++;
        }
        System.out.println("");
        System.out.println("==== PAUTA GERAL DOS ALUNOS =====");
        System.out.println("");
        System.out.println("O melhor aproveitamento foi do(a) " + melhorAluno + " com " + melhorNota + "Valores");
        
        System.out.println("");
        System.out.println("=================================");
        System.out.println("==== ST 24, RUA KIMBANGO, SI ====");
        System.out.println("=================================");
    }
    
}
