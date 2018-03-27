package com.example.jogging.service;

import com.example.jogging.models.Jooging;

import java.util.List;

/**
 * Created by VAfonin on 27.03.2018.
 */
public interface JoogingService {

    Jooging addJooging (Jooging jooging);

    void removeJooging (Integer id);

    void updateJooging (Jooging joogingDetails, Integer id);

    Jooging getJoogings (Integer id);

    List<Jooging> getJoogings ();
}
