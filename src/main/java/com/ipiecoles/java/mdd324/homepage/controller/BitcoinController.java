package com.ipiecoles.java.mdd324.homepage.controller;

import com.ipiecoles.java.mdd324.homepage.model.Bitcoin;
import com.ipiecoles.java.mdd324.homepage.model.BitcoinResponse;
import com.ipiecoles.java.mdd324.homepage.utils.Utils;
import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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

    public BitcoinResponse envoyerBitcoin(@RequestBody Bitcoin bitcoinRequestResponse) throws Exception{


        String jsonBitcoin = Utils.getPageContents("https://min-api.cryptocompare.com/data/price?fsym=BTC&tsyms=" + bitcoinRequestResponse.getCurrencyList());

        // Initialise un objet Genson
        Genson genson = new GensonBuilder().useRuntimeType(true).create();

        //Mapper se que l'on a récupéré dans le string jsonBitcoin
        HashMap<String, Double> currencies = genson.deserialize(jsonBitcoin, HashMap.class);

        BitcoinResponse bitcoinResponse = new BitcoinResponse(bitcoinRequestResponse.getBitcoinAmount(), currencies);


        return bitcoinResponse;

    }
}
