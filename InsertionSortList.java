/**
https://leetcode.com/problems/insertion-sort-list/
*/
public ListNode insertionSortList(ListNode head) {
        ListNode cur = head;
        while(cur != null) {            
            ListNode start = head;
            while(start.val <  cur.val && start != cur) {
                start = start.next;
            }            

            int prev = cur.val;
            while(start != cur.next) {
                int tmp = start.val;
                start.val = prev;
                prev = tmp;
                start = start.next;
            }            
            cur = cur.next;            
        }        
        return head;      
    }
