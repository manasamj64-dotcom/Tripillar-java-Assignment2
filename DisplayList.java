package assignments.module10;


    public class DisplayList {
        Node head;

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            DisplayList list = new DisplayList();

            list.head = new Node(10);
            list.head.next = new Node(20);
            list.head.next.next = new Node(30);

            list.display();
        }
    }

