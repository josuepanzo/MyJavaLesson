/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorinteligente;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class ContadorInteligente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ContSmart();
        // MelhorAluno();
        // PraticaFor();
        WhileAninhado();
    }
    
    public static void WhileAninhado() {
        int i = 1;
        int j = 0;
        while (i<=3) {
            while (j<=2) {
                j++;
            }
            i++;
        }
        System.out.printf("O i cambalhotou %s \n", i);
        System.out.printf("O j cambalhotou %s \n", j);
    }
    
    public static void PraticaFor() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Deseja contar até ==> ");
        int q = teclado.nextInt();
        System.out.print("Deseja pular até ==> ");
        int jump = teclado.nextInt();
        for (int cont = 1; cont<=q; cont+=jump) {
            System.out.printf("Cambalhota %s \n", cont);
        }
    }
    
    public static void MelhorAluno() {
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        int maiorNota = 0;
        int menorNota = 0;
        String melhorAluno = "";
        String mauAluno = "";
        System.out.println("");
        System.out.print("***** ESCOLA SANTA JOSEFINA BAKHITA *****");
        System.out.println("");
        System.out.print("Quantos aluno tem na turma? ==> ");
        int totalAluno = teclado.nextInt();
        while (cont <= totalAluno) {
            System.out.println("******************************");
            System.out.printf("Aluno %s \n", cont);
            System.out.print("Nome do Aluno: ");
            String nome = teclado.next();
            System.out.printf("Nota do(a) %s : ", nome);
            int nota = teclado.nextInt();
            if (nota > maiorNota) {
                maiorNota = nota;
                melhorAluno = nome;
            } else {
                menorNota = nota;
                mauAluno = nome;
            }
            cont++;
        }
       System.out.printf("O melhor aproveitamento foi do(a) %s com %S valores \n", melhorAluno, maiorNota);
       System.out.printf("O pessímo aproveitamento foi do(a) %s com %S valores \n", mauAluno, menorNota);

    }
    
    public static void ContSmart() {
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        System.out.println("CONTAGEM INTELIGENTE");
        System.out.println("---------------------------");
        System.out.print("INICIO ");
        int inicio = teclado.nextInt();
        System.out.print("FIM ");
        int fim = teclado.nextInt();
        System.out.println("---------------------------");
        System.out.println(" C O N T A N D O ");
        System.out.println("---------------------------");
        
        if (fim > inicio) {
            cont = inicio;
            while (cont <= fim) {
                System.out.printf("%s .. \n", cont);
                cont++;
            }
        } else {
            cont = inicio;
            while (cont >= fim) {
                System.out.printf("%s .. \n", cont);
                cont--;
            }
        }
        
        
    }
    
}
