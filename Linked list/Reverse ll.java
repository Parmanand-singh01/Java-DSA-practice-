class Solution {
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        ListNode t =new ListNode();
        ListNode n =t;
        Collections.reverse(list);
        for(int i=0;i<list.size();i++){
            ListNode yes=new ListNode(list.get(i));
            n.next=yes;
            n=n.next;
        }
        n.next=null;
        return t.next; 
    }
}
