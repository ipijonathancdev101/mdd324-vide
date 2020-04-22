package com.ipiecoles.java.mdd324.homepage.model;

import java.util.HashMap;
import java.util.Map;

public class BitcoinResponse {

    Double bitcoinAmount;
    HashMap<String, Double> currencies;
    public BitcoinResponse(Double bitcoinAmount, HashMap<String, Double> currencies)
    {
        this.bitcoinAmount = bitcoinAmount;
        for(Map.Entry<String, Double> entry : currencies.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            this.currencies.put(key, value * this.bitcoinAmount);
        }
    }
}
