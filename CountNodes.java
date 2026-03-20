package assignments.module10;


public class CountNodes {
    Node head;

    int count() {
        int c = 0;
        Node temp = head;

        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public static void main(String[] args) {
        CountNodes list = new CountNodes();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        System.out.println("Count: " + list.count());
    }
}
