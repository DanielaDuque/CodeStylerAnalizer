package com.finalProject.styleAnalizer.logic;

import java.util.HashMap;
import java.util.Map;

public class PreviuosVerifications {

    private int NumberofClass(String code){
        int cont =0;
        while (code.indexOf("class") > -1) {
            code = code.substring(code.indexOf(
                    "class")+"class".length(),code.length());
            cont++;
        }
        return cont;
    }

    private int NumberofIntertace(String code){
        int cont =0;
        while (code.indexOf("interface ") > -1) {
            code = code.substring(code.indexOf(
                    "interface ")+"interface ".length(),code.length());
            cont++;
        }
        return cont;
    }

    public int NumberofIntClas(String code){
        int cont = NumberofClass(code);
        cont += NumberofIntertace(code);
        return cont;
    }

}
