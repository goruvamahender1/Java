// 
import java.util.Scanner;
public class AreaofCircle {

    public static final double pi=3.1415;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextDouble();
        double formula=pi*(radius*radius);
        System.out.println(formula);

    }
    
}
