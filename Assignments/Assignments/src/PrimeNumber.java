//Take a int input
//To be a number to prime
//start a loop with i=1 to i<n if n%i==0 increase count
//finally if count is 1 it's a prime


import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userInput=sc.nextInt();
        boolean checkPrime=PrimeCheck(userInput);
        System.out.println(checkPrime);
        
    }
    public static boolean PrimeCheck(int userInput){
        int count=0;
        for(int i=1;i<userInput;i++){
            if(userInput%i==0){
                count+=1;
            }
        }
        if(count==1){
            return true;
        }
        else{
            return false;
        }
    }
}
