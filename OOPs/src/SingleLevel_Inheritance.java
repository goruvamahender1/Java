class Shape{
    String color;
    public void area(){
        System.out.println();
    }
}

class Triangle extends Shape{
    public void area(int l,int b){
        System.out.println(l*b);
    }
}

public class SingleLevel_Inheritance {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.color="Red";
        t1.area(78,9);
    }
    
}
