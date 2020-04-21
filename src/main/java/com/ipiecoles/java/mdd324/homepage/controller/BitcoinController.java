package com.ipiecoles.java.mdd324.homepage.controller;

import com.ipiecoles.java.mdd324.homepage.model.Bitcoin;
import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/data/price")
public class BitcoinController {

    @RequestMapping(method = RequestMethod.POST)
    public List<Bitcoin>
}
