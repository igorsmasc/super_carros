package model;

import java.util.Objects;

public class Carro {
    private String cor;
    private String marca;
    private Integer ano;
    private Boolean ligado;
    private Integer velocidadeAtual;
    private Integer velocidadeMaxima;

    // Os testes mostrar a presença de erros e não sua ausencia
    public Carro() {
        this.ligado = false;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = 100;
    }

    public Carro(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.ligado = false;
        this.velocidadeAtual = 0;
    }

    public Carro(String marca) {
        this.marca = marca;
        this.ligado = false;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = 100;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", ligado=" + ligado +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro)) return false;
        Carro carro = (Carro) o;
        return marca.equals(carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }
}
