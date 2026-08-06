class Solution {
    public String reverseStr(String s, int k) {
        char arr[]=s.toCharArray();
for(int i=0;i<s.length();i+=2*k){
 int st=i;
int ed=Math.min(i+k-1,arr.length-1);
    while(st<ed){
        char temp=arr[st];
        arr[st]=arr[ed];
        arr[ed]=temp;
        st++;ed--;
    }
}
        return new String(arr);
    }
}
