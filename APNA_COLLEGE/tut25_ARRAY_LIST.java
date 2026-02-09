import java.util.ArrayList;
import java.util.Collections;

public class tut25_ARRAY_LIST {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Add Elements :
        list.add(0);
        list.add(2);
        list.add(4);
        System.out.println(list);

        // Get Element :
        int element = list.get(0);
        System.out.println(element);

        // Add elements in between :
        list.add(1, 1);
        System.out.println(list);

        // Set Element(Update) :
        list.set(0, 5);
        System.out.println(list);

        // Remove(Delete) Elements :
        list.remove(3);
        System.out.println(list);

        // Size of list :
        int size = list.size();
        System.out.println(size);

        // Loops in List :
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        // Sorting in Lists :
        Collections.sort(list);
        System.out.println(list);
    }
}