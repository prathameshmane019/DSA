// public 19. Remove Nth Node From End of List
// Medium
// Topics
// Companies
// Hint
// Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

// Example 1:


// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// Example 2:

// Input: head = [1], n = 1
// Output: []
// Example 3:

// Input: head = [1,2], n = 1
// Output: [1]
 

// Constraints:

// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz 

public class RemoveNthNode {

     class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
     }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;

        for (int i = 0; i < n; i++) {
            head=head.next;
        }

        while (head!=null) {
            head=head.next; 
            dummy=dummy.next;
        }
        if (head==null) {
            dummy.next =dummy.next.next;
        }

        return first.next;
    }

    public static void main(String[] args) {
        RemoveNthNode rn = new RemoveNthNode();
        ListNode head = rn.new ListNode(1);
         head.next = rn.new ListNode(3);
         head.next.next = rn.new ListNode(4);
         head.next.next.next = rn.new ListNode(5);
        head.next.next.next.next = rn.new ListNode(2);

        
        System.out.println(rn.removeNthFromEnd(head, 2));

        // print list
        ListNode curr =head;
        while (curr!=null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}