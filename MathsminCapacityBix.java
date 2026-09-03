class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n=capacity.length;
        int max=Integer.MIN_VALUE;
    
        for(int i=0;i<n;i++){
            if(capacity[i]>max)
                max=capacity[i];
        }
        if(itemSize>max) return -1;
        int index=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(capacity[i]>=itemSize && capacity[i]<min){
                min=capacity[i];
                index= i;}
        }
        return index;
        
    }
}
