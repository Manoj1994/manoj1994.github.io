package lists;

public class NthElementFromLast {

    public static ListNode nthElement(ListNode head, int k) {
        ListNode ptr1 = head;
        while(k > 0) {
            ptr1 = ptr1.next;
            k--;
        }
        ListNode ptr2 = head;
        while(ptr1!=null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr2;
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

        ListNode temp = nthElement(head, 1);

        System.out.println(temp.val);
    }
}
