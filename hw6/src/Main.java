/*
Пользователь вводит с клавиатуры количество ме-
тров. В 3ависимости от выбора пользователя программа
переводит метры в мили, дюймы или ярды.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of meters:");
        double met = in.nextDouble();

        System.out.println("1-Inch\n2-Yard\n3-Mile\n\nEnter the num:");
        int num = in.nextInt();

        switch (num){
            case 1:
                System.out.println(met+" meters in inches = "+(met*39.3701));
                break;
            case 2:
                System.out.println(met+" meters in yards = "+(met*1.09361));
                break;
            case 3:
                System.out.println(met+" meters in miles = "+(met*0.000621371));
                break;
            default:
                System.out.println(met+" meters in inches = "+(met*39.3701));
                System.out.println(met+" meters in yards = "+(met*1.09361));
                System.out.println(met+" meters in miles = "+(met*0.000621371));
                break;
        }
        in.close();
    }
}