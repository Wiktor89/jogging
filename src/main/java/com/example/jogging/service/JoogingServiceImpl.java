package com.example.jogging.service;

import com.example.jogging.dao.JoogingRepository;
import com.example.jogging.models.Jooging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by VAfonin on 27.03.2018.
 */
@Service
public class JoogingServiceImpl implements JoogingService {

    @Autowired
    private JoogingRepository repository;

    @Override
    public Jooging addJooging (Jooging jooging) {
        return repository.save (jooging);
    }

    @Override
    public void removeJooging (Integer id) {
        repository.deleteById (id);
    }

    @Override
    public void updateJooging (Jooging joogingDetails, Integer id) {
        Jooging jooging = repository.findById (id).orElseGet (Jooging::new);
        jooging.setCreateJooging (joogingDetails.getCreateJooging ());
        jooging.setEndJooging (joogingDetails.getEndJooging ());
        repository.save (jooging);
    }

    @Override
    public Jooging getJoogings (Integer id) {
        return repository.findById (id).get ();
    }

    @Override
    public List<Jooging> getJoogings () {
        return repository.findAll ();
    }
}
