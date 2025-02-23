
//  * Definition for singly-linked list.


public class HasCycle {

    class ListNode {
        int val;
        ListNode next;
    
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null && fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }

            slow = slow.next;
            fast = fast.next.next;

        }

        return false;
    }


    public static void main(String[] args) {
        HasCycle hc = new HasCycle();
        ListNode head = hc.new ListNode(3);
        head.next = hc.new ListNode(2);
        head.next.next = hc.new ListNode(0);
        head.next.next.next = hc.new ListNode(-4);
        head.next.next.next.next = head.next;

        System.out.println(hc.hasCycle(head));
    }
}