package com.finalProject.styleAnalizer.logic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.HashSet;

public class EnglishDictionarySingleton {

    static EnglishDictionarySingleton instance;

    public static EnglishDictionarySingleton getInstance() {
        if (instance != null && instance.getWords() != null ) {
            return instance;
        }
        try{
            instance = new EnglishDictionarySingleton();
            return instance;
        }catch (IOException e){
            return null;
        }
    }

    final private HashSet<String> words = new HashSet();

    private EnglishDictionarySingleton() throws IOException {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext();
        Resource resource =
                appContext.getResource("https://firebasestorage.googleapis.com/v0/b/code-style-analyzer.appspot.com/o/dictionary.txt?alt=media&token=f162ee13-87da-4877-b77e-5539a8e744d3");
        //File file = ResourceUtils.getFile("classpath:dictionary.txt");
        InputStream in = resource.getInputStream();
        BufferedReader input = new BufferedReader(new InputStreamReader(in));
        String word = input.readLine();
        while (word != null) {
            words.add(word.trim());
            word = input.readLine();
        }
    }

    public HashSet<String> getWords() {
        return words;
    }

    boolean checkIfExists(String word) {
        return words.contains(word.toLowerCase().trim());
    }
}
