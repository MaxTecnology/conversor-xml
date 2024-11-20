package br.com.maxtecnology.conversorxml.service;


import br.com.maxtecnology.conversorxml.model.Pais;
import br.com.maxtecnology.conversorxml.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {
    @Autowired
    PaisRepository paisRepository;

    public void saveAll(List<Pais> paisList) {
        paisRepository.saveAll(paisList);
    }
}
