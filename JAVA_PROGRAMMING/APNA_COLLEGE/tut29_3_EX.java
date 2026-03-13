class listNode{
    int val; 
    listNode next;
    listNode(){}
    listNode(int val){
        this.val = val;
    }
    listNode(int val, listNode next){
        this.val = val;
        this.next = next;
    }    
}

public class tut29_3_EX{
    public listNode removeNthFromEnd(listNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }

        int size = 0;
        listNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }

        if(n == size){
            return head.next;
        }

        int indextToSearch = size - n - 1;
        listNode prev = head;
        int i = 1;;
        while(i < indextToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
} 