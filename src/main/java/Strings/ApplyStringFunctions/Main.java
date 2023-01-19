package Strings.ApplyStringFunctions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "The giant panda has an insatiable appetite for bamboo. ";

        String[] sentences = text.split("\\. ");

        System.out.println("The text has " + sentences.length + " sentences");

        String[] words = text.split(" |-");
        System.out.println("The text has " + words.length + " words.");

        System.out.println(Arrays.asList(words));

        System.out.println("The text has " + text.length() + " characters.");
    }
}
