/*
Пользователь вводит шестизначное число. Необходимо
поменять в этом числе первую и шестую цифры, а также
вторую и пятую цифры.
Например, 723895 должно превратиться в 593827.
Если пользователь ввел не шестизначное число тре-
буется вывести сообщение об ошибке.
 */
import java.util.Scanner;
public class Main {
    private static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static long swapDigits(int a) {
        char[] array = Integer.toString(a).toCharArray();
        swap(array, 0, 5);
        swap(array, 1, 4);
        return Long.parseLong(String.valueOf(array));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number:");
        int num = in.nextInt();
        if(num>100000 && num < 999999){
            System.out.println(swapDigits(num));
        }else {
            System.out.println("Error");
        }


    }
}