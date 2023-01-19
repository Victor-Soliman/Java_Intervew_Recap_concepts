package Strings.CountingCharactersWithStringManipulation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Find the number of vowels and consonants in a given string
        // the input contains only letters and white spaces
        // vowels : a, e, i, o, u, y

        // solution for 1 input
        String s1 = "HellO";
        String s2 = "there is a quiet Mouse";
        String s3 = "I am happy";

//        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
//        int vowel = 0;
//
//        for (int i = 0; i < s2.trim().length(); i++) {
//            for (int j = 0; j < vowels.length; j++) {
//                if (s2.trim().charAt(i) == vowels[j]) {
//                    vowel++;
//                }
//            }
//        }
//        System.out.println("Vowels : " + vowel + " , Consonants : " + (s2.length() - vowel));

//        findNumberOfVowelsAndConstants(s1);
//        findNumberOfVowelsAndConstants(s2);
//        findNumberOfVowelsAndConstants(s3);
//        System.out.println("---");
//        findNumberOfVowelsAndConsonantsStreams(s1);
//        findNumberOfVowelsAndConsonantsStreams(s2);
//        findNumberOfVowelsAndConsonantsStreams(s3);

    }

    public static void findNumberOfVowelsAndConstants(String input) {
        int vowelsCount = 0;
        int constantCount = 0;
        String vowels = "aeiouy";
        String normalized = input.toLowerCase().trim();
        char[] normalizedArray = normalized.toCharArray();

        for (char c : normalizedArray) {
            if (vowels.indexOf(c) != -1) {
                vowelsCount++;
            } else if (c != ' ') {
                constantCount++;
            }
        }
        System.out.println("There are " + vowelsCount + " vowels in " + input);
        System.out.println("There are " + constantCount + " constants in " + input);
        System.out.println();
    }

    public static void findNumberOfVowelsAndConsonantsStreams(String input) {
        String vowels = "aeiouy";
        String normalized = vowels.toLowerCase().trim();

        List<Integer> letters = normalized.chars()
                .filter(Character::isAlphabetic)
                .boxed().toList();

        long vowelCount = letters.stream()
                .filter(c -> vowels.indexOf(c) != -1)
                .count();

        long consonantCount = letters.stream().count() - vowelCount;

        System.out.println("There are " + vowelCount + " vowel  in " + input);
        System.out.println("There are " + consonantCount + " consonant  in " + input);

    }
}
