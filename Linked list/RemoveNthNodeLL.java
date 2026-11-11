class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        if(n==1) return head.next;
        for(int i=0;i<=n;i++){
            fast=fast.next;
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
        }
        return head;
    }
}
