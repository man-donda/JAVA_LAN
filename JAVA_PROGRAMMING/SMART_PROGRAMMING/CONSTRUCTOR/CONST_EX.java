import java.util.*;

class Employee{
    int eId;
    String name;
    Employee(int eId, String name){
        this.eId = eId;
        this.name = name;
    }
}

public class CONST_EX {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"abc");
        Employee e2 = new Employee(102,"pqr");
        System.out.println("Employee 1: "+ e1.eId+" - "+e1.name);
        System.out.println("Employee 2: "+ e2.eId+" - "+e2.name);
    }
}
