package com.deltavivo.screenmatchmemorablephrases.controller;

import com.deltavivo.screenmatchmemorablephrases.dto.FraseDTO;
import com.deltavivo.screenmatchmemorablephrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria(){
        return service.obterFraseAleatoria();
    }
}
