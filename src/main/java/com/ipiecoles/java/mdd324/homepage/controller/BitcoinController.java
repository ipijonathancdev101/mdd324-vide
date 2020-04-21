package com.ipiecoles.java.mdd324.homepage.controller;

import com.ipiecoles.java.mdd324.homepage.model.Bitcoin;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("data/price")
public class BitcoinController {

    // Récuperer les valeurs pour une quantités de bitcoins, vers un ou plusieurs types de monnaie
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "" )
    public Bitcoin createBitcoinValue(@RequestBody Bitcoin bitcoin){
       return
    }

}
