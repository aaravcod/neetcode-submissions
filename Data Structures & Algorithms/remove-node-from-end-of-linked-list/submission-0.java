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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode refptr= head;
        ListNode mainptr= head;
        ListNode temp=head;
        
        int count=0;
        if (head.next == null && n == 1) {
            return null;
            }

        while(count<n){
            refptr=refptr.next;
            count++;
        }
        if (refptr == null) {
            return head.next; 
        }
        while(refptr!=null){
            refptr=refptr.next;
            mainptr=mainptr.next;
        }


        while(temp.next!=mainptr){
            temp=temp.next;
        }
        temp.next=mainptr.next;

        return head;
    }
}
