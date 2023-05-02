import model.Carro;

import org.junit.Assert;
import org.junit.Test;
import service.CarroService;

public class Main {
    /**
     * Um carro tem os seguintes atributos:
     * - cor
     * - modelo
     * - ligado
     * - velocidadeAtual
     * - velocidadeMaxima
     *
     * Enquanto o carro estiver desligado deve ser capaz de:
     * - Ligar
     * - Motrar estado atual (toString())
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual (toString())
     *
     * Regras:
     * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
     * - Não existe velocidade negativa
     * - Um carro tem por padrão velocidade máx = 100km/h
     * - O carro não pode passar de sua velocidade máxima
     */

    @Test
    public void deveLigarCorretamente() {
        // Testes sem ASSERTIVAS PASSAM!

        // Teste #1 - Deve ligar corretamente
        // Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        // When
        carroService.ligar(carro);

        // Then
        Assert.assertTrue(carro.getLigado());
    }

    @Test
    public void deveDesligarCorretamenteUmCarroLigado() {
        // Teste #2 - Deve desligar corretamente um carro ligado
        // Given (Dado)
        CarroService carroService = new CarroService();
        Carro carro2 = new Carro();
        carroService.ligar(carro2);

        // When
        carroService.desligar(carro2);

        // Then
        Assert.assertFalse(carro2.getLigado());
    }

    @Test
    public void deveAcelerarCorretamenteUmCarroLigado() {
        // Teste #3 - Deve acelerar corretamente um carro ligado
        // Given (Dado)
        CarroService carroService = new CarroService();
        Carro carro3 = new Carro();
        carroService.ligar(carro3);

        // When
        carroService.acelerar(carro3, 10);

        // Then
        Assert.assertTrue(carro3.getVelocidadeAtual() == 10);
    }
}
