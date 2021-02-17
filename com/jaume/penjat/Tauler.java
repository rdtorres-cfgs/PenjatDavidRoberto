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
}
