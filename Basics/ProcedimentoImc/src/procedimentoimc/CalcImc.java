/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimentoimc;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */

public class CalcImc {
    
    static void OPeracoesImc(int peso, float altura) {
        
        // InteracaoImc(peso, altura);
        // condicaoImc(peso, altura);

        
        Scanner teclado = new Scanner(System.in);
        System.out.print("**** HOSPITAL JORGINA MICHEL ****");
        System.out.println("");
        System.out.print("DIGITE O PESO ");
        peso = teclado.nextInt();
        System.out.print("DIGITE A ALTURA ");
        altura = teclado.nextFloat();

        float imc = peso / (altura * altura);
        System.out.println(imc);
        if (imc < 18.5) {
            System.out.println("Abaixo do Peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso Ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau II");
        } else if (imc >= 40) {
            System.out.println("Obesidade grau III");
        }
        
    }
    
    /*static void InteracaoImc(int peso, float altura) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("**** HOSPITAL JORGINA MICHEL ****");
        System.out.println("");
        System.out.print("DIGITE O PESO ");
        peso = teclado.nextInt();
        System.out.print("DIGITE A ALTURA ");
        altura = teclado.nextFloat();
    }
    
    static float condicaoImc(int peso, float altura) {
        float imc = peso / (altura * altura);
        System.out.println(imc);
        if (imc < 18.5) {
            System.out.println("Abaixo do Peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso Ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau II");
        } else if (imc >= 40) {
            System.out.println("Obesidade grau III");
        }
        return imc;
    }*/
    
}
