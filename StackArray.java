package assignments.module11;

class StackArray {
    int[] arr = new int[5];
    int top = -1;

    void push(int x) {
        arr[++top] = x;
    }

    void pop() {
        System.out.println("Popped: " + arr[top--]);
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.pop();
    }
}

