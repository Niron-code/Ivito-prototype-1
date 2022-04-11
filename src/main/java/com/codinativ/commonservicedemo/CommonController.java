package com.codinativ.commonservicedemo;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 11-April-2022 at 11:44
 * @Project common-service-demo
 * Happy Coding..!
 */

import com.codinativ.commonservicedemo.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Common service to fetch data in parallel from
 * user-service-demo and address-service-demo
 */
@RestController
@RequestMapping("/event-details")
public class CommonController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${name.url}")
    private String nameUrl;

    @Value("${event.url}")
    private String eventUrl;

    @Value("${address.url}")
    private String addressUrl;

    @GetMapping("/{id}")
    public Event getUserDetails(@PathVariable("id") String id){
         ResponseEntity<String> name= restTemplate.exchange(nameUrl+id, HttpMethod.GET,null, String.class);
         ResponseEntity<String> event=  restTemplate.exchange(eventUrl+id, HttpMethod.GET,null, String.class);
         ResponseEntity<String> address=  restTemplate.exchange(addressUrl+id, HttpMethod.GET,null, String.class);
         
          Event e = new Event();
          e.setName(name.getBody());
          e.setEvent(event.getBody()); 
          e.setAddress(address.getBody());

          return e;
    }
}
