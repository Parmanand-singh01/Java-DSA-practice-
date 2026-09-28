public class Solution extends VersionControl {
    static int p;
    public int firstBadVersion(int n) {
        int lo=1;
        int hi=n;
        while(lo<hi){
           int mid=lo+(hi-lo)/2;
        if(isBadVersion(mid)){
            hi=mid;
        }else lo=mid+1;
        }
        return hi;
    }

}
