///take input
//define a method for a factorial returning int value
//run a loop for 1 to n 

import java.util.Scanner;
public class FunctionFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userInput=sc.nextInt();
        int value=Factorial(userInput);
        System.out.println(value);

    }
    public static int Factorial(int userInput){
        int fact=1;
        for(int i=1;i<=userInput;i++){
            fact=fact*i;
        }
        return fact;

    }
}
