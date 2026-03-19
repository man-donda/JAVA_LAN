import java.util.*;

// ----------- THEORY -----------
// The static key word in Java is used for memory management primarily.
// Ic can be applied to variables, methods, blocks and nested classes.
// The main concept behind static is that it belongs to the class rather than instance of the class.
// Static method can not use non static data member or call non-static method directly.
// this and super cannot be used in static context. 

public class Student{

    public static int count = 0;

    public Student(){
        count++;
    } 

    static{
        System.out.println("Hello");
    }

    public static void getCount(){
        System.out.println("Total Students: " + count);
    }

    private int id;
    private String name;
    private int age;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student.getCount();
        System.out.println("The sum is: "+sum(1,2));

    }
}