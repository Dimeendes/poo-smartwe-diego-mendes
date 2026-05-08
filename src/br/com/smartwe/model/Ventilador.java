package br.com.smartwe.model;

public class Ventilador {
    public String modelo;
    public double potenciaWh;
    public int tamanhoCm;
    public String funcao;
    public int temporizadorMinutos; //Atributo novo para o método acionarTemporizador
    public int velocidade; //Atributo novo para o método definirVelocidade

    public Ventilador(String modelo, double potenciaWh, int tamanhoCm) {
        this.modelo = modelo;
        this.potenciaWh = potenciaWh;
        this.tamanhoCm = tamanhoCm;
        this.funcao = "Ventilacao";
        this.temporizadorMinutos = 0;
        this.velocidade = 0;
    }

    public void acionarTemporizador(int minutos) {
        if(minutos <= 0) {
            System.out.println("O temporizador deve ser maior que 0 minutos");
            return;
        }
        this.temporizadorMinutos = minutos;
        System.out.println("Temporizador acionado para " + minutos + " minutos");
    }
    
    public void definirVelocidade(int velocidade) {
        if(velocidade < 0 || velocidade > 3) {
            System.out.println("A velocidade deve ser positiva e menor que 3");
            return;
        }
        this.velocidade = velocidade;
        System.out.println("Velocidade definida para " + velocidade);
    }
}
