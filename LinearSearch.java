package assignments.module7;

public class LinearSearch {
        public static void main(String[] args) {

            int arr[] = {2,4,6,8,10};
            int key = 8;

            for(int i=0;i<arr.length;i++) {
                if(arr[i] == key) {
                    System.out.println("Element found at index " + i);
                    return;
                }
            }

            System.out.println("Element not found");
        }
    }

