class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> ans=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }
        for(int i:nums1){
            if(set2.contains(i)){
                ans.add(i);
            }
        }
        for(int i:nums3){
            if(set2.contains(i)){
                ans.add(i);
            }
        }
        for(int i:nums3){
            if(set1.contains(i)){
                ans.add(i);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:ans){
            list.add(i);
        }
        return list;
    }
}
