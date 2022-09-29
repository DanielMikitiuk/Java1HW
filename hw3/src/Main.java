/*
Пользователь вводит с клавиатуры три цифры. Необ-
ходимо создать число, содержащее эти цифры. Например,
если с клавиатуры введено 7, 3, 8, тогда нужно сформи-
ровать число 738.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Number 1:");
        int a = in.nextInt();

        System.out.println("Number 2:");
        int b = in.nextInt();

        System.out.println("Number 3:");
        int c = in.nextInt();

        int x=(a*100+b*10+c);
        System.out.println("Result: "+x);

        in.close();
    }
}