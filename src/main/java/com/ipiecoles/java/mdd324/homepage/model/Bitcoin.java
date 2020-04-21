package com.ipiecoles.java.mdd324.homepage.model;
import java.util.List;

public class Bitcoin {
         private Integer bitcoinAmount;
         private List<String> currencyList;

        // Constructeur
        public Bitcoin(){
        }

        public Bitcoin(Integer bitcoinAmount, List<String> currencyList){
            this.bitcoinAmount = bitcoinAmount;
            this.currencyList = currencyList;
        }

    public Integer getBitcoinAmount() {
        return bitcoinAmount;
    }

    public void setBitcoinAmount(Integer bitcoinAmount) {
        this.bitcoinAmount = bitcoinAmount;
    }

    public List<String> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<String> currencyList) {
        this.currencyList = currencyList;
    }
}

