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
public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    
    
    public int getMatr() {
        return this.matr;
    }
    public void setMatr(int matr) {
        this.matr = matr;
    }
    
    public String getCurso() {
        return this.curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void cancelarMatr() {
        System.out.println("Marticula será cancelada");
    }
    
}
