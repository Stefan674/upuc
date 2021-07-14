package com.example.upravljanjeucenicima.service;


import com.example.upravljanjeucenicima.model.Ucenik;

import java.util.List;

public interface UcenikService {
    List<Ucenik> getAllUcenici();
    void sacuvajUcenika(Ucenik ucenik);
    Ucenik getUcenikById(long id);
    void deleteUcenika(long id);
}
