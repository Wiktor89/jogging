package com.example.jogging.controller;

import com.example.jogging.models.Jooging;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = Url.CONTROLLER_JOOPING)
public class JoogingController {

    @RequestMapping(value = Url.POST_JOOGING, method = RequestMethod.GET)
    public Jooging addJooging(@RequestBody Jooging jooging) {
        return jooging;
    }

    @RequestMapping(value = Url.DELETE_Jooging_BY_ID, method = RequestMethod.DELETE)
    public void removeJooging(@PathVariable("id") Integer id) {
        System.out.println ();
    }

    @RequestMapping(value = Url.PUT_Jooging_BY_ID, method = RequestMethod.PUT)
    public void updateJooging(@RequestBody Jooging Jooging, @PathVariable("id") Integer id) {
        System.out.println ();
    }

    @RequestMapping(value = Url.GET_Jooging_BY_ID, method = RequestMethod.GET)
    public Jooging getJooging(@PathVariable("id") Integer id) {
        return null;
    }

    @RequestMapping(value = Url.GET_JOOGINGS, method = RequestMethod.GET)
    public Jooging getJoogings() {
        return null;
    }
}
