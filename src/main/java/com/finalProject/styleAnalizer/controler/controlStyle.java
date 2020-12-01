package com.finalProject.styleAnalizer.controler;

import com.finalProject.styleAnalizer.logic.ErrorStyle;
import com.finalProject.styleAnalizer.logic.PreviuosVerifications;
import com.finalProject.styleAnalizer.logic.Translate;
import com.finalProject.styleAnalizer.pojo.requestPOJO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/java")
public class controlStyle {

    // create GET endpoint to serve demo data at /demo/data
    @GetMapping(value = "/data")
    public String getDemoData() {
        return "Demo Data";
    }

    @PostMapping("/code-analysis")
    public ResponseEntity postBody(@RequestBody requestPOJO pojo) {
        String code = pojo.gettext();
        //System.out.println(pojo);

        int numClass = new PreviuosVerifications().NumberofIntClas(code);
        List<ErrorStyle> errors = new ArrayList();

        if (numClass>pojo.getmaxClassByFile()){
            ErrorStyle errorClass = new ErrorStyle("Maximo numero de clases o interfaces superado");
            errors.add(errorClass);
        }

        String response = Translate.analyse(code);
        if (errors.isEmpty()){
            return new ResponseEntity("No hubieron errores", HttpStatus.ACCEPTED);
        }
        return new ResponseEntity(errors, HttpStatus.CONFLICT);
    }

}
