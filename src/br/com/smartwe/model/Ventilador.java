package br.com.smartwe.model;

public class Ventilador {
    private String modelo;
    private double potenciaWh;
    private int tamanhoCm;
    private String funcao;
    private int temporizadorMinutos; //Atributo novo para o método acionarTemporizador
    private int velocidade; //Atributo novo para o método definirVelocidade

    public Ventilador(String modelo, double potenciaWh, int tamanhoCm) {
        this.modelo = modelo;
        this.setPotenciaWh(potenciaWh);
        this.tamanhoCm = tamanhoCm;
        this.funcao = "Ventilacao";
        this.setTemporizadorMinutos(0);
        this.setVelocidade(0);
    }
    
    public String getModelo() {
        return this.modelo;
    }

    public double getPotenciaWh() {
        return this.potenciaWh;
    }

    private void setPotenciaWh(double potenciaWh) {
        if(potenciaWh >= 0) {
            this.potenciaWh = potenciaWh;
        } else {
            System.out.println("A potencia deve ser maior que 0");
        }
    }

    public int getTamanhoCm() {
        return this.tamanhoCm;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public int getTemporizadorMinutos() {
        return this.temporizadorMinutos;
    }

    private void setTemporizadorMinutos(int temporizadorMinutos) {
        if(temporizadorMinutos >= 0) {
            this.temporizadorMinutos = temporizadorMinutos;
        }else{
            System.out.println("O temporizador deve ser maior que 0 minutos");
        }
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    private void setVelocidade(int velocidade) {
        if(velocidade >= 0 && velocidade <= 3) {
            this.velocidade = velocidade;
        }else{
            System.out.println("A velocidade deve ser positiva e menor que 3");
        }
    }

    public void acionarTemporizador(int minutos) {
        if(getVelocidade() != 0){
            if(minutos <= 0) {
                System.out.println("O temporizador deve ser maior que 0 minutos");
            }
            this.temporizadorMinutos = minutos;
            System.out.println("Temporizador acionado para " + minutos + " minutos");
        }else{
            System.out.println("O ventilador deve ser ligado para acionar o temporizador");
        }
    }
    
    public void alterarVelocidade(int velocidade) { //Por padronizar, velocidade 1 seria gasto padrão
        if(velocidade < 0 || velocidade > 3) {
            System.out.println("A velocidade deve ser positiva e menor que 3");

        }else{
            if(velocidade == 0){
                System.out.println("O ventilador foi desligado");
                setPotenciaWh(0);
            }else if(velocidade == 2){
                setPotenciaWh(getPotenciaWh() * 1.1); //Velocidade 2 é 10% maior que a velocidade 1
            }else if(velocidade == 3){
                setPotenciaWh(getPotenciaWh() * 1.25); //Velocidade 3 é 25% maior que a velocidade 1
            }
        }
        setVelocidade(velocidade);
        System.out.println("Velocidade definida para " + velocidade);
    }
}
