package Classes;

import java.util.HashMap;
import java.util.Map;

public class ModeloFactory {
    private static Map<String, ModeloVeiculo> modelos = new HashMap<>();

    public static ModeloVeiculo getModelo(String marca, String modelo, String combustivel) {
        String chave = marca + "-" + modelo + "-" + combustivel;
        if (!modelos.containsKey(chave)) {
            modelos.put(chave, new ModeloVeiculo(marca, modelo, combustivel));
            System.out.println("Novo modelo criado: " + chave);
        }
        return modelos.get(chave);
    }

    public static int getTotalModelos() {
        return modelos.size();
    }
}