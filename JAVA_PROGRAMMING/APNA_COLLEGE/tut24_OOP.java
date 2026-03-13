class Student{
    String name;
    int age;

    public void printData(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printData(String name){
       System.out.println(name);
   }
    public void printData(int age){
        System.out.println(age);
    }


     public void printData(String name, int age){
        System.out.println(name +" " +age);
    }
}

public class tut24_OOP {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "abc";
        s1.age = 21;

        // s1.printData();
        s1.printData(s1.age);
        s1.printData(s1.name);
        s1.printData(s1.name, s1.age);
    }
}

