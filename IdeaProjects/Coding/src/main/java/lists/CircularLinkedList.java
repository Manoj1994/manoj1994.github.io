package lists;

import java.util.HashSet;

public class CircularLinkedList {

    public static boolean isCircular(ListNode head) {

        ListNode ptr1 = head, ptr2 =head;
        while(ptr1!=null && ptr2!=null && ptr2.next != null) {
            if(ptr1 == ptr2) {
                return true;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        return false;
    }

    public static ListNode isCircularAndGetStartPointOfaLoop(ListNode head) {

        ListNode ptr1 = head, ptr2 =head;
        while(ptr1!=null && ptr2!=null && ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if(ptr1 == ptr2) {
                break;
            }
        }

        if(ptr1 == ptr2) {
            ptr1 = head;
            while(ptr1.next != ptr2.next) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
        }
        return ptr2;
    }

    public static ListNode getLoopStartWithHash(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode temp = head;

        while(temp != null) {
            if(set.contains(temp)) {
                return temp;
            } else {
                set.add(temp);
            }
            temp = temp.next;
        }
        return null;
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
        head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(10);


        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next = head.next.next.next.next.next;
        System.out.println(isCircular(head));
        System.out.println(isCircularAndGetStartPointOfaLoop(head).val);
        System.out.println(getLoopStartWithHash(head).val);
    }
}
