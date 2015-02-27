package com.perreira.crystal.anagramsolver;

import com.perreira.crystal.dictionary.Dictionary;
import com.perreira.crystal.dictionary.EnglishDictionary;

import java.util.*;

/**
 * Created by crystal on 2/26/15.
 */
public class AnagramSolver {
    private Dictionary dictionary;
    private Map<String, Set<String>> signatureMap; //Map<K, V>

    public AnagramSolver(Dictionary dictionary) { //constructor
        this.dictionary = dictionary;
        signatureMap = new HashMap<String, Set<String>>();
        for (String text : dictionary.getAllWords()) {
            String wordSignature = signature(text);
            if (!signatureMap.containsKey(wordSignature)) {
                signatureMap.put(wordSignature, new HashSet<String>());
            }
            signatureMap.get(wordSignature).add(text);
        };
    }

    public Set<String> getAnagrams(String s){
        String signature = signature(s);
        if (signatureMap.containsKey(signature)){
            return signatureMap.get(signature);
        }
        return new HashSet<String>();
    }

    private static String signature(String s){
        char[] characters = s.toLowerCase().toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }

    public static void main(String[] args){
        Dictionary dictionary = new EnglishDictionary();
        AnagramSolver solver = new AnagramSolver(dictionary);
        Set<String> myAnagrams = solver.getAnagrams("blah");
        for (String s: myAnagrams){
            System.out.println(s);
        }
    }

}
