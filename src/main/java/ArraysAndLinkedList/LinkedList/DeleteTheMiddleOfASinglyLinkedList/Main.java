package ArraysAndLinkedList.LinkedList.DeleteTheMiddleOfASinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        // first solution
//        LinkedList<String> students = new LinkedList<>();
//
//        students.add("Charlie");
//        students.add("Sally");
//        students.add("Morgan");
//        students.add("Taylor");
//        students.add("Jamie");
//        students.add("Sam");
//        System.out.println(students);
//        if (students.size() % 2 == 1) {
//            students.remove((int) Math.ceil(students.size() / 2));
//        }
//        if (students.size() % 2 == 0) {
//            students.remove(students.size() / 2 -1 );
//
//        }
//        System.out.println(students);

        Node<Integer> head = buildNode(8);
        Node<Integer> nodeA = buildNode(3);
        Node<Integer> nodeB = buildNode(18);
        Node<Integer> nodeC = buildNode(12);
        Node<Integer> nodeD = buildNode(1);

        head.setNext(nodeA);
        head.setNext(nodeB);
        head.setNext(nodeC);
        head.setNext(nodeD);

        printLinkedList(head);
        deleteMiddle(head);
        printLinkedList(head);

    }

    public static Node<Integer> buildNode(int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(null);
        return node;
    }

    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.getData() + ", ");
            head = head.getNext();
        }
        System.out.println("END");
    }

    public static Node deleteMiddle(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        Node previous = null;

        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            previous = slow;
            slow = slow.getNext();
        }

        // Delete middle node
        previous.setNext(slow.getNext());
        return head;

    }
}
