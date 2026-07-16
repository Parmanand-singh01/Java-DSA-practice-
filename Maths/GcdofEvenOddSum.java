class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evensum=0,oddsum=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0){
                evensum+=i;
            }else oddsum+=i;
        }
        return gcd(evensum,oddsum);
    }
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    
    }
}
