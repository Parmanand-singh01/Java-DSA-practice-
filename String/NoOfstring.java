class Solution { //1967. Number of Strings That Appear as Substrings in Word
    public int numOfStrings(String[] patterns, String word) {
        int n=patterns.length;
        int count=0;
        for(int i=0;i<n;i++){
 if(word.indexOf(patterns[i])!=-1){
     count++;
 }
        }
        return count;
    }
}
