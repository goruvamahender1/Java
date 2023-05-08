//Take start and end values from user
//run a loop between this points
//create a method and pass each and check them.


import java.util.Scanner;



public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            boolean check=CheckPrime(i);
            if(check){
                System.out.print(i+" ");
            }
            else{
                System.out.print("");
            }
        }
    } 
    public static boolean CheckPrime(int k){
        int count=0;
        for(int i=1;i<k;i++){
            if(k%i==0){
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
