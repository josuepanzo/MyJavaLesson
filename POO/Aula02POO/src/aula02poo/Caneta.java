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
public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Modelo : " + this.modelo);
        System.out.println("Cor : " + this.cor);
        System.out.println("Ponta : " + this.ponta);
        System.out.println("Carga : " + this.carga);
        System.out.println("Esta tampada? : " + this.tampada);
        System.out.println("");
    }
    
    void rabiscar() {
        if (this.tampada == false) {
            System.out.println("Rabiscando...");
        } else {
            System.out.println("Erro não pode rabiscar");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
    
}
