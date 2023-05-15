package service;

import model.Carro;
import org.junit.*;

public class CarroServiceTest {

    private static CarroService carroService;

    // Before, BeforeClass

    @Before // Antes de cada teste
    public void before() {
        System.out.println("Before");
    }

    @BeforeClass // Antes da classe ser instanciada
    public static void beforeClass() {

        carroService = new CarroService();
        System.out.println("Before Class");
    }

    // After, AfterClass

    @After // Após cada teste
    public void after() {
        // limpar ou restar o banco
        System.out.println("After");
    }

    @AfterClass // Após a classe
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Test
    public void deveLigarUmCarroDesligado() {
        System.out.println("deveLigarUmCarroDesligado");
        // Gherkin

        // Given - Dado
        Carro carro = new Carro();

        // When - Quando
        carroService.ligar(carro);

        // Then - Então
        Assert.assertTrue(carro.getLigado());
    }

    @Test
    public void deveDesligarUmCarroLigado() {
        System.out.println("deveDesligarUmCarroLigado");
        // Given
        Carro carro = new Carro();
        carroService.ligar(carro);

        // When
        carroService.desligar(carro);

        // Then
        Assert.assertFalse(carro.getLigado());
    }

    @Test
    public void deveAcelerarUmCarroLigado() {
        System.out.println("deveAcelerarUmCarroLigado");
        // Given
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
        System.out.println("deveFrearUmCarroLigadoEEmMovimento");
        // Given
        Carro carro = new Carro();
        carroService.ligar(carro);
        carroService.acelerar(carro, 20);

        // When
        carroService.frear(carro, 15);

        // Then
        Assert.assertEquals((Integer) 5, carro.getVelocidadeAtual());
    }

}
