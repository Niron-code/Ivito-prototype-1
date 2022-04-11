package com.codinativ.microservicedemo;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 08-April-2022 at 11:32
 * @Project MicroserviceDemo
 * Happy Coding..!
 */
import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping("name/{id}")
    public String getName(@PathVariable("id") String id){
        if(id.equals(("EVENT_1")))
            return "Niron";
        throw new RuntimeException();
    }
}
