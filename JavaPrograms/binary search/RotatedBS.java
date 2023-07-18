package Com.binary;

public class RotatedBS {
    // leeet-code 33. SEARCH IN ROTARTED SORTED ARRAY (medium)
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2,3};
        int target = 7;
        int ans1=Search(arr,target);
        System.out.println (ans1);

    }
    static int Search(int[] nums,int target) {
        int pivot = findPivot ( nums );
        //if you didn't find a pivot,it means the array is not rotated
        if (pivot == -1) {
            //just do normal binary search
            return binarysearch(nums,target,0,nums.length-1);
        }
        //if pivot is found,you have to find two ascending sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarysearch ( nums,target,0,pivot-1 );
        }
        return binarysearch(nums,target,pivot+1,nums.length-1);

    }
    static int binarysearch(int[] arr,int target,int start,int end){

        while(start<=end){
            //find the middle element
            //int mid=(start+end)/2;might that be possible that (start+end) exceeds the range of the in java
            int mid=start+(end-start)/2;
            if(target < arr[mid]) {
                end = mid-1;
            }else if(target > arr[mid]) {
                start = mid + 1;
            }else
                return mid;

        }
        return-1;

    }
    //this will not work for duplicate elements in sorted array
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //actually pivot means highest or greatest element in sorted array
            //to find pivot here we have 4 cases
            if(mid < end && arr [mid] > arr[mid+1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return start;
            }
            if(arr[mid] <= arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
