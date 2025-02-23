import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RemoveNodesFromArray {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode modifiedList(List<Integer> v, ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        Set<Integer> s = new HashSet<>(v);
        
        while (head != null) {
            if (!s.contains(head.val)) {
                t.next = head;
                t = t.next;
            }
            head = head.next;
        }
        
        t.next = null;
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveNodesFromArray rn = new RemoveNodesFromArray();
        ListNode head = rn.new ListNode(1);
        head.next = rn.new ListNode(3);
        head.next.next = rn.new ListNode(4);
        head.next.next.next = rn.new ListNode(5);
        head.next.next.next.next = rn.new ListNode(6);
        head.next.next.next.next.next = rn.new ListNode(7);


        ListNode curNode = rn.modifiedList(List.of(1, 3), head );
        while (curNode != null) {
            System.out.println(curNode.val);
            curNode = curNode.next;
        }
    }
}