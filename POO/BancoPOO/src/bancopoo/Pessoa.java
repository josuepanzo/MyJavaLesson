/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopoo;

/**
 *
 * @author Joshua
 */
public class Pessoa {
    String nome;
    float altura;
    int peso;
    
    String getNome() {
        return this.nome;
    }
    void setNome(String nome) {
        this.nome = nome;
    }
    
    public float getAltura() {
        return this.altura;
    } 
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public int getPeso() {
        return this.peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    void infoPessoa() {
        System.out.println("Nome : " + this.getNome());
        System.out.println("Altura : " + this.getAltura());
        System.out.println("Peso : " + this.getPeso());
    }
}
