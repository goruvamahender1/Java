class Student{
    int age;
    String name;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

public class OOps2 {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="Mahender";
        student1.age=24;
        student1.printInfo();
    }
    
}
