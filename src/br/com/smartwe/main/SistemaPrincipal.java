package br.com.smartwe.main;

import br.com.smartwe.model.Ventilador;

public class SistemaPrincipal {
    public static void main(String[] args) {
        
        System.out.println("\n--- Sistema SmartWe ---\n");
       
        //Criando o ventilador 1 (Objeto 1)
        Ventilador ventilador1 = new Ventilador("Ventilador de mesa", 40.0, 10);
        System.out.println("Velocidade Ventilador 1: ");
        ventilador1.alterarVelocidade(2);
        System.out.println("\nTemporizador Ventilador 1: ");
        ventilador1.acionarTemporizador(10);
        
        
        //Criando o ventilador 2 (Objeto 2)
        Ventilador ventilador2 = new Ventilador("Ventilador de teto", 60.0, 15);
        System.out.println("\nVelocidade Ventilador 2: ");
        ventilador2.alterarVelocidade(0);
        System.out.println("\nTemporizador Ventilador 2: ");
        ventilador2.acionarTemporizador(15);//Ventilador 2 está desligado (velocidade 0), portanto não aciona o temporizador
       
        System.out.println("\n---Verificando status dos aparelhos: ---\n");//potenciaWh define o gasto energético ATUAl(portanto se desligado, o gasto é 0)
        
        System.out.println("Modelo ventilador 1: " + ventilador1.getModelo() + " | Potencia: " + ventilador1.getPotenciaWh() + "Wh | Tamanho: " + ventilador1.getTamanhoCm() + "cm | Funcao: " + ventilador1.getFuncao());
        System.out.println("Modelo ventilador 2: " + ventilador2.getModelo() + " | Potencia: " + ventilador2.getPotenciaWh() + "Wh | Tamanho: " + ventilador2.getTamanhoCm() + "cm | Funcao: " + ventilador2.getFuncao() + "\n");
        
        System.out.println("Verificando velocidade: \n");
        System.out.println("Velocidade Ventilador 1: " + ventilador1.getVelocidade());
        System.out.println("Velocidade Ventilador 2: " + ventilador2.getVelocidade());
        
        System.out.println("\nVerificando temporizadores: \n");
        System.out.println("Temporizador Ventilador 1: " + ventilador1.getTemporizadorMinutos() + " minutos");
        System.out.println("Temporizador Ventilador 2: " + ventilador2.getTemporizadorMinutos() + " minutos");

        //Testes para "hackear" sistema
        /*ventilador1.potenciaWh = 100;
        ventilador2.velocidade = 2;*/
    }
}