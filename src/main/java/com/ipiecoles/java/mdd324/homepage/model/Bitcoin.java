package com.ipiecoles.java.mdd324.homepage.model;

public class Bitcoin {
    private Double bitcoinAmount;
    private String currencyList;

    // Constructeur
    public Bitcoin(){
    }

    public Bitcoin(Double bitcoinAmount, String currencyList){
        this.bitcoinAmount = bitcoinAmount;
        this.currencyList = currencyList;
    }

    public Double getBitcoinAmount() {
        return bitcoinAmount;
    }

    public void setBitcoinAmount(Double bitcoinAmount) {
        this.bitcoinAmount = bitcoinAmount;
    }

    public String getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(String currencyList) {
        this.currencyList = currencyList;
    }
}

