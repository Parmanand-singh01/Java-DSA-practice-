class Solution { //2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int min=Integer.MAX_VALUE;
        int max=-1;int index=1;
        int first=-1;int prevcrit=-1;
        ListNode prev=head;
        ListNode curr=head.next;
   while(curr!=null&&curr.next!=null){
       if(curr.val>prev.val&&curr.val>curr.next.val||curr.val<prev.val&&curr.val<curr.next.val){
           if(first==-1) first=index;
           else min=Math.min(min,index-prevcrit);
           max=index-first;
           prevcrit=index;
       }
       prev=curr;
       curr=curr.next;
       index++;
   }
if(max==-1||min==Integer.MAX_VALUE) return new int[]{-1,-1};
        return new int[]{min,max};
    }
}
