class Shape{
    String color;
    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}

class Equilateral_Triangle extends Triangle{

    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
    
}


public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        Equilateral_Triangle eq1=new Equilateral_Triangle();
        eq1.area(10, 20);

    }
    
}
