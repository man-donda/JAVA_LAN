import java.util.*;

public class PROJECT_5_STUDENTS_MARKS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, tm, per;

        System.out.print("Enter English subject's Marks: ");
        m1 = sc.nextInt();

        System.out.print("Enter Maths subject's Marks: ");
        m2 = sc.nextInt();

        System.out.print("Enter Science subject's Marks: ");
        m3 = sc.nextInt();

        tm = m1 + m2 + m3;
        System.out.println("Your total marks is " + tm);

        per = (m1 + m2 + m3) / 3;
        System.out.println("You got " + per + " percentage");

        if (m1 < 33 && m2 < 33 && m3 < 33) {
            System.out.println("You are failed in all subjects.");
        } else if ((m1 < 33 && m2 < 33) || (m2 < 33 && m3 < 33) || (m3 < 33 && m1 < 33)) {
            System.out.println("You are failed in two subjects.");
        } else if (m1 < 33 || m2 < 33 || m3 < 33) {
            System.out.println("You are failed in a particular subject.");
        } else if (per < 40) {
            System.out.println("You are failed due to low percentage.");
        } else if (per >= 90 && per <= 100) {
            System.out.println("Your grade is A");
        } else if (per >= 80) {
            System.out.println("Your grade is B");
        } else if (per >= 70) {
            System.out.println("Your grade is C");
        } else if (per >= 60) {
            System.out.println("Your grade is D");
        } else if (per >= 50) {
            System.out.println("Your grade is E");
        } else {
            System.out.println("Your grade is F");
        }
    }
}