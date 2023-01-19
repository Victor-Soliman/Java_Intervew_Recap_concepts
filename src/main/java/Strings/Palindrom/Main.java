package Strings.Palindrom;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String s1 = "maDam";
        String s2 = "raceCar";
        String s3 = "aBba";
        String s4 = "swims";
        String s5 = "wifI";

        palindromeChecker(s1);
        palindromeChecker(s2);
        palindromeChecker(s3);
        palindromeChecker(s4);
        palindromeChecker(s5);
        System.out.println("---");
        System.out.println(palindromeCheckerTraditional(s1));
        System.out.println(palindromeCheckerTraditional(s2));
        System.out.println(palindromeCheckerTraditional(s3));
        System.out.println(palindromeCheckerTraditional(s4));
        System.out.println(palindromeCheckerTraditional(s5));
        System.out.println("---");
        System.out.println(palindromeCheckStreams(s1));
        System.out.println(palindromeCheckStreams(s2));
        System.out.println(palindromeCheckStreams(s3));
        System.out.println(palindromeCheckStreams(s4));
        System.out.println(palindromeCheckStreams(s5));
    }

    private static void palindromeChecker(String s) {
        // this implementation don't take in consideration lower or uper case sensitivity
        String s1 = "";
        String s2 = "";

        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            if (s.charAt(i) == s.charAt(j)) {
                s1 += s.charAt(i);
                s2 += s.charAt(j);
            }
        }
        if (s1.equals(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean palindromeCheckerTraditional(String original) {
        String normalized = original.toLowerCase();
        StringBuilder reversed = new StringBuilder();

//         String reversed = StringUtils.reverse(normalized);
//        String reversed = new StringBuilder(normalized).reverse().toString();

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed.append(normalized.charAt(i));
        }
        return normalized.equals(reversed.toString());
    }

    public static boolean palindromeCheckStreams(String original) {
        String normalized = original.toLowerCase();

        return IntStream.range(0, normalized.length() / 2)
                .allMatch(i -> normalized.charAt(i) == normalized.charAt(normalized.length() - i - 1));
    }


}
