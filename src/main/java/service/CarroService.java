package service;

import model.Carro;

public class CarroService {
    public void ligar(Carro carro) {
        carro.setLigado(true);
    }

    public void desligar(Carro carro) throws Exception {
        carro.setLigado(false);
    }

    public void acelerar(Carro carro, int velocidade) {
        carro.setVelocidadeAtual(carro.getVelocidadeAtual() + velocidade);
    }

    public void frear(Carro carro, int velocidade) {
        carro.setVelocidadeAtual(carro.getVelocidadeAtual()-velocidade);
    }
}
