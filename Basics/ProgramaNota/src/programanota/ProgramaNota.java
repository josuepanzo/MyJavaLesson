/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programanota;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class ProgramaNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        //String nome = teclado.nextLine();
        //float nota = teclado.nextFloat();
        //System.out.printf("%s a sua nota é %f", nome, nota);
        
        
        System.out.print("Digite o seu Peso: ");
        float peso = teclado.nextFloat();
        System.out.print("Digite a sua Altura: ");
        float altura = teclado.nextFloat();
        float imc = peso / (altura * altura);
        //System.out.printf("O seu imc é %f \n", imc);
        
        if(imc < 18.5){
            System.out.println("Abaixo do peso " + imc);
        } else if(imc > 18.5 && imc < 24.9){
            System.out.println("Peso Ideal " + imc);
        } else if(imc > 24.9 && imc < 29.9){
            System.out.println("Sobrepeso " + imc);
        } else if(imc > 30.9 && imc < 34.9){
            System.out.println("Obesidade grau I " + imc);
        } else if (imc > 34.9 && imc < 39.9){
            System.out.println("Obesidade grau II " + imc);
        } else if(imc > 40){
            System.out.println("Obesidade grau III " + imc);
        }
        
    }
    
}
