/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03poo;

/**
 *
 * @author Joshua
 */
public class Pessoa {
    private String nome;
    private String raca;
    private int idade;
    private float altura;
    
    public Pessoa (String nome, String raca, int idade, float altura) {
        this.setNome(nome);
        this.setRaca(raca);
        this.setIdade(idade);
        this.setAltura(altura);
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getRaca() {
        return this.raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public float getAltura() {
        return this.altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void infoPessoa() {
        System.out.println("Nome : " + this.getNome());
        System.out.println("Raça : " + this.getRaca());
        System.out.println("Idade : " + this.getIdade());
        System.out.println("Altura : " + this.getAltura());
        System.out.println("");
    }
    
}
