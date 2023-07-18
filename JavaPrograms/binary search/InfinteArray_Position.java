package Com.binary;

public class InfinteArray_Position {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        int ans=ans(arr,target);
        System.out.println (ans);
    }
    static int ans(int[] arr,int target) {
        //first find the range
        //first start with the box of size 2

        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            //condition for the target to lie in the range

            int temp = end + 1;//here temp=newstart

            /*here every time box is multiply with 2, example array{4,6,8,9,23,45,67,89,90,98,112,114,116,117}
            first find the target in 2 elements start :4 end:6 then multiply with 2*2=4 start=8 end:45
            then multiply 4*2=8 start:67 end:117 to find the target in the block dividing the infinite array into
            small boxes*/

            end = end + (end - start + 1) * 2;
            start = temp;

        }
        return binarysearch ( arr, target, start, end );
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target< arr[mid]){
                end=mid-1;

            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                if (target == arr[mid]) {
                    return mid;

                }
            }

        }
        return -1;

    }
}
