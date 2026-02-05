public class tut15_SETBIT {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.err.println(newNumber);
    }
}
