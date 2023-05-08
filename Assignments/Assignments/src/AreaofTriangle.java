// formula=1/2*b*h
import java.util.Scanner;
public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        double A=0.5*base*height;
        System.out.println(A);
    }
}
