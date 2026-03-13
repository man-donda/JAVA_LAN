import java.util.*;

public class tut35_HASHMAP {
    public static void main(String[] args) {
        // country(key) population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insert:
        map.put("India", 120);
        map.put("US", 78);
        map.put("Germany", 89);

        System.out.println(map);

        // Update:
        map.put("Germany", 98);
        System.out.println(map);

        // Search:
        if (map.containsKey("China")) {
            System.err.println("Key is present in the Map");
        } else {
            System.out.println("Key is not present in the Map");
        }

        // Get Values of key:
        System.out.println(map.get("Germany"));
        System.out.println(map.get("China"));

        // Iteration:
        int arr[] = { 2, 6, 7 };
            //Trick 1:
            for(int i=0;i<3; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

            //Trick 2:
            for(int val : arr){
                System.out.print(val+" ");
            }
            System.out.println();

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue());
            System.out.println();
        }

        // Key set:
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        // Size:
        System.out.println("The size of the map is "+map.size());

        // Remove:
        map.remove("Germany");
        System.out.println(map);        
    }
}
