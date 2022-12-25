package com.sample_jenkins.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/third_service")
public class Controller {

    @GetMapping
    public ResponseEntity<Object> addRule(){

        HashMap data = new HashMap();

        data.put("fist","first");
        data.put("second","second");
        data.put("third","third");

        return new ResponseEntity<Object>(data,  HttpStatus.OK);
    }

}
