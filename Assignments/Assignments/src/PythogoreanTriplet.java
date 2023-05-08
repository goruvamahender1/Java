//take two int inputs
//sum them and square it and check if it is equal to the square of third number

import java.util.Scanner;
public class PythogoreanTriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();
        boolean afterCheck=PythogoreanTriplet(first,second,third);
        System.out.println(afterCheck);

    }
    public static boolean PythogoreanTriplet(int first,int second,int third){
        int value=2;
        int sum=(first*first)+(second*second);
        int calculate2=third*third;
        return sum==calculate2;
    }
}
