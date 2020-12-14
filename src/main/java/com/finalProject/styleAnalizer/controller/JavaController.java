package com.finalProject.styleAnalizer.controller;

import com.finalProject.styleAnalizer.logic.ErrorStyle;
import com.finalProject.styleAnalizer.logic.PreviuosVerifications;
import com.finalProject.styleAnalizer.logic.Translate;
import com.finalProject.styleAnalizer.pojo.RequestPOJO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/java")
@CrossOrigin(origins = "*")
public class JavaController {

    @PostMapping("/code-analysis")
    public ResponseEntity postBody(@RequestBody RequestPOJO pojo) {
        String code = pojo.getText();
        //System.out.println(pojo);

        PreviuosVerifications pv = new PreviuosVerifications();

        List<ErrorStyle> errors = new ArrayList();

        int numLinesComment = pv.NumberOfCommentLine(code);

        if (numLinesComment > pojo.getMaxCommentedLinesCount()) {
            ErrorStyle errorClass = new ErrorStyle("There are " + numLinesComment + " commented lines and the maximum accepted is " + pojo.getMaxCommentedLinesCount());
            errors.add(errorClass);
        }
        if (numLinesComment < pojo.getMinCommentedLinesCount()) {
            ErrorStyle errorClass = new ErrorStyle("There are " + numLinesComment + " commented lines of " + pojo.getMinCommentedLinesCount() + " required");
            errors.add(errorClass);
        }

        errors.addAll(Translate.analyse(pojo));

        return new ResponseEntity(errors, HttpStatus.ACCEPTED);
    }

}
