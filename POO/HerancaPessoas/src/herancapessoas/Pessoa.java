/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancapessoas;

/**
 *
 * @author Joshua
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getSexo(String sexo) {
        return this.sexo = sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void fazerNiver() {
        this.idade++;
    }
    
}
