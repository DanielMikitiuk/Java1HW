/*
Пользователь вводит с клавиатуры два числа. Нужно
показать все нечетные числа в указанном диапазоне. Если
границы диапазона указаны неправильно требуется про-
извести нормализацию границ. Например, пользователь
ввел 20 и 11, требуется нормализация, после которой
начало диапазона станет равно 11, а конец 20.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = in.nextInt();

        System.out.println("Enter the second number:");
        int num2 = in.nextInt();

        for(int i = Math.min(num1, num2); i <= Math.max(num1,num2); i++){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }

        }

        in.close();
    }
}