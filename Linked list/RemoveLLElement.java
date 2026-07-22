class Solution { //203. Remove Linked List Elements
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null&&head.val==val){
            head=head.next;
        }
        ListNode prev=null;
        ListNode slow=head;
        while(slow!=null){
            if(slow.val==val){
                prev.next=slow.next;
            }else 
            prev=slow;
            slow=slow.next;
        }
        return head;
        
    }
}
