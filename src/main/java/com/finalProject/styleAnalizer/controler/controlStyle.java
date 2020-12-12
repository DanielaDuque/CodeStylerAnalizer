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
@CrossOrigin(origins = "*")
public class controlStyle {


    // create GET endpoint to serve demo data at /demo/data
    @GetMapping(value = "/data")
    public String getDemoData() {
        return "Demo Data";
    }

    @PostMapping("/code-analysis")
    public ResponseEntity postBody(@RequestBody requestPOJO pojo) {
        String code = pojo.getText();
        //System.out.println(pojo);

        PreviuosVerifications pv = new PreviuosVerifications();

        int numClass = pv.NumberofIntClas(code);
        List<ErrorStyle> errors = new ArrayList();

        if (numClass > pojo.getMaxClassByFile()) {
            ErrorStyle errorClass = new ErrorStyle("There are " + numClass + " classes of " + pojo.getMaxClassByFile() + " max");
            errors.add(errorClass);
        }


        int numLinesComment = pv.NumberOfCommentLine(code);

        if (numLinesComment > pojo.getMaxLengthLineComment()) {
            ErrorStyle errorClass = new ErrorStyle("There are " + numLinesComment + " commented lines of " + pojo.getMaxLengthLineComment() + " max");
            errors.add(errorClass);
        }
        if (numLinesComment < pojo.getMinLengthLineComment()) {
            ErrorStyle errorClass = new ErrorStyle("There are " + numLinesComment + " commented lines of " + pojo.getMinLengthLineComment() + " min");
            errors.add(errorClass);
        }
        List<ErrorStyle> codeErrors = Translate.analyse(code);
        errors.addAll(codeErrors);

        if (errors.isEmpty()) {
            return new ResponseEntity("Code accepted", HttpStatus.ACCEPTED);
        }
        return new ResponseEntity(errors, HttpStatus.CONFLICT);
    }

}
