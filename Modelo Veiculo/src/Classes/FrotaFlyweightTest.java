package Classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FrotaFlyweightTest {

    @Test
    void veiculosComMesmoModeloDevemCompartilharInstancia() {
        ModeloVeiculo m1 = ModeloFactory.getModelo("Nissan", "Silvia S15", "Gasolina");
        ModeloVeiculo m2 = ModeloFactory.getModelo("Nissan", "Silvia S15", "Gasolina");
        assertSame(m1, m2);
    }

    @Test
    void veiculosComModelosDiferentesDevemTerInstanciasDiferentes() {
        ModeloVeiculo silvia = ModeloFactory.getModelo("Nissan", "Silvia S15", "Gasolina");
        ModeloVeiculo supra  = ModeloFactory.getModelo("Toyota", "Supra MK4", "Gasolina");
        assertNotSame(silvia, supra);
    }

    @Test
    void factoryDeveReutilizarModeloExistente() {
        ModeloFactory.getModelo("Mazda", "RX-7 FD", "Gasolina");
        int totalAntes = ModeloFactory.getTotalModelos();
        ModeloFactory.getModelo("Mazda", "RX-7 FD", "Gasolina");
        assertEquals(totalAntes, ModeloFactory.getTotalModelos());
    }

    @Test
    void frotaDeveAdicionarVeiculosCorretamente() {
        Frota frota = new Frota();
        frota.addVeiculo("DRF-1998", 1998, "Nissan", "Silvia S14", "Gasolina");
        frota.addVeiculo("SKY-2002", 2002, "Nissan", "Skyline R34", "Gasolina");
        frota.addVeiculo("SUP-1995", 1995, "Toyota", "Supra MK4", "Gasolina");
        assertEquals(3, frota.getTotalVeiculos());
    }

    @Test
    void frotaComTresVeiculosDoisModelosDeveTerDoisModelosUnicos() {
        Frota frota = new Frota();
        frota.addVeiculo("JDM-0001", 1999, "Nissan", "180SX", "Gasolina");
        frota.addVeiculo("JDM-0002", 2000, "Nissan", "180SX", "Gasolina");
        frota.addVeiculo("JDM-0003", 1997, "Toyota", "Chaser JZX100", "Gasolina");
        assertTrue(frota.getTotalModelos() >= 2);
    }

    @Test
    void veiculoDeveManterSeuEstadoExtrinsecoIndependente() {
        Frota frota = new Frota();
        frota.addVeiculo("DRT-7777", 1996, "Mazda", "RX-7 FD", "Gasolina");

        Veiculo v = frota.getVeiculos().get(0);

        assertEquals("DRT-7777", v.getPlaca());
        assertEquals(1996, v.getAno());
    }

    @Test
    void modeloDeveManterDadosIntrinsecosCorretos() {
        ModeloVeiculo m = ModeloFactory.getModelo("Toyota", "AE86 Trueno", "Gasolina");

        assertEquals("Toyota", m.getMarca());
        assertEquals("AE86 Trueno", m.getModelo());
        assertEquals("Gasolina", m.getCombustivel());
    }
}