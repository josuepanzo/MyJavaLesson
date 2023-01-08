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
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    
    public String getEspecialidade() {
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public String getSalario() {
        return this.especialidade;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void receberAum(float aum) {
        this.salario += aum;
    }
    
}
