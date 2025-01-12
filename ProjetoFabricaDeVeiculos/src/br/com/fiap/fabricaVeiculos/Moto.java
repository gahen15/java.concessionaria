package br.com.fiap.fabricaVeiculos;

// Importa os componentes necessários para a moto
import br.com.fiap.fabricaVeiculos.componentes.Freios;
import br.com.fiap.fabricaVeiculos.componentes.Motor;
import br.com.fiap.fabricaVeiculos.componentes.Multimidia;
import br.com.fiap.fabricaVeiculos.componentes.Rodas;
import br.com.fiap.fabricaVeiculos.componentes.Tanque;

public class Moto extends Veiculos {

    // Construtor para inicializar os atributos da moto
    public Moto(String marca, String modelo, String cor, String renavam, Motor motor, String tipoCambio,
                String nomeCondutor, String anoFabricacao, String anoModelo, double limiteVelocidade, 
                Rodas rodas, Multimidia multimidia, Freios freios, Tanque tanque) {
        // Chama o construtor da classe pai (Veiculos) para definir atributos gerais do veículo
        super(marca, modelo, cor, renavam, motor, tipoCambio, nomeCondutor, anoFabricacao, anoModelo, limiteVelocidade,
                rodas, multimidia, freios, tanque);
    }

    
    // Sobrescreve o método exibirDados para exibir informações da moto
    @Override
    public void exibirDados() {
        // Chama o método exibirDados da classe pai para exibir dados gerais
        super.exibirDados();

    }
}
