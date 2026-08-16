class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
        int m=Integer.MAX_VALUE;
        int n=arr.length;
        for(int i=1;i<n;i++){
m=Math.min(m,Math.abs(arr[i]-arr[i-1]));
            }
        for(int i=1;i<n;i++){
if(Math.abs(arr[i]-arr[i-1])==m){
list.add(Arrays.asList(arr[i-1],arr[i]));
}
            }
        return list;
    }
}
