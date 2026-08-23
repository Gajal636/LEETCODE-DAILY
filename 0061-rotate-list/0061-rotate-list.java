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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        int size=1;
        ListNode temp=head;
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }

        temp.next=head;

        k=k%size;

        temp=head;
        for(int i=0;i<size-k-1;i++){
            temp=temp.next;
        }
        ListNode forward=temp.next;
        temp.next=null;
        return forward;
    }
}