package Strings.StringEquality;

public class Main {
    public static void main(String[] args) {
        String literalA = "abc";
        String literalB = "abc";
        String literalC = "c";

        String objectA = new String("abc");
        String objectB = new String("abc");
        String objectC = new String("c");

        System.out.println(literalA == objectA);
        System.out.println(literalA == objectB);
        System.out.println(literalA == literalA);
        System.out.println("---");
        System.out.println(literalA.equals(objectA));
        System.out.println(literalA.equals(objectB));
        System.out.println(literalA.equals(literalA));
        System.out.println("---");
        System.out.println(literalA.equals(literalC));
        System.out.println(literalA.equals(objectC));
    }
}
