class Solution {
    public int maxDistance(int[] colors) {
        int dm=0;
        int n=colors.length;
        for(int i=0;i<n;i++){
            int d=0;
            for(int j=0;j<n;j++){
   if(colors[i]!=colors[j])
                
                d=Math.max(d,i-j);
            }
            dm=Math.max(d,dm);
        }
        return dm;
        
    }
}
