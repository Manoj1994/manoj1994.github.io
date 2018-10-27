package lists;

public class RemoveGivenNode {


    public static void removeGivenNode(ListNode node) {

        if(node.next == null) {
            node = null;
        }

        ListNode temp = node.next;
        node.val = node.next.val;
        node.next = temp.next;

    }



    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next  = new ListNode(5);
        head.next.next.next.next.next.next.next.next   = new ListNode(3);
        head.next.next.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next.next.next  = new ListNode(1);
        head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(10);

        ListNode temp = head.next.next.next.next;
        ListNode temp2 = head;
        removeGivenNode(temp);

        while(temp2!=null) {
            System.out.print(temp2.val+" ");
            temp2 = temp2.next;
        }
        System.out.println();
    }
}
