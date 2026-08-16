class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
    char []c=String.valueOf(i).toCharArray();
    for(int j=1;j<c.length-1;j++){
        if(c[j]>c[j-1] && c[j]>c[j+1] || c[j]<c[j-1]&& c[j]<c[j+1]){
            count++;
        }
    }
        }
        return count;
    }
}
