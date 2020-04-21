package com.ipiecoles.java.mdd324.homepage.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipiecoles.java.mdd324.homepage.model.Bitcoin;
import com.ipiecoles.java.mdd324.homepage.utils.Utils;
import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/price")
public class BitcoinController {

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = "application/json",
            produces = "application/json",
            value = ""
    )

    public Bitcoin envoyerBitcoin(@RequestBody Bitcoin bitcoinResponse) throws Exception{

        String jsonBitcoin = Utils.getPageContents("https://min-api.cryptocompare.com/data/price?fsym=BTC&tsyms=" + bitcoinResponse.getCurrencyList());

        // Initialise un objet Genson
        Genson genson = new GensonBuilder().useRuntimeType(true).create();

        //Mappé se que l'on a récupérer dans le string jsonBitcoin
        Map<String, Object> currencies = genson.deserialize(jsonBitcoin, Map.class);

        // Objet mapper
        ObjectMapper mapper = new ObjectMapper();

        //bitcoinResponse.setCurrencyList(HashMap<currencies, currencies.values()>);

        // Test
        //List<String> ListDevise = mapper.readValue() ;//mapper.readValues(currencies.values());
       // List<String> ListDevise = mapper.readValues(currencies.values());


        // Crée une liste de valeurs strings à partir de la liste currencies


        // Crée une liste de valeurs Doubles à partir des valeurs de la liste currencies

        return bitcoinResponse;

    }
}
