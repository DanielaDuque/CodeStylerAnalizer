package com.finalProject.styleAnalizer.logic;

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

    public int NumberOfCommentLine(String code){
        int cont= 0;

        String[] codeArr = code.split("\n");

        boolean iscont = false;

        for (String cod:codeArr){
            int idxMultiLine = cod.indexOf("/*");
            int idxLine = cod.indexOf("//");

            if(idxLine!=-1 && idxMultiLine!=-1) {
                if (idxLine != -1 && idxLine < idxMultiLine && !iscont) {
                    cont++;
                    continue;
                }

                if (idxMultiLine != -1 && idxMultiLine < idxLine) {
                    iscont = true;
                }
            }
            if (idxLine != -1 && !iscont) {
                cont++;
                continue;
            }

            if (idxMultiLine != -1){
                iscont = true;
            }

            if (iscont){
                cont++;
            }
            idxMultiLine = cod.indexOf("*/");

            if(idxMultiLine!=-1){
                iscont = false;
            }
        }
        return cont;
    }

}
