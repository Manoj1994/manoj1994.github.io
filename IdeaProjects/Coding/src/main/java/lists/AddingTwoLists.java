package lists;

public class AddingTwoLists {

    public static ListNode add(ListNode list1, ListNode list2) {

        if(list1 == null) {
            return list2;
        }

        if(list2 == null) {
            return list1;
        }

        int carry = 0;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int sum = 0;

        while(list1!=null && list2!=null) {

            System.out.println("manoj");

            sum = carry + list1.val + list2.val;
            temp.next = new ListNode(sum%10);
            carry = sum/10;
            temp = temp.next;
            list1 = list1.next;list2 = list2.next;
        }

        while(list1!=null) {

            System.out.println("manish");
            sum = carry + list1.val;
            temp.next = new ListNode(sum%10);
            carry = sum/10;
            temp = temp.next;
            list1 = list1.next;
        }

        while(list2!=null) {

            System.out.println("bablu");
            sum = carry + list2.val;
            temp.next = new ListNode(sum%10);
            carry = sum/10;
            temp = temp.next;
            list2 = list2.next;
        }

        if(carry > 0) {
            temp.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(3);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(8);
        list1.next.next.next = new ListNode(5);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(9);
        list2.next.next = new ListNode(2);

        ListNode output = add(list1, list2);

        while(output!=null) {
            System.out.print(output.val+" ");
            output = output.next;
        }
        System.out.println();


    }
}
