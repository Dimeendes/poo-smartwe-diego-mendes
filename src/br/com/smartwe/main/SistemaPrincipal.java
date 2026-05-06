package br.com.smartwe.main;

import br.com.smartwe.model.Ventilador;

public class SistemaPrincipal {
    public static void main(String[] args) {
        //Criando o ventilador 1 (Objeto 1)
        Ventilador ventilador1 = new Ventilador();
        ventilador1.modelo = "Ventilador de mesa";//Modelos variam entre mesa, teto e chão
        ventilador1.potenciaWh = 40.0;
        ventilador1.tamanhoCm = 10;
        ventilador1.funcao = "Ventilacao";//As demais funções serão adicionadas posteriormente com a implementação das diferentes
        
        //Criando o ventilador 2 (Objeto 2)
        Ventilador ventilador2 = new Ventilador();
        ventilador2.modelo = "Ventilador de teto";
        ventilador2.potenciaWh = 60.0;
        ventilador2.tamanhoCm = 15;
        ventilador2.funcao = "Ventilacao";
        
        System.out.println("--- Sistema SmartWe ---");
        
        System.out.println("Modelo ventilador 1: " + ventilador1.modelo + " | Potencia: " + ventilador1.potenciaWh + "Wh | Tamanho: " + ventilador1.tamanhoCm + "cm | Funcao: " + ventilador1.funcao);
 
        System.out.println("Modelo ventilador 2: " + ventilador2.modelo + " | Potencia: " + ventilador2.potenciaWh + "Wh | Tamanho: " + ventilador2.tamanhoCm + "cm | Funcao: " + ventilador2.funcao);
    }
}