class Pen{
    String color;
    String type;
    public void printColor_Type(){
        System.out.println(this.color);
        System.out.println(this.type);

    }
}

public class OOps1 {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="Gel";
        Pen pen2=new Pen();
        pen2.color="Red";
        pen2.type="Ballpoint pen";
        pen1.printColor_Type();
        pen2.printColor_Type();
        
    }
    
}
