//take int input
//check int input<100
//define a method and return grades 


import java.util.Scanner;
public class Displaygrades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String grade=displayGrades(marks);
        System.out.println(grade);

    }
    public static String displayGrades(int marks){
        if(marks>=91 && marks<=100){
            return "AA";
        }
        else if(marks>=81 && marks<=90){
            return "AB";
        }
        else if(marks>=71 && marks<=80){
            return "BB";
        }
        else if(marks>=61 && marks<=70){
            return "BC";
        }
        else if(marks>=51 && marks<=60){
            return "CD";
        }
        else if(marks>=41 && marks<=50){
            return "DD";
        }
        else{
            return "Fail";
        }
    }
}
