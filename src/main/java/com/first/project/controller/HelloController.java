
package com.first.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}
