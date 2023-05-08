///know the discount value;
//get the price;

import java.util.Scanner;
public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float price=sc.nextFloat();
        float discount=sc.nextFloat();
        float DiscountedPrice=price-(price*(discount/100));
        System.out.println(DiscountedPrice);
    }   
}
