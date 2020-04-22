package com.ipiecoles.java.mdd324.homepage.model;

import java.util.List;

public class BitcoinResponse {

    //Liste des devises
    List<String> devises;

    //Liste des valeurs pour chaques devises
    List<Integer> prices;

    // Constructor

    public BitcoinResponse(){

    }

    public BitcoinResponse(List<String> devises,List<Integer> prices){
        this.devises = devises;
        this.prices = prices;
    }
}
