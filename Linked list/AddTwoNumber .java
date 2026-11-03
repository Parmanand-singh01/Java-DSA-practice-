import java.math.*;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode temp=l1;
        ListNode temp2=l2;
        String p="",q="";
        while(temp!=null){
        p+=String.valueOf(temp.val);
            temp=temp.next;
        }
        while(temp2!=null){
    q+=String.valueOf(temp2.val);
            temp2=temp2.next;
        }
    String ss=new StringBuilder(p).reverse().toString();
 BigInteger a=new BigInteger(ss);

String sg=new StringBuilder(q).reverse().toString();
BigInteger b=new BigInteger(sg);
        System.out.println(a);
        System.out.println(b);
        
       BigInteger ans=a.add(b);
        
        String n=String.valueOf(ans);
     ListNode h =new ListNode(-1);
        ListNode k=h;
 for(int i=n.length()-1;i>=0;i--){
ListNode l=new ListNode(n.charAt(i)-'0');
     k.next=l;
     k=k.next;
 }
        return h.next;
        
    }
}
