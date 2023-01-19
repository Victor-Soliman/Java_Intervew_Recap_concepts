package Strings;

public class Main {
    public static void main(String[] args) {
        // Strings are immutable
        String firstName = "Nasr";
        String lastName = "Victor";

        // first way
        String name = firstName + " " + lastName;
        System.out.println(name);
        // second way
        String concatName = (firstName.concat(" ").concat(lastName));
        // third way
        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("def");
        stringBuilder.append("ghi");
        stringBuilder.insert(0,"xyz");
        stringBuilder.delete(3,6);
        String alpha = stringBuilder.toString();
        System.out.println(alpha);
        // 4th way : thread safe
        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append("def");
        stringBuffer.append("ghi");
        stringBuffer.insert(0,"xyz");
        stringBuffer.delete(3,6);
        String beta = stringBuffer.toString();
        System.out.println(beta);

    }
}
