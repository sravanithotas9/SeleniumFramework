package Com.binary;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums={3,7,7,8,8,9};
        int target=7;
        int[] ans={-1,-1};
        // check for first occurrence of target first
            int start= search(nums,target,true);
            int end = search(nums,target,false);

        ans[0]=start;
        ans[1]=end;
        System.out.println ( Arrays.toString (ans));

    }
    //this function just returns the index value of target
        public static int search(int[] nums, int target, boolean findStartIndex){
           int ans=-1;
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                //find the middle element
                //int mid=(start+end)/2;might that be possible that (start+end) exceeds the range of the in java
                int mid = start + (end - start) / 2;
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    //potential ans
                    ans= mid;

                    if(findStartIndex==true) {
                        end = mid - 1;
                    }else{
                        start=mid+1;
                }
            }

        }
            return ans;
    }
}