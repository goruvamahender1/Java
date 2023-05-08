import java.util.Scanner;
public class TakeInputFromtheUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String userInput=" ";
        boolean userValue=true;
        int sum=0;

        while(!(userInput.equals("x"))){
            userInput=sc.nextLine();
            for(int i=0;i<userInput.length();i++){
                if(Character.isDigit(userInput.charAt(i))){
                    userValue=false;
                    break;
                }
            }
            if(userValue){
                sum=sum+Integer.parseInt(userInput);
            }

        }
        

    }
}
