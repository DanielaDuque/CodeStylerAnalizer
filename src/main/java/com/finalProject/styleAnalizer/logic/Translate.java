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
import com.finalProject.styleAnalizer.pojo.RequestPOJO;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Translate {
    public static List<ErrorStyle> analyse(RequestPOJO pojo) {
        List<ErrorStyle> errors = new ArrayList<>();
        try {

            ByteArrayOutputStream os = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(os);
            System.setOut(ps);

            javaGrammarLexer lexer;
            lexer = new javaGrammarLexer(CharStreams.fromString(pojo.getText()));

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            javaGrammarParser parser = new javaGrammarParser(tokens);
            ParseTree tree = parser.compilationUnit();
            ParseTreeWalker walker = new ParseTreeWalker();
            JavaAnalyzer javaAnalyzer = new JavaAnalyzer(pojo);
            walker.walk(javaAnalyzer, tree);
            javaAnalyzer.terminateAnalysis();
            errors.addAll(javaAnalyzer.getErrors());

        } catch (Exception e) {
            errors.add(new ErrorStyle("Error (Test): " + e.toString()));
        }
        return errors;
    }
}