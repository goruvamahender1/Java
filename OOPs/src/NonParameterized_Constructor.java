class Student1{

    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student1(){
        System.out.println("Constructor called");
    }

}


public class NonParameterized_Constructor {
    public static void main(String[] args) {
        Student1 stud1=new Student1();
        stud1.name="Amar";
        stud1.age=20;
        stud1.printInfo();
        
    }
}
