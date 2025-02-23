// 82. Remove Duplicates from Sorted List II
// Medium
// Topics
// Companies
// Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

 

// Example 1:


// Input: head = [1,2,3,3,4,4,5]
// Output: [1,2,5]
// Example 2:


// Input: head = [1,1,1,2,3]
// Output: [2,3]
 

// Constraints:

// The number of nodes in the list is in the range [0, 300].
// -100 <= Node.val <= 100
// The list is guaranteed to be sorted in ascending order.

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedList2 {      
    class ListNode {         
        int val;         
        ListNode next;         
        ListNode(int x) {             
            val = x;             
            next = null;         
        }      
    }      

    public ListNode deleteDuplicates(ListNode head) { 
        if (head == null || head.next == null) return head;  // Edge case: empty or single-node list

        ListNode dummy = new ListNode(0);  // Dummy node to handle head duplicates
        dummy.next = head;
        ListNode prev = dummy; // Previous node pointer
        ListNode curr = head;  // Current node pointer

        while (curr != null) {
            boolean isDuplicate = false; 
            
            // Move ahead while there are duplicates
            while (curr.next != null && curr.val == curr.next.val) {
                isDuplicate = true; 
                curr = curr.next; // Skip duplicate node
            }

            if (isDuplicate) {
                prev.next = curr.next; // Remove all occurrences of duplicate nodes
            } else {
                prev = prev.next; // Move previous pointer forward if no duplicates
            }
            
            curr = curr.next; // Move current pointer forward
        }
        
        return dummy.next;
    }

    public static void main(String[] args) {         
        RemoveDuplicatesFromSortedList2 rn = new RemoveDuplicatesFromSortedList2();         
        ListNode head = rn.new ListNode(1);          
        head.next = rn.new ListNode(3);           
        head.next.next = rn.new ListNode(3);          
        head.next.next.next = rn.new ListNode(4);          
        head.next.next.next.next = rn.new ListNode(5);          
        head.next.next.next.next.next = rn.new ListNode(5);          
        head.next.next.next.next.next.next = rn.new ListNode(6);  

        ListNode temp = rn.deleteDuplicates(head);        
        // Print list         
        ListNode curr = temp;         
        while (curr != null) {             
            System.out.print(curr.val + " -> ");             
            curr = curr.next;         
        }         
        System.out.print("Null"); 
    } 
}

