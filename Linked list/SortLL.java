class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
            n++;
        }
        Collections.sort(list);
        temp=head;
        for(int i=0;i<n;i++){
            temp.val=list.get(i);
            temp=temp.next;
        }
        return head;
    }
}
