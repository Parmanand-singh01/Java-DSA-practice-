class Solution {
public
    ListNode partition(ListNode head, int x) {
 ListNode dummy1=new ListNode(-1);
 ListNode dummy2=new ListNode(-1);
        ListNode a=dummy1;
        ListNode b=dummy2;
        while(head!=null){
            if(head.val<x){
                a.next=head;
                a=a.next;
            }else {
                b.next=head;
                b=b.next;
            }
            head=head.next;
        }
        b.next=null;
        a.next=dummy2.next;
        return dummy1.next;
    }
}
