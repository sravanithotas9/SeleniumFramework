package Com.binary;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans=ceiling ( arr,target );
        System.out.println (ans);

    }
    //return the index smallest number >= target
    //above array ceiling target is example 3 than floor number is 5
    static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(target < arr[mid]) {
                end = mid - 1;

            } else if(target > arr[mid]){
                start=mid+1;

            }else {
                return mid;
            }
        }
               return start;
    }
}
