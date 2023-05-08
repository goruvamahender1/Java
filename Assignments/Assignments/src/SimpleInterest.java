import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float principal=sc.nextFloat();
        float time=sc.nextFloat();
        float rateOfInterest=sc.nextFloat();
        float SI=(principal * time * rateOfInterest)/100;
        System.out.println(SI);

    }
}
