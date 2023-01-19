package Queue.GeneratingBinaryNumbers;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        int n1 = 7;
//        generateBinaryNumbers(7);
//        int n2 = 10;
//        generateBinaryNumbers(10);

        // second function
//        printBinary(6);
//        printBinary(-9);
//        printBinary(0);
//        printBinary(2);
//        printBinary(10);

        // third solution
        printBinaryUsingQueue(6);
        printBinaryUsingQueue(-9);
        printBinaryUsingQueue(0);
        printBinaryUsingQueue(2);
        printBinaryUsingQueue(10);


    }

    public static void generateBinaryNumbers(int n) {
        if (n == 0) {
            return;
        }

        // creating a Queue of type String
        Queue<String> que = new LinkedList<>();
        // adding the root element to the queue which is the first binary number
        que.add("1");
        // initialize total as 0

        int total = 0;

        while (total < n) {
            String current = que.poll();
            // appending 0 and 1 in the left and right child respectively
            que.add(current + "0");
            que.add(current + "1");

            // increment the variable total by 1
            total++;
        }
        System.out.println(que);
    }

    public static void printBinary(int n) {
        if (n <= 0) {
            System.out.println("Nothing to print \n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
        System.out.println();
    }

    public static void printBinaryUsingQueue(int n) {
        if (n <= 0) {
            System.out.println("Nothing to print");
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        for (int i = 1; i <= n; i++) {
            // we store the first item
            Integer current = queue.remove();
            System.out.println(current);
            // in order to show the 0 next to the first item
            queue.add(current * 10);
            // in order to show the 1 next to the item
            queue.add(current * 10 + 1);
        }
        System.out.println();
    }
}
