package Classes;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos = new ArrayList<>();

    public void addVeiculo(String placa, Integer ano,
                           String marca, String modelo, String combustivel) {
        Veiculo v = new Veiculo();
        v.setPlaca(placa);
        v.setAno(ano);
        v.setModeloVeiculo(ModeloFactory.getModelo(marca, modelo, combustivel));
        veiculos.add(v);
    }

    public List<Veiculo> getVeiculos() { return veiculos; }

    public int getTotalVeiculos()  { return veiculos.size(); }
    public int getTotalModelos()   { return ModeloFactory.getTotalModelos(); }
}