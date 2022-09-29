import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
class ArraySort {
    public static Integer[] sortArray(Integer[] arr){
        Scanner in = new Scanner(System.in);
        System.out.print("\n1-sort \n2-backSort \nInput:");
        int choice = in.nextInt();

        switch (choice){
            case 1: Arrays.sort(arr); break;
            case 2: Arrays.sort(arr, Collections.reverseOrder()); break;
            default: System.out.println("Error"); break;
        }
        in.close();
        return arr;
    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[30];

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 100) - 50);
            System.out.print(arr[i]+" ");
        }

        arr=sortArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}