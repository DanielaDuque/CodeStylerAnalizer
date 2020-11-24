package com.finalProject.styleAnalizer.controler;

import com.finalProject.styleAnalizer.logic.Translate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/java")
public class controlStyle {

    // create GET endpoint to serve demo data at /demo/data
    @GetMapping(value = "/data")
    public String getDemoData() {
        return "Demo Data";
    }

    @PostMapping("/code-analysis")
    public ResponseEntity postBody(@RequestBody String code) {
        String response = Translate.analyse(code);
        return new ResponseEntity(response, HttpStatus.ACCEPTED);
    }

}
