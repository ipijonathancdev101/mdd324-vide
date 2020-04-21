package com.ipiecoles.java.mdd324.homepage.model;


import javax.servlet.http.HttpServletRequest;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Bitcoin {
        Integer bitcoinAmount;
        List<String> currencyList;
        String url;

        // Constructeur
        public Bitcoin(){
        /*
        bitcoinAmount = 1; // Initialise bitcoin à 1
        Set<String> currencyList = (Set<String>) new ArrayList<String>();
        currencyList.add("EUR");
        currencyList.add("USD");
        */

            url = "https://min-api.cryptocompare.com/data/price";
        }




    }

}
