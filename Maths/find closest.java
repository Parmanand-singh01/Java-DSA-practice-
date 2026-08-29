class Solution {
    public int findClosest(int x, int y, int z) {
        int k=Math.abs(z-x);
        int t=Math.abs(z-y);
        if(k==t) return 0;
      return k<t ? 1: 2;
    }
}
