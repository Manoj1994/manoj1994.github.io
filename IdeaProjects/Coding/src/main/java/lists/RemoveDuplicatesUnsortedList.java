package lists;

import java.util.*;

public class RemoveDuplicatesUnsortedList {

    public static ListNode RemoveDuplicatesBruteForce(ListNode head) {

        if(head == null) {
            return null;
        }

        ListNode dummy = head;

        ListNode ptr1 = dummy, ptr2= null;
        while(ptr1!=null && ptr1.next!=null) {
            ptr2 = ptr1;
            while(ptr2.next!=null) {
                if(ptr1.val == ptr2.next.val) {
                    ptr2.next = ptr2.next.next;
                } else {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }

        return dummy;
    }

    public static ListNode merge(ListNode node1, ListNode node2) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(node1!=null && node2!=null) {
            if(node1.val > node2.val) {
                temp.next = node2;
                node2 = node2.next;
            } else {
                temp.next = node1;
                node1 = node1.next;
            }
            temp = temp.next;
        }

        while(node1!=null) {
            temp.next = node1;
            node1 = node1.next;
        }

        while(node2!=null) {
            temp.next = node2;
            node2 = node2.next;
        }
        return dummy.next;
    }

    public static ListNode getMiddle(ListNode node) {
        ListNode ptr1 = node, ptr2 = node;
        while(ptr1!=null && ptr1.next!=null) {
            ptr1 = ptr1.next.next;
            ptr2 = ptr2.next;
        }
        return ptr2;
    }

    public static ListNode mergeSort(ListNode node) {
        if(node == null || node.next == null) {
            return node;
        }

        ListNode middle = getMiddle(node);
        ListNode middleNext = middle.next;
        middle.next = null;
        ListNode sort1 = mergeSort(node);
        ListNode sort2 = mergeSort(middleNext);
        return merge(sort1, sort2);

    }

    public static ListNode RemoveDuplicatesWithSort(ListNode head) {

        ListNode sortHead = mergeSort(head);
        return sortHead;

    }


    public static ListNode RemoveDuplicatesWithBuffer(ListNode head) {

        HashSet<Integer> set = new HashSet<>();
        ListNode ptr1 = head;
        ListNode prev = null;

        while(ptr1!=null) {
            if(set.contains(ptr1.val)) {
                prev.next = ptr1.next;
            } else {
                set.add(ptr1.val);
                prev = ptr1;
            }
            ptr1 = ptr1.next;
        }
        return head;
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

        ListNode temp2 = head;
        while(temp2!=null) {
            System.out.print(temp2.val+" ");
            temp2 = temp2.next;
        }
        System.out.println();

        ListNode temp = RemoveDuplicatesWithBuffer(head);


        while(temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
