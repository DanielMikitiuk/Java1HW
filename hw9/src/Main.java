/*
В одномерном массиве, заполненном случайными
числами, определить минимальный и максимальный
элементы, посчитать количество отрицательных эле-
ментов, посчитать количество положительных элемен-
тов, посчитать количество нулей. Результаты вывести
на экран.
 */

public class Main {
    public static void main(String[] args) {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100) - 50);
            System.out.print(array[i]+" ");
        }

        int min = array[0];
        int max = array[0];
        int negative = 0;
        int positive = 0;
        int zero = 0;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if(num > max){
                max = num;
            }

            if(num>0){
                positive++;
            }else if(num<0){
                negative++;
            }else {
                zero++;
            }
        }
        System.out.println("\nMin:"+min);
        System.out.println("Max:"+max);
        System.out.println("Positive:"+positive);
        System.out.println("Negative:"+negative);
        System.out.println("Zero:"+zero);
    }
}