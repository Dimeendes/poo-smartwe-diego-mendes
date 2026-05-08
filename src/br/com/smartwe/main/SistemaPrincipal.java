package br.com.smartwe.main;

import br.com.smartwe.model.Ventilador;

public class SistemaPrincipal {
    public static void main(String[] args) {
        //Criando o ventilador 1 (Objeto 1)
        Ventilador ventilador1 = new Ventilador("Ventilador de mesa", 40.0, 10);
        System.out.println("Temporizador Ventilador 1: ");
        ventilador1.acionarTemporizador(10);
        ventilador1.definirVelocidade(2);
        
        //Criando o ventilador 2 (Objeto 2)
        Ventilador ventilador2 = new Ventilador("Ventilador de teto", 60.0, 15);
        System.out.println("Temporizador Ventilador 2: ");
        ventilador2.acionarTemporizador(15);
        ventilador2.definirVelocidade(3);
        
        System.out.println("\n--- Sistema SmartWe ---\n");
        
        System.out.println("Modelo ventilador 1: " + ventilador1.modelo + " | Potencia: " + ventilador1.potenciaWh + "Wh | Tamanho: " + ventilador1.tamanhoCm + "cm | Funcao: " + ventilador1.funcao);
        System.out.println("Modelo ventilador 2: " + ventilador2.modelo + " | Potencia: " + ventilador2.potenciaWh + "Wh | Tamanho: " + ventilador2.tamanhoCm + "cm | Funcao: " + ventilador2.funcao + "\n");
        
        System.out.println("Verificando velocidade: \n");
        System.out.println("Velocidade Ventilador 1: " + ventilador1.velocidade);
        System.out.println("Velocidade Ventilador 2: " + ventilador2.velocidade);
        
        System.out.println("\nVerificando temporizadores: \n");
        System.out.println("Temporizador Ventilador 1: " + ventilador1.temporizadorMinutos + " minutos");
        System.out.println("Temporizador Ventilador 2: " + ventilador2.temporizadorMinutos + " minutos");

        //Testes com valores inválidos
        /*System.out.println("\nTestes com valores inválidos: \n");
        ventilador1.acionarTemporizador(-1);
        ventilador1.definirVelocidade(-1);
        ventilador2.acionarTemporizador(-1);
        ventilador2.definirVelocidade(4);
        */
    }
}