import model.Carro;
import org.junit.Assert;
import org.junit.Test;

public class PrimeirosPassos {

    @Test
    public void praticandoAssertTrue() {
        boolean eMaiorDeIdade = true;

        Assert.assertTrue(eMaiorDeIdade);
    }

    @Test
    public void praticandoAssertFalse() {
        boolean foiReprovado = false;

        Assert.assertFalse(foiReprovado);
    }

    @Test
    public void praticandoAssertNull() {
        Carro carroCliente = null;

        Assert.assertNull(carroCliente);
    }

    @Test
    public void praticandoAssertNotNull() {
        Carro carroCliente = new Carro();

        Assert.assertNotNull(carroCliente);
    }

    @Test
    public void praticandoAssertArrayEquals() {
        int[] notas = new int[]{1, 2, 3};
        int[] notas2 = new int[]{1, 2, 3};

        Assert.assertArrayEquals(notas, notas2);
    }

    @Test
    public void pratincadoAssertEquals() {

        int a = 1;
        int b = 1;

        Assert.assertEquals(a, b);
    }

    @Test
    public void pratincadoAssertEquals_Objetos() {
        Carro carro1 = new Carro();
        carro1.setModelo("xyz 01");

        Carro carro2 = new Carro();
        carro2.setModelo("xyz 01");

        Assert.assertEquals(carro1, carro2); // Utilizar o método equals do objeto
    }

    @Test
    public void praticandoAssertNotEquals() {
        int a = 1;
        int b = 2;

        Assert.assertNotEquals(a, b);
    }

    @Test
    public void praticandoAssertNotEquals_Objetos() {
        Carro carro1 = new Carro();
        carro1.setModelo("xyz 01");

        Carro carro2 = new Carro();
        carro2.setModelo("xyz 02");

        Assert.assertNotEquals(carro1, carro2);
    }

    @Test
    public void praticandoAssertSame() {
        Carro carro01 = new Carro();
        carro01.setModelo("carro_xyz");

        Carro carro02 = carro01;

        Assert.assertSame(carro01, carro02);
    }

    @Test
    public void praticandoAssertNotSame() {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        Assert.assertNotSame(carro01, carro02);
    }

    @Test
    public void praticandoOrdemParametros() {
        int resultado = somar(2, 5);
        int resultadoEsperado = 7;

        Assert.assertEquals(resultadoEsperado, resultado); // -> 1 - Esperado | 2 - Atual
    }

    @Test
    public void praticandoOrdemParametros_Not() {
        int resultadoNaoEsperado = 5;
        int resultado = somar(2, 2);

        Assert.assertNotEquals(resultadoNaoEsperado, resultado);
    }

    private int somar(int a, int b) {
        return a + b;
    }
}
