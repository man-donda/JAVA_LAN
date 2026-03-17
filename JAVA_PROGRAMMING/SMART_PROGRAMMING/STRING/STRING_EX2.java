import java.util.*;

public class STRING_EX2 {
    public static void main(String[] args) throws InterruptedException {
        long totalStringTime = 0, totalSBTime = 0, totalSBFTime = 0;
        long startTime, endTime;
        
        for (int j = 0; j < 10; j++) {
            // String test
            startTime = System.nanoTime();
            String str = "Java";
            for (int i = 0; i < 100000; i++) {
                str += "Programming";
            }
            endTime = System.nanoTime();
            totalStringTime += (endTime - startTime);
        }

        // StringBuilder test
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("Java");
        for (int i = 0; i < 100000; i++) {
            sb.append(" Programming");
        }
        endTime = System.nanoTime();
        totalSBTime += (endTime - startTime);

        // StringBuffer test
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer("Java");
        for (int i = 0; i < 100000; i++) {
            sbf.append(" Programming");
        }
        endTime = System.nanoTime();
        totalSBFTime += (endTime - startTime);

        System.out.println("Avg String Time: " + (totalStringTime / 10) + "ns");
        System.out.println("Avg StringBuilder Time: " + (totalSBTime / 10) + "ns");
        System.out.println("Avg StringBuffer Time: " + (totalSBFTime / 10) + "ns");
    }
}