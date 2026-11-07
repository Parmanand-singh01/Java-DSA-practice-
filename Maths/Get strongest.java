class Solution {
    public int[] getStrongest(int[] arr, int k) {int n=arr.length;
        Arrays.sort(arr);
int num[]=new int[k];
int m=arr[(n-1)/2], idx=0,i=0,j=n-1;
            while(idx<k){
                if(Math.abs(arr[j]-m)>=Math.abs(arr[i]-m)){
        num[idx++]=arr[j--];
         }else num[idx++]=arr[i++];
            }
    return num;
    }
}
