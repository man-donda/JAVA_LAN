class listNode {
    int val;
    listNode next;

    listNode() {
    }

    listNode(int val) {
        this.val = val;
    }

    listNode(int val, listNode next) {
        this.val = val;
        this.next = next;
    }
}

public class tut29_1_EX {
    public listNode reverse(listNode head) {
        listNode prev = null;
        listNode curr = head;

        while (curr != null) {
            listNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public listNode findMiddle(listNode head) {
        listNode hare = head;
        listNode turtle = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean isPalidrome(listNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        listNode middle = findMiddle(head);
        listNode secHalfStart = reverse(middle.next);

        listNode firstHalfStart = head;
        while (secHalfStart != null) {
            if (firstHalfStart.val != secHalfStart.val) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secHalfStart = secHalfStart.next;
        }
        return true;
    }
}
