class Solution {
    public int[] arrayRankTransform(int[] arr) {
  int brr[]=Arrays.copyOf(arr,arr.length);
        Arrays.sort(brr);
 HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i:brr){
            if(!map.containsKey(i)){
                sum++;
map.put(i,sum); }
        }
        int ans[]=new int[arr.length];
for(int i=0;i<arr.length;i++){
    ans[i]=map.get(arr[i]);
}
    return ans;
    }
}
