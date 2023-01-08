/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todaspratica;
import java.util.Scanner;


/**
 *
 * @author Joshua
 */
public class TodasPratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TrocaDedo();
        // SomaWhile();
        // Tabuada();
        // DolarConvert();
        TestePratica();
        
    }
    
    public static void TestePratica() {
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        System.out.print("Deseja contar até quanto? ==> ");
        int qtd = teclado.nextInt();
        while (cont <= qtd) {
            if (cont > 10) {
                System.out.printf("%s Vez \n", cont);
            } else if (cont > 1 && cont < 10) {
                System.out.printf("%s Vezes \n", cont);
            } else {
                System.out.printf("%s Vez \n", cont);
            }
            cont++;
        }
    }
    
    public static void DolarConvert() {
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        
        System.out.print("Quantas vezes deseja converter? ==> ");
        int qtd = teclado.nextInt();
        
        while (cont <= qtd) {
            System.out.print("Valor a converter em US$ ==> ");
            int real = teclado.nextInt();
            float dolar = real/2.20f;
            System.out.printf("R$,%s convertido em Dolar equivale a US$,%.2f \n", real, dolar);
            // cont++;
            cont = cont +1;
        }
        
    }
    
    public static void Tabuada() {
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        
        System.out.println("*** TABUADA ***");
        System.out.print("Qual tabuada você quer ver? ==> ");
        int nTabuada = teclado.nextInt();
        System.out.print("Até quanto multiplicar? ==> ");
        int qtd = teclado.nextInt();
        System.out.printf("***** TABUADA DE %s *****", nTabuada);
        System.out.println("");
        
        while (cont <= qtd) {
            int tba = nTabuada * cont;
            System.out.printf("%s x %s = %s \n", nTabuada, cont, tba);
            cont++;
        }
    }
    
    public static void SomaWhile() {
        Scanner teclado = new Scanner(System.in);
        
        int cont = 1;
        int soma = 0;
        int maior = 0;
        int menor = 0;
        System.out.print("Quantos Números quer somar? ==> ");
        int qtdNum = teclado.nextInt();
        while (cont <= qtdNum) {
            System.out.printf("Digite o %sº número ==> ", cont);
            int n = teclado.nextInt();
            soma = soma + n;
            if (n > maior) {
                maior = n;
            } else if (n > menor) {
                menor = n;
            }
            cont++;
        }
        System.out.printf("A soma de todos os números é ==> %s \n", soma);
        System.out.printf("O maior número de todos é ==> %s \n", maior);
        System.out.printf("O menor número de todos é ==> %s \n", menor);
    }
    
    public static void TrocaDedo() {
        Scanner teclado = new Scanner(System.in);
        
        int cont = 1;
        System.out.print("Quantos dedos você quer contar de (1 -> 5)? ==> ");
        int dedo = teclado.nextInt();
        
        while (cont <= dedo) {
            System.out.printf("*** %s Dedo *** \n", cont);
            cont++;
        }
    }
    
}
