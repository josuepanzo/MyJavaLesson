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
public class ContaBanco {
    
    private int numConta;
    private String donoConta;
    protected String tipo;
    private int saldo;
    private boolean status;
    
    ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public String getDonoConta() {
        return this.donoConta;
    }
    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getSaldo() {
        return this.saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void infoConta() {
        System.out.println("Nº CONTA : " + this.getNumConta());
        System.out.println("TITULAR : " + this.getDonoConta());
        System.out.println("SALDO : " + this.getSaldo());
        System.out.println("STATUS : " + this.getStatus());
    }
    
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }
    }
    
    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
        }
    }
    
    public void sacarSaldo(int v) {
        if (getStatus()) {
            if (saldo > v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente!!");
            }
        } else {
            System.out.println("Impossível sacar!!");
        }
    }
    
    public void depositarSaldo(int v) {
        if (status = true) {
            // saldo = saldo + v;
            setSaldo(getSaldo() + v);
        } else {
            System.out.println("Impossível depositar!!");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        if (tipo == "CC") {
            saldo = 12;
        } else if (tipo == "CP") {
            saldo = 20;
        }
        
        if (getStatus()) {
            if (saldo > v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente!!");
            }
        } else {
            System.out.println("Impossível pagar!!");
        }
        
    }
    
}
