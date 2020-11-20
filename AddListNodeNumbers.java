/**
 https://leetcode.com/problems/add-two-numbers/
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ln = new ListNode();
        ListNode curr = ln;
        while(l1 != null || l2 != null) {
            
            int sum = ((l1 != null) ? l1.val : 0) +
                ((l2 != null) ? l2.val : 0) + carry;
            carry = sum/10;
            
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return ln.next;
    }
}
