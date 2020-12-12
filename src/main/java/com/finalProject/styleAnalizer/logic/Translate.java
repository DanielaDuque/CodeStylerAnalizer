package com.finalProject.styleAnalizer.logic; /***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
// import ANTLR's runtime libraries
import com.finalProject.styleAnalizer.gen.javaGrammarLexer;
import com.finalProject.styleAnalizer.gen.javaGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Translate {
    public static List<ErrorStyle> analyse(String code) {
        List<ErrorStyle> errors = new ArrayList<>();
        try {

            ByteArrayOutputStream os = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(os);
            System.setOut(ps);

            // crear un analizador léxico que se alimenta a partir de la entrada (archivo  o consola)
            javaGrammarLexer lexer;
            lexer = new javaGrammarLexer(CharStreams.fromString(code));


            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el objeto correspondiente al analizador sintáctico que se alimenta apartir del buffer de tokens
            javaGrammarParser parser = new javaGrammarParser(tokens);
            ParseTree tree = parser.compilationUnit(); // begin parsing at init rule
            ParseTreeWalker walker = new ParseTreeWalker();
            JavaAnalyzer javaAnalyzer = new JavaAnalyzer();
            walker.walk(javaAnalyzer, tree);
            errors.addAll(javaAnalyzer.getErrors());

        } catch (Exception e) {
            errors.add(new ErrorStyle("Error (Test): " + e.getMessage()));
        }
        return errors;
    }
}