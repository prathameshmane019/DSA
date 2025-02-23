// 83. Remove Duplicates from Sorted List
// Easy
// Topics
// Companies
// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

// Example 1:


// Input: head = [1,1,2]
// Output: [1,2]
// Example 2:


// Input: head = [1,1,2,3,3]
// Output: [1,2,3]
 

// Constraints:

// The number of nodes in the list is in the range [0, 300].
// -100 <= Node.val <= 100
// The list is guaranteed to be sorted in ascending order.

 
//  Definition for singly-linked list.
//  public class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }  

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedList {
    
    public ListNode deleteDuplicates(ListNode head) {
     Map<Integer,ListNode> mp = new HashMap<>();
    ListNode prevNode = new ListNode(0);
     ListNode curr = head;
     while (curr!=null) {
            if (mp.containsKey(curr.val)) {
                prevNode.next = curr.next;
                curr=curr.next;
            }
            else{
                mp.put(curr.val, curr);
                prevNode=curr;
                curr=curr.next;
            } 
     }
     return prevNode.next;
    } 

    
    
}


   