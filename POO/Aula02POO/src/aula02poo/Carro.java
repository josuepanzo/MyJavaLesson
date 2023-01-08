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
public class Carro {
    
    public String modelo;
    public String cor;
    private String matricula;
    public int porta;
    protected String combustivel;
    protected boolean ligar;
    
    public void infoCarro() {
        System.out.println("Modelo : " + this.modelo);
        System.out.println("Cor : " + this.cor);
        System.out.println("Matricula : " + this.matricula);
        System.out.println("Nº de Portas : " + this.porta);
        System.out.println("Combustível : " + this.combustivel);
        System.out.println("Esta ligado? " + this.ligar);
    }
    
    public void status() {
        if (this.ligar == true) {
            System.out.println("O carro pode andar");
        } else {
            System.out.println("O carro não pode andar");
        }
    }
    
    protected void ligado() {
        this.ligar = true;
    }
    
    protected void desligado() {
        this.ligar = false;
    }
    
}
