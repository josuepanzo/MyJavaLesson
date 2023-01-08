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
public class Funcionario extends Pessoa {
    private String sector;
    private boolean trabalhando;


    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    public void mudarTrab() {
        this.trabalhando = ! this.trabalhando;
    }
    
}
