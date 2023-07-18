package Com.binary;

public class Binary_search {
    //in question where ever you find sorted array solve it with binary search
    //time complexity is beat case : 0(1) , worst case 0(l0gN)....,space complexity 0(1)
    public static void main(String[] args) {
        int[] arr={-18,-4,0,1,5,9,23,34,56,78,89};
        int target=56;
        int ans=binarysearch (arr,target);
        System.out.println (ans);

    }
    //return the index
    //return -1 if it does exists
    static int binarysearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            //find the middle element
            //int mid=(start+end)/2;might that be possible that (start+end) exceeds the range of the in java
            int mid=start+(end-start)/2;
            if(target < arr[mid]) {
               end = mid-1;
            }else if(target > arr[mid]) {
                start = mid+1;
            }else
                return mid;

                }
        return-1;


            }
        }



