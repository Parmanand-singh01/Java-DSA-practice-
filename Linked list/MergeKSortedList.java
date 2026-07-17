class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0)
            return null;
        ListNode ans = lists[0];
        for (int i = 1; i < lists.length; i++) {
            ans = merge(ans, lists[i]);
        }
        return ans;
    }
    public ListNode merge(ListNode a, ListNode b) {
        ListNode temp1 = a;
        ListNode temp2 = b;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                t.next = temp1;
                temp1 = temp1.next;
            } else {
                t.next = temp2;
                temp2 = temp2.next;
            }
            t = t.next;
        }
        while (temp1 != null) {
            t.next = temp1;
            temp1 = temp1.next;
            t = t.next;
        }
        while (temp2 != null) {
            t.next = temp2;
            temp2 = temp2.next;
            t = t.next;
        }
        return dummy.next;
    }
 }
