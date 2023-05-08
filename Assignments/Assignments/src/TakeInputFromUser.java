import java.util.Scanner;

public class TakeInputFromUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String userInput=" ";
        boolean isInteger=true;
        int sum=0;
        while(!(userInput.equals("x"))){
            userInput=sc.next();
            for(int i=0;i<userInput.length();i++){
                if(!(Character.isDigit(userInput.charAt(i)))){
                    isInteger=false;;
                }

            }
            if(isInteger){
                sum=sum+Integer.parseInt(userInput);
            }
        }
        System.out.println(sum);
    }
}