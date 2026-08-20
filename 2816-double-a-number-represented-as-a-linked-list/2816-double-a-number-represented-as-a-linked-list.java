import java.math.BigInteger;
// //  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
class Solution {
    public ListNode doubleIt(ListNode head) {
        StringBuilder ans = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            ans.append(temp.val);
            temp = temp.next;
        }

        String str = ans.toString();
        BigInteger value = new BigInteger(str);
        BigInteger mul = value.multiply(BigInteger.valueOf(2));

        String s = mul.toString();

        ListNode newhead = null;
        ListNode newtemp = null;

        for (int i = 0; i < s.length(); i++) {

            ListNode newNode = new ListNode(s.charAt(i) - '0');

            if (newhead == null) {
                newhead = newNode;
                newtemp = newNode;
            } else {
                newtemp.next = newNode;
                newtemp = newtemp.next;
            }
        }
        return newhead;
    }
}