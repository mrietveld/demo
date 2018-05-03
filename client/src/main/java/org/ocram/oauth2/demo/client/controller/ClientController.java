package org.ocram.oauth2.demo.client.controller;

import org.ocram.oauth2.demo.client.model.SecureResource;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class ClientController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public SecureResource getAllBooks() {
    	
    	RestTemplate authServerTemplate = new RestTemplate();
    	String authResourceUrl = "http://localhost:8081/auth";

//    	RestTemplate restTemplate =
//    	ResponseEntity<String> response
//    	  = RestTemplate.getForEntity(fooResourceUrl + "/1", String.class);
//    	Asser.assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    	
    	return null;
    }
}
