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
	public void inicialitzarPartida(String paraula, int num) {
        paraulaSecreta = paraula.toCharArray();
        paraulaEndevinada = new String[getParaulaSecreta().length];
        for (int i = 0;i<paraulaEndevinada.length;i++) {
            paraulaEndevinada[i] = null ;
        }
        intents = num;
        intentsInicials = num;
    }

    public  String imprimir() {
		String auxiliar = "";
        for (int i = 0;i<paraulaEndevinada.length;i++) {
            if (paraulaEndevinada[i] == null){
                auxiliar = auxiliar + "_";
            }else{
                auxiliar = auxiliar + paraulaEndevinada[i];
            }
        }
        return auxiliar;
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

    public String imprimirVides(){
        if (intents == 1){
            return imprimirVidesSingular();
        }
        else {
            return imprimirVidesPlural();
        }
    }
	
	private String imprimirVidesSingular(){
        return ("Et queda 1 vida de " + String.valueOf(intentsInicials));
    }

    private String imprimirVidesPlural() {
        return ("Et queden " + String.valueOf(intents) + " de " + String.valueOf(intentsInicials));
    }

    public String verificar(String lletra){
        if(lletra.length() != 1){
            return "Lletra incorrecte";
        }
        else {
            boolean encert = false;
            for (int i = 0; i < paraulaSecreta.length; i++){
                if (paraulaSecreta[i] == lletra.charAt(0)) {
                    paraulaEndevinada[i] = lletra;
                    encert = true;
                }
            }
            if (!encert) {
                intents--;
            }
            return "";
        }
    }
	
}
