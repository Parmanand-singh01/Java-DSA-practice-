class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        return issquare(p1,p2,p3,p4);
    }
    public boolean issquare(int []p1,int []p2,int []p3,int []p4){
        int []dis=new int[6];
        dis[0]=distance(p1,p2);
        dis[1]=distance(p2,p3);
        dis[2]=distance(p3,p4);
        dis[3]=distance(p4,p1);
        dis[4]=distance(p1,p3);
        dis[5]=distance(p2,p4);
        
    Arrays.sort(dis);
        return dis[0]>0&&dis[0]==dis[1]&&dis[1]==dis[2]&&dis[2]==dis[3]&&dis[4]==dis[5]&&dis[5]==2*dis[1];
    }
    static int distance(int []p,int []k){
        int x=p[0]-k[0];
        int y=p[1]-k[1];
        return (p[0]-k[0])*(p[0]-k[0])+(p[1]-k[1])*(p[1]-k[1]);
    }
}
