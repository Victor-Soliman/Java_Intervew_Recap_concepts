package ArraysAndLinkedList.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // create a linkedList
        LinkedList<String> students = new LinkedList<>();

        // Add students to the linkedList
        students.add("Charlie");
        students.add("Sally");
        students.add("Morgan");
        students.add("Taylor");
        students.add("Jamie");

        students.addFirst("Sarah");
        students.addLast("Hailey");
        students.add(2, "Tara");

        // Retrieve items from a LinkedList by placement
        String firstStudent = students.getFirst();
        System.out.println("First Student: " + firstStudent);

        String lastStudent = students.getLast();
        System.out.println("Last Student: " + lastStudent);

        // Retrieve items from a LinkedList by index
        String secondStudent = students.get(1);
        System.out.println("Second Students: " + secondStudent);

        // Retrieve index of specific item
        int i = students.indexOf("Morgan");
        System.out.println("Index of Morgan: " + i);

        // Access size of a LinkedList
        System.out.println("Size: " + students.size());

        // Remove items by placement , object ,and index
        students.removeFirst();
        students.removeLast();
        students.remove("Jamie");
        students.remove(1);
        System.out.println(students);

        // Search for items in a LinkedList
        boolean hasTaylor = students.contains("Taylor");
        System.out.println("Have Taylor ? " + hasTaylor);

        // Empty the list
        students.clear();
        System.out.println(students);
    }
}
