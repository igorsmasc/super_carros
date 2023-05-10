package service;

import model.Carro;

public class CarroService {
    public void ligar(Carro carro) {
        carro.setLigado(true);
    }

    public void desligar(Carro carro) {
        carro.setLigado(false);
    }

    public void acelerar(Carro carro, int velocidade) {
        carro.setVelocidadeAtual(carro.getVelocidadeAtual() + velocidade);
    }

    public void frear(Carro carro, int velocidade) {
        carro.setVelocidadeAtual(carro.getVelocidadeAtual()-velocidade);
    }

    // Modificadores de acesso - public, protected, default, private

    public void publicTest() {
        // todos conseguem acessar
    }

    protected void protectedTest() {
        // própria classe, MESMO PACOTE e subclasses
    }

    void defaultTest() {
        // própria classe e MESMO PACOTE
    }

    private void privateTest() {
        // apenas a própria classe
    }

}
