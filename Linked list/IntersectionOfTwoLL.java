public class Solution { //160. Intersection of Two Linked Lists
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1=0;int n2=0;
        ListNode t1=headA;
        ListNode t2=headB;
        while (t1!=null){
            n1++;
            t1=t1.next;
        }
        while (t2!=null){
            n2++;
            t2=t2.next;
        }
        t1=headA;t2=headB;
        if(n1>n2){
            for(int i=0;i<n1-n2;i++){
                t1=t1.next;
            }
 }else {for(int i=0;i<n2-n1;i++){
            t2=t2.next;
 } }
        while(t1!=null){
            if(t1==t2){
                return t1;
            }
        t1=t1.next;t2=t2.next;
        }
        return null;
        
    }
}
