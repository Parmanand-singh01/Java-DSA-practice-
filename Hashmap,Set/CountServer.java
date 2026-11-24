class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int m=logs.length;
        int q=queries.length;
        Arrays.sort(logs,(a,b)-> a[1]-b[1]);
        Integer []maintain=new Integer[q];
        for(int i=0;i<q;i++){
            maintain[i]=i;
        }
        Arrays.sort(maintain,(a,b)-> queries[a]-queries[b]);
        int i=0;
        int j=0;
        int result[]=new int[q];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int idx:maintain){
            int st=queries[idx]-x;
            int ed=queries[idx];
            while(j<m&&logs[j][1]<=ed){
                int server=logs[j][0];
                map.put(server,map.getOrDefault(server,0)+1);
                j++;
            }
            while(i<j&&logs[i][1]<st){
             int server=logs[i][0];
                map.put(server,map.get(server)-1);
            if(map.get(server)==0){
                map.remove(server);
            }
                i++;
            }
            result[idx]=n-map.size();
        }
        return result;
    }
}
