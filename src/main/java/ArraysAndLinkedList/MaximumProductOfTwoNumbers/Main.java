package ArraysAndLinkedList.MaximumProductOfTwoNumbers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Find a maximum product of two numbers in an unsorted array
        int[] array = new int[]{5, 3, 2, 5, 7, 0, 1};
        int[] arr = new int[]{-2, -1, -3, 4, 8, 0};

        findMaxProduct(array);
        findMaxProduct(arr);
        System.out.println("---");
        System.out.println(maximumProduct2(array));
        System.out.println(maximumProduct2(arr));
        System.out.println("---");

    }

    private static void findMaxProduct(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        int ind = 0;
        int length = array.length;

        if (length < 2) {
            System.out.println("No maximum exists, returning sentinel value");
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] * array[j] > max) {
                    max = array[i] * array[j];
                    index = array[i];
                    ind = array[j];
                }
            }
        }
        System.out.println(max);
        System.out.println("The first index is at position " + index);
        System.out.println("The second index is at position " + ind);
    }

    private static int maximumProduct2(int[] arr) {
        int length = arr.length;

        if (length < 2) {
            System.out.println("No maximum exists, returning sentinel value");
        }

        Arrays.sort(arr);

        int maxProduct = arr[length - 2] * arr[length - 1];
        int minProduct = arr[0] * arr[1];

        if (maxProduct > minProduct) {
            return maxProduct;
        } else {
            return minProduct;
        }
    }


}
