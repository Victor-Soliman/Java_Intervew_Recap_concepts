package HashMaps.FindMostRepetedWord;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
         // time complexity O(n)
        String s1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                " when an unknown printer took a galley of type and scrambled it to make a type specimen book." +
                " It has survived not only five centuries, but also the leap into electronic typesetting," +
                " remaining essentially unchanged. It was popularised in the 1960s with the release of " +
                "Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing" +
                " software like Aldus PageMaker including versions of Lorem Ipsum.";
        findMostRepeatedWord(s1);
        System.out.println();
        String s2 = "Penguins are specialized marine birds adapted to living at sea." +
                " Some species spend as much as 75% of their lives in the sea – only coming ashore" +
                " for breeding and molting. Penguin wings are paddle-like flippers used for swimming, not flying.";
        findMostRepeatedWord(s2);
        String s3 = "Oakland University works hard to meet the unique needs of every student. " +
                "If you are facing financial hardship due to an unforeseen or emergency situation, " +
                "we encourage you to apply for financial assistance from the Student Emergency Relief Fund." +
                " OU's Dean of Students office will review all requests but may not be able to cover all expenses." +
                " Our goal is to provide flexible financial assistance to help students achieve their educational goals. ";
        findMostRepeatedWord(s3);

    }

    public static String findMostRepeatedWord(String str) {

        List<String> uncommonWords = convertToUncommonWords(str);

        if (uncommonWords.size() == 0) {
            System.out.println("No unique word in input");
            return "";
        }

        Map<String, Integer> map = new HashMap<>();
        for (String word : uncommonWords) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        int max = 0;
        String mostRepeated = "";
        for (String key : map.keySet()) {
            int currentValue = map.get(key);
            if (currentValue > max) {
                mostRepeated = key;
                max = currentValue;
            }
        }

        System.out.println("Most repeated word : " + mostRepeated + "\nRepeated: " + max + " times.");
        return mostRepeated;
    }

    private static List<String> convertToUncommonWords(String input) {

        String lowerCased = input.toLowerCase().trim();
        String[] words = lowerCased.split("[ \\n\\t\\r.,;:!?(){}]");

        List<String> commonWords = List.of("the", "a", "or", "an", "it", "and", "but", "is", "are", "of", "on", "to",
                "was", "were", "in", "that", "i", "your", "his", "their", "her", "you", "me", "they", "at", "be");

        return Arrays.stream(words)
                .filter(word -> !commonWords.contains(word) && word.length() != 0)
                .collect(Collectors.toList());
    }
}
