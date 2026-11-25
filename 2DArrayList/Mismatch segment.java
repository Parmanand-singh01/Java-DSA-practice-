class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> result=new ArrayList<>();
      int n=s1.length();
        boolean misMatch=false;
        int stIdx=-1;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(!misMatch){
                    misMatch=true;
                    stIdx=i;
                }
            }else{
                if(misMatch){
                 List<String> segment=new ArrayList<>();
                    segment.add(s1.substring(stIdx,i));
                    segment.add(s2.substring(stIdx,i));
                    result.add(segment);
                    misMatch=false;
                }
            }
        }
        if(misMatch){
            List<String> seg=new ArrayList<>();
            seg.add(s1.substring(stIdx,n));
            seg.add(s2.substring(stIdx,n));
            result.add(seg);
        }
        return result;
    }
}
