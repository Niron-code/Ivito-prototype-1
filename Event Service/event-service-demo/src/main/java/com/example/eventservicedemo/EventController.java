package com.example.eventservicedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 11-April-2022 at 12:22
 * @Project event-service-demo
 * Happy Coding..!
 */

@RestController
@RequestMapping("/event")
public class EventController {

    @GetMapping("/{id}")
    public String getEvent(@PathVariable("id") String id){
        if(id.equals("EVENT_1"))
            return "Wedding";
        throw new RuntimeException();
    }
}
