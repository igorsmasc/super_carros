import model.Carro;

import service.CarroService;

public class Main {
    /**
     * Um carro tem os seguintes atributos:
     * - cor
     * - marca
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

    public static void main(String[] args) {
        // Testes sem framework (Testando apenas com o Java)

        // Gherkin
        // Given (Dado) - When (Quando) - Then (Então)

        // Global
        CarroService carroService = new CarroService();

        // Teste #1 - Deve ligar corretamente
        // Given
        Carro carro = new Carro();

        // When
        carroService.ligar(carro);

        // Then
        System.out.println(carro.getLigado());

        // -------------------------------------------------

        // Teste #2 - Deve desligar corretamente um carro ligado
        // Given (Dado)
        Carro carro2 = new Carro();
        carroService.ligar(carro2);

        // When
        carroService.desligar(carro2);

        // Then
        System.out.println(carro2.getLigado() == false);

        // -------------------------------------------------

        // Teste #3 - Deve acelerar corretamente um carro ligado
        // Given (Dado)
        Carro carro3 = new Carro();
        carroService.ligar(carro3);

        // When
        carroService.acelerar(carro3, 10);

        // Then
        System.out.println(carro3.getVelocidadeAtual() == 10);
    }
}
