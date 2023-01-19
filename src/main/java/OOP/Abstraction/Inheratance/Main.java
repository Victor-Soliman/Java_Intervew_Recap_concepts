package OOP.Abstraction.Inheratance;

import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        NonNegativeList nonNegativeList =
                new NonNegativeList(-10, 2, 3, -2, 0);
        System.out.println(nonNegativeList);

        nonNegativeList.add(-1);
        nonNegativeList.add(9);
        nonNegativeList.addAll(List.of(-11, 12, 4));

        ListIterator<Integer> iterator = nonNegativeList.listIterator();
        iterator.next();
        iterator.set(-19);

        nonNegativeList.replaceAll(n -> n - 1);
        System.out.println(nonNegativeList);
    }
}
