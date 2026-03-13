class Student{
    String name;
    static String school;

    public static void changeSchool(){
        school = "New Schooooool";
    }
}

public class tut24_STATIC {
    public static void main(String[] args) {
        // Student.school = "Schoooooool";
        Student.changeSchool();
        Student s1 = new Student();
        s1.name = "XYZ";
        System.out.println(s1.name);
        System.out.println(s1.school);
    }
}
