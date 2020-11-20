/**
https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
*/
public int getDecimalValue(ListNode head) {
        int binaryNum = head.val;
        while (head.next != null) {
            binaryNum = binaryNum * 2 + head.next.val;
            head = head.next;
        }
        return binaryNum;
    }
