package com.codinativ.addressservicedemo;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 08-April-2022 at 12:01
 * @Project address-service-demo
 * Happy Coding..!
 */

@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/{id}")
    public String getAddress(@PathVariable("id") String id){
        if(id.equals(("EVENT_1")))
            return "Hotel East Lagoon"; //assume coming from db
        throw new RuntimeException();
    }
}

