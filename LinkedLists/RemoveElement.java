public class RemoveElement {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
       
        ListNode dummy = new ListNode(0);
        ListNode firListNode = new ListNode(0);
        firListNode.next = head;
        ListNode curr = firListNode;
        while (curr != null) {
            if (curr.val == val) {
                dummy.next = curr.next;
                curr = curr.next;
            } else {
                dummy = curr;
                curr = curr.next;

            }

        }
        return firListNode.next;
    }

    public static void main(String[] args) {
        RemoveElement rn = new RemoveElement();
        ListNode head = rn.new ListNode(1);
        head.next = rn.new ListNode(3);
        head.next.next = rn.new ListNode(3);
        head.next.next.next = rn.new ListNode(4);
        head.next.next.next.next = rn.new ListNode(5);
        head.next.next.next.next.next = rn.new ListNode(5);
        head.next.next.next.next.next.next = rn.new ListNode(6);
        head.next.next.next.next.next.next.next = rn.new ListNode(5);

        ListNode temp = rn.removeElements(head, 1);
        // Print list
        ListNode curr = temp;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.print("Null");
    }
}
