class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
Deque<Integer> dq=new ArrayDeque<>();
        int l=0,n=nums.length,idx=0;
int arr[]=new int[n-k+1];
        for(int i=0;i<n;i++){
            // remove outside kiya 
while(!dq.isEmpty()&&dq.peekFirst()<l){dq.pollFirst();
            }//remove smaller
while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i]){dq.pollLast();
        }// add idx in dq
        dq.add(i);
            // size mila
    if(i-l+1==k){
    arr[idx++]=nums[dq.peekFirst()];l++;
    }
        }
        return arr;
    }
}
