package com.example.upravljanjeucenicima.service;


import com.example.upravljanjeucenicima.model.Ucenik;
import com.example.upravljanjeucenicima.repository.Skladiste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UcenikServiceImpl implements UcenikService{

    @Autowired
    Skladiste skladiste;

    @Override
    public List<Ucenik> getAllUcenici() {
        return skladiste.findAll();
    }

    @Override
    public void sacuvajUcenika(Ucenik ucenik) {
        this.skladiste.save(ucenik);
    }

    @Override
    public Ucenik getUcenikById(long id) {
        Optional<Ucenik> optional = skladiste.findById(id);
        Ucenik ucenik = null;
        if (optional.isPresent()) {
            ucenik = optional.get();
        } else {
            throw new RuntimeException("Ucenik nije pronadjen za id: " + id);
        }
        return ucenik;
    }

    @Override
    public void deleteUcenika(long id) {
        this.skladiste.deleteById(id);
    }


}
