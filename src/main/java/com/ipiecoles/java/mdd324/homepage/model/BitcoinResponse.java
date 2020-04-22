package com.ipiecoles.java.mdd324.homepage.model;

import java.util.HashMap;
import java.util.Map;

public class BitcoinResponse {

    Double bitcoinAmount;
    HashMap<String, Double> currencies;

    public Double getBitcoinAmount() {
        return bitcoinAmount;
    }

    public void setBitcoinAmount(Double bitcoinAmount) {
        this.bitcoinAmount = bitcoinAmount;
    }

    public HashMap<String, Double> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(HashMap<String, Double> currencies) {
        this.currencies = currencies;
    }

    public BitcoinResponse(Double bitcoinAmount, HashMap<String, Double> currencies)
    {
        this.currencies = new HashMap<String, Double>();

        this.bitcoinAmount = bitcoinAmount;
        for(Map.Entry<String, Double> entry : currencies.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            this.currencies.put(key, value * this.bitcoinAmount);
        }
    }
}
