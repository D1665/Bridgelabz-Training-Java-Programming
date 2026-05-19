package DataStructureandAlgorithm.Data_Structure.String;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "the quick brown fox jumps over the lazy dog the fox";
        String[] words = text.split("\s+");

        HashMap<String, Integer> freq = new HashMap<>();
        for (String word : words)
            freq.put(word, freq.getOrDefault(word, 0) + 1);

        System.out.println("Word Frequencies:");
        freq.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}