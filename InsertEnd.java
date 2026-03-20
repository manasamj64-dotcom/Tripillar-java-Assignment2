package assignments.module10;


    public class InsertEnd {
        Node head;

        void insertEnd(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = newNode;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            InsertEnd list = new InsertEnd();

            list.insertEnd(10);
            list.insertEnd(20);
            list.insertEnd(30);

            list.display();
        }
    }

