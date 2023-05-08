import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float rupees=sc.nextFloat();
        double USD=rupees/(81.95);
        System.out.println(USD);
    }
}
