//Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
// Input: head = [1,2,6,3,4,5,6], val = 6
// Output: [1,2,3,4,5]
 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = head;
        
        while (node != null) {
             if (node.next != null && node.next.val == val) {
                node.next = node.next.next;
            }else {

                node = node.next;
            }
        }
        
        //to check for the first node
        if(head!=null){
            if(head.val == val){
                return head.next;
            }
        }
        return head;
    }
}