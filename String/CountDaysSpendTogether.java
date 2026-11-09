class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int n=arr.length;
int idxStart=Integer.parseInt(arriveAlice.substring(0,2));
int start=Integer.parseInt(arriveAlice.substring(3,5));
int idxLast=Integer.parseInt(leaveAlice.substring(0,2));
int last=Integer.parseInt(leaveAlice.substring(3,5));
int idxSt=Integer.parseInt(arriveBob.substring(0,2));
int st=Integer.parseInt(arriveBob.substring(3,5));
int idxLs=Integer.parseInt(leaveBob.substring(0,2));
int ls=Integer.parseInt(leaveBob.substring(3,5));
 int sum1=0,sum2=0,sum3=0,sum4=0;
        for(int i=0;i<idxStart-1;i++){
            sum1+=arr[i];
        }
        for(int i=0;i<idxLast-1;i++){
            sum2+=arr[i];
        }
        for(int i=0;i<idxSt-1;i++){
            sum3+=arr[i];
        }
        for(int i=0;i<idxLs-1;i++){
            sum4+=arr[i];
        }
        sum1+=start;
        sum2+=last;
        sum3+=st;
        sum4+=ls;
        int max=Math.max(sum1,sum3);
        int min=Math.min(sum2,sum4);
        System.out.println(max);
        System.out.println(min);
        if(max>min) return 0;
        int days=Math.abs(max-min);
        return days+1;
    }
}
