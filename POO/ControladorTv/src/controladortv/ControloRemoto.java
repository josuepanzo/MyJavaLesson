/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladortv;

/**
 *
 * @author Joshua
 */
public class ControloRemoto implements Controlador {
    /// Atributos
    boolean ligado;
    int volume;
    boolean tocando;
    
    /// Construtor
    void ControloRemoto() {
        this.setLigado(false);
        this.setVolume(50);
        this.setTocando(false);
    }
    
    /// Métodos Especiais
    public boolean getLigado() {
        return this.ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public int getVolume() {
        return this.volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public boolean getTocando() {
        return this.tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    /// Sobrescrevendo métodos abstractos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("*** MENU ZAP TV ***");
        System.out.println("Esta lígado? " + this.getLigado());
        System.out.println("Est[a Tocando? " + this.getTocando());
        System.out.print("Volume " + this.getVolume());
        for (int i = 0; i<=this.getVolume(); i+=10) {
            System.out.println("|");
        }
    }

    @Override
    public void desligarMenu() {
        System.out.println("FECHANDO MENU ZAP");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível Aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível Diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
