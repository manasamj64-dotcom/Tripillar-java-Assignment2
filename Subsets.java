package assignments.module9;
import java.util.*;

public class Subsets {

        static void subset(int arr[], int index, List<Integer> list) {

            if(index == arr.length) {
                System.out.println(list);
                return;
            }

            subset(arr,index+1,list);

            list.add(arr[index]);
            subset(arr,index+1,list);

            list.remove(list.size()-1);
        }

        public static void main(String[] args) {

            int arr[] = {1,2,3};
            subset(arr,0,new ArrayList<>());
        }
    }

