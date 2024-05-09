package com.deltavivo.screenmatchmemorablephrases.service;

import com.deltavivo.screenmatchmemorablephrases.dto.FraseDTO;
import com.deltavivo.screenmatchmemorablephrases.model.Frase;
import com.deltavivo.screenmatchmemorablephrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    FraseRepository repository;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repository.obterFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(),frase.getPoster());
    }
}
