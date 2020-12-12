package com.finalProject.styleAnalizer.logic;

import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.HashSet;

public class EnglishDictionarySingleton {

    static EnglishDictionarySingleton instance;

    public static EnglishDictionarySingleton getInstance() {
        if (instance != null) {
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
        File file = ResourceUtils.getFile("classpath:dictionary.txt");
        InputStream in = new FileInputStream(file);
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
