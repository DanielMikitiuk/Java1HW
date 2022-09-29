/*
Есть одномерный массив, заполненный случайными
числами. На основании данных этого массива нужно:
■ Создать одномерный массив, содержащий только
четные числа из первого массива;
■ Создать одномерный массив, содержащий только
нечетные числа из первого массива;
■ Создать одномерный массив, содержащий только
отрицательные числа из первого массива;
■ Создать одномерный массив, содержащий только
положительные числа из первого массива.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    private static Integer[] append(Integer[] arr, int element)
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);

        return list.toArray(new Integer[0]);
    }


    public static void main(String[] args) {
        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100) - 50);
            System.out.print(array[i]+" ");
        }

        Integer[] even_numbers      = {};   //чётные
        Integer[] odd_numbers       = {};   //нечётные
        Integer[] negative_numbers  = {};   //негативные
        Integer[] positive_numbers  = {};   //позитивные

        for (int num : array) {
            if (num % 2 == 0) { //even
                even_numbers = append(even_numbers, num);
            }else{
                odd_numbers = append(odd_numbers,num);
            }

            if(num > 0){
                positive_numbers = append(positive_numbers,num);
            }else{
                negative_numbers = append(negative_numbers,num);
            }


        }
        System.out.println("\n\nEven: "+Arrays.toString(even_numbers));
        System.out.println("Odd: "+Arrays.toString(odd_numbers));
        System.out.println("Positive: "+Arrays.toString(positive_numbers));
        System.out.println("Negative: "+Arrays.toString(negative_numbers));

    }
}