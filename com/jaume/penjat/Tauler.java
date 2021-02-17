package com.jaume.penjat;

public class Tauler {
	private char[] paraulaSecreta;
    private int intents;
    private String[] paraulaEndevinada;
    private int intentsInicials;

    public char[] getParaulaSecreta() {
        return paraulaSecreta;
    }

    public void setParaulaSecreta(char[] paraulaSecreta) {
        this.paraulaSecreta = paraulaSecreta;
    }

    public int getIntents() {
        return intents;
    }

    public void setIntents(int intents) {
        this.intents = intents;
    }

    public String[] getParaulaEndevinada() {
        return paraulaEndevinada;
    }

    public void setParaulaEndevinada(String[] paraulaEndevinada) {
        this.paraulaEndevinada = paraulaEndevinada;
    }

    public int getIntentsInicials() {
        return intentsInicials;
    }

    public void setIntentsInicials(int intentsInicials) {
        this.intentsInicials = intentsInicials;
    }    
	public void inicialitzarPartida(String paraula, int parseInt) {
        paraulaSecreta = paraula.toCharArray();
        paraulaEndevinada = new String[getParaulaSecreta().length];
        for (int i = 0;i<paraulaEndevinada.length;i++) {
            paraulaEndevinada[i] = null ;
        }
        intents = num;
        intentsInicials = num;
    }

    public boolean imprimir() {
    }

    public boolean hasGuanyat() {
		        boolean guanyat = true;
        for (int i = 0;(i<paraulaEndevinada.length) && (guanyat);i++) {
            if (paraulaEndevinada[i].charAt(0) != paraulaSecreta[i]) {
                guanyat = false;
            }
        }
        return guanyat;
    }

    public boolean imprimirVides() {
    }

    public boolean verificar(String letra) {
    }
}
