package Classes;

public class ModeloVeiculo {
    private String marca;
    private String modelo;
    private String combustivel;

    public ModeloVeiculo(String marca, String modelo, String combustivel) {
        this.marca       = marca;
        this.modelo      = modelo;
        this.combustivel = combustivel;
    }

    public String getMarca()       { return marca; }
    public String getModelo()      { return modelo; }
    public String getCombustivel() { return combustivel; }
}