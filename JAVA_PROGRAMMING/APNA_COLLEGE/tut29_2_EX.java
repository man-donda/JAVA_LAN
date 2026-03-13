class listNode {
    int val;
    listNode next;
    listNode(int x) {
        val = x;
        next = null;
    }
}

public class tut29_2_EX {
    public boolean hasCycle(listNode head){
        if(head == null){
            return false;
        }

        listNode hare = head; // Fast
        listNode turtle = head; // Slow

        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle){
                return true;
            }
        }
        return false;
    }
}
