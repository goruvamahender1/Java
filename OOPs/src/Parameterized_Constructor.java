class Student2{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student2(String name, int age){
        this.name=name;
        this.age=age;
    }
    Student2(Student2 s3 ){
        this.name=s3.name;
        this.age=s3.age;

    }

}
public class Parameterized_Constructor {
    public static void main(String[] args) {
        Student2 s1=new Student2("Mahender",29);
        s1.printInfo();   

        Student2 s2=new Student2(s1);
        s2.printInfo();


    }
}
