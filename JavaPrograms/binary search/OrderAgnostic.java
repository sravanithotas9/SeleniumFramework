package Com.binary;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr={90,75,18,12,6,3,1};
        int target=75;
        int ans=OrderAgnosticBS(arr,target);
        System.out.println (ans);

    }

    static int OrderAgnosticBS (int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        //find whether it is ascending sorted array or descending sorted array

        boolean isAsc;

        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;

        }
        while (start <= end) {


            int mid = start + (end - start) / 2;

            //if target is mid-element print the answer

            if (arr[mid] == target) {

                return mid;
            }
            if (isAsc) {

                if (target < arr[mid]) {

                    end = mid - 1;

                } else {

                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {

                    end = mid - 1;

                } else {
                    start = mid + 1;

                }

            }
        }
        return -1;

    }

}





