package service;

import model.Carro;
import org.junit.*;

public class CarroServiceTest {

    @Test
    public void deveLigarUmCarroDesligado() {
        // Gherkin

        // Given - Dado
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        // When - Quando
        carroService.ligar(carro);

        // Then - Então
        Assert.assertTrue(carro.getLigado());
    }

    @Test
    public void deveDesligarUmCarroLigado() {
        // Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);

        // When
        carroService.desligar(carro);

        // Then
        Assert.assertFalse(carro.getLigado());
    }

    @Test
    public void deveAcelerarUmCarroLigado() {
        // Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);

        // When
        carroService.acelerar(carro, 10);

        // Then
        Integer resultadoEsperado = 10;
        Assert.assertEquals(resultadoEsperado, carro.getVelocidadeAtual());
    }

    @Test
    public void deveFrearUmCarroLigadoEEmMovimento() {
        // Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);
        carroService.acelerar(carro, 20);

        // When
        carroService.frear(carro, 15);

        // Then
        Assert.assertEquals((Integer) 5, carro.getVelocidadeAtual());
    }

}
