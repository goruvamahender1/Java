class Triangle{
    public void area(int l, int h){
        System.out.println("Displays area");
    }
}

class Equilateral_Triangle extends Triangle{

}

class Isosceles_Triange extends Triangle{

}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Equilateral_Triangle t1=new Equilateral_Triangle();
        t1.area(10, 20);
    }
    
}
