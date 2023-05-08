//area=(3)**0.5/4 * side square

import java.util.Scanner;
public class AreaOfEquilateral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double side=sc.nextDouble();
        double formula=(Math.sqrt(3)/4)*side*side;
        System.out.println(formula);
    }
}
