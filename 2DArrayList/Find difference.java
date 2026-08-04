class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<>();
HashSet<Integer> row=new HashSet<>();
HashSet<Integer> col=new HashSet<>();
        for(int i:nums1){
            row.add(i);
        }
        for(int i:nums2){
            col.add(i);
        }
        ArrayList<Integer> ans1=new ArrayList<>();
        ArrayList<Integer> ans2=new ArrayList<>();
        for(int i:row){
      if(!col.contains(i)){
            ans1.add(i);
            }
        }
        list.add(ans1);
        for(int i:col){
      if(!row.contains(i)){
            ans2.add(i);
            }
        }
        list.add(ans2);
        return list;
    }
}
