class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1=list1;
        ListNode head2=list2;
        ListNode t=new ListNode(-1);
        ListNode k=t;
while(head1!=null&&head2!=null){
    if(head1.val<head2.val){
        k.next=head1;
        head1=head1.next;
    } else{ k.next=head2;
          head2=head2.next;}
    k=k.next;
        }
        while(head1!=null){
           k.next=head1;
        head1=head1.next;
            k=k.next;
        }
        while(head2!=null){
           k.next=head2;
        head2=head2.next;
            k=k.next;
        }
        return t.next;
    }
}
