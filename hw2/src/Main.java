import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Number:");
        double num = in.nextDouble();

        System.out.println("Percent:");
        double perc = in.nextDouble();

        double result = (num / 100) * perc;

        System.out.println("Result: "+result);
        in.close();
    }
}