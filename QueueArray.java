package assignments.module11;

public class QueueArray {
        int[] arr = new int[5];
        int front = 0, rear = -1;

        void enqueue(int x) {
            arr[++rear] = x;
        }

        void dequeue() {
            System.out.println("Removed: " + arr[front++]);
        }

        public static void main(String[] args) {
            QueueArray q = new QueueArray();
            q.enqueue(10);
            q.enqueue(20);
            q.dequeue();
        }
    }

