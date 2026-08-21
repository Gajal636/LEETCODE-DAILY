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
    public ListNode deleteDuplicates(ListNode head) {
        StringBuilder ans=new StringBuilder();
        Set<Integer> set=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
   
        ListNode temp=head;
       while(temp!=null){
                if(set.contains(temp.val)){
                    set2.add(temp.val);
                }else {
                    set.add(temp.val);
                }
            temp=temp.next;
        }
        ListNode dummy=new ListNode(-1);
        ListNode ansTail=dummy;
        temp=head;
         while(temp!=null){
            if(set.contains(temp.val) && !set2.contains(temp.val)){
                ansTail.next=new ListNode(temp.val);
            ansTail=ansTail.next;
            }
            temp=temp.next;
        }
       
        return dummy.next;
        


    }
}