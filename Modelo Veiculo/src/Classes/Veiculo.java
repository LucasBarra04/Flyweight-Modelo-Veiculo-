package Classes;

public class Veiculo {
    private String placa;
    private Integer ano;
    private ModeloVeiculo modeloVeiculo;

    public String getPlaca()                   { return placa; }
    public void setPlaca(String placa)         { this.placa = placa; }
    public Integer getAno()                    { return ano; }
    public void setAno(Integer ano)            { this.ano = ano; }
    public ModeloVeiculo getModeloVeiculo()    { return modeloVeiculo; }
    public void setModeloVeiculo(ModeloVeiculo m) { this.modeloVeiculo = m; }
}