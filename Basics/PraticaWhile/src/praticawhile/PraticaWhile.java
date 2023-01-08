/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticawhile;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class PraticaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // function();
        
        /*Scanner teclado = new Scanner(System.in);
        System.out.print("INICIO: ");
        int inicio = teclado.nextInt();
        System.out.print("FIM: ");
        int fim = teclado.nextInt();*/
        
        // whileSoma();
        // whileConvert();
        // whileAlunoHonra();
        whileTabuada();
        
        /*int start = teclado.nextInt();
        int end = teclado.nextInt();
        if (inicio > fim) {
            while10to0(inicio, fim);
        } else {
            while0to10(inicio, fim);
        }*/
        
    }
    
    public static void whileTabuada() {
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        int r = 0;
        
        System.out.print("QUAL TABUADA VOCÊ QUER EXIBIR? ==> ");
        int nTabuada = teclado.nextInt();
        
        while (cont <= 12) {
            r = nTabuada * cont;
            System.out.printf("%s x %s = %s \n", nTabuada, cont, r);
            cont++;
        }
    }
    
    public static void whileAlunoHonra() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** ESCOLA SANTA RITA ***");
        System.out.println("*** **************** ***");
        
        int cont = 1;
        System.out.print("QUANTOS ALUNOS EXISTEM NESTA TURMA? ");
        int qtAluno = teclado.nextInt();
        float maiorNota = 0;
        
        while (cont <= qtAluno) {
            System.out.print("NOME DO ALUNO: ");
            String nomeAluno = teclado.next();
            System.out.print("NOTA DO ALUNO: ");
            float notaAluno = teclado.nextFloat();
            if (notaAluno > maiorNota) {
                maiorNota = notaAluno;
            }
            cont++;
        }
        System.out.printf("O melhor aproveitamento foi %.1f \n",maiorNota);
    }
    
    public static void whileConvert() {
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        System.out.print("DIGITE O NÚMERO DE VEZES A CONVERTER ");
        int vezes = teclado.nextInt();
        while (cont <= vezes) {
            System.out.print("DIGITE O VALOR EM R$ ");
            float r = teclado.nextFloat();
            float d = r/2.20f;
            System.out.printf("O valor da conversão em US$ é: %.2f \n", d);
            cont++;
        }
    }
    
    public static void whileSoma() {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        int maior, menor;
        
        maior = 0;
        menor = 0;
        
        while (cont <= 3) {
            System.out.print("DIGITE O NÚMERO: ");
            int n = teclado.nextInt();
            if (n > maior) {
                maior = n;
            } else {
                menor = n;
            }
            soma = soma + n;
            cont++;
        }
        System.out.println("A SOMA DE TODOS VALORES É: " + soma);
        System.out.println("O MAIOR NÚMERO DIGITADO É: " + maior);
        System.out.println("O MENOR NÚMERO DIGITADO É: " + menor);
    }
    
    public static void while10to0(int inicio, int fim) {
        int cont = inicio;
        while (cont >= fim) {
            System.out.printf("%s Número \n", cont);
            cont--;
        }
    }
    
    public static void while0to10(int inicio, int fim) {
        int cont = inicio;
        while (cont <= fim) {
            System.out.printf("%s Número \n", cont);
            cont++;
        }
    }
    
    public static void function() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("INICIO: ");
        int start = teclado.nextInt();
        System.out.print("FIM: ");
        int end = teclado.nextInt();
        
        int cont = start;
       
        while (cont <= end) {
            
            if (start < end) {
                
            }
            
            // System.out.printf("%s \n", cont);
            cont = cont + 1;
        }
        System.out.println("*** TERMINEI DE CONTAR ***");
    }
}
