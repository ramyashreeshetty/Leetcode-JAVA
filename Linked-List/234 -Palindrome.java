//Given the head of a singly linked list, return true if it is a palindrome.
// Input: head = [1,2,2,1]
// Output: true


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
    public boolean isPalindrome(ListNode head) {
        
   List data = new ArrayList<>();
        int i = 0, j = 0;
        ListNode curr = head;
        while(curr != null){
            data.add(curr.val);
            curr = curr.next;
        }
        i = 0;
        j = data.size()-1;
        while(i <= j){
            if(data.get(i++) != data.get(j--)) return false;
        }
        return true;
    }
}