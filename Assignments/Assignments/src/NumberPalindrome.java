//take a number as input
//get the remainder of each 
//555
//rev=rem+rev*10;

import java.util.Scanner;
public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        int rem;
        int rev=0;
        int temp=value;
        while(value>0){
            rem=value%10;
            rev=rem+rev*10;
            value/=10;     
        }
        if(temp==rev){
            System.out.println("Number is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }   
}
