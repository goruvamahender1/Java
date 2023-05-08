//Creating an object


class Pen {
    String type;
    String color;
    public void write(){
        System.out.println("Writing Something");
    }
    
}

public class OOps{
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="Blue";
        pen1.type="Gel";
        pen1.write();

    }

}


