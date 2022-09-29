/*
Показать на экран таблицу умножения в диапазоне,
указанном пользователем.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Number 1:");
        int num1 = in.nextInt();

        System.out.println("Number 2:");
        int num2 = in.nextInt();

        for (int i = Math.min(num1,num2); i <= Math.max(num1,num2); i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                System.out.print(i+"*"+j+" = "+i * j+"  ");
            }
            System.out.println();
        }
        in.close();
    }
}