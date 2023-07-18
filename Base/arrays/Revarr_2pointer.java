import java.util.Arrays;



public class Revarr_2pointer {
    public static void main(String[] args) {
        int[] arr ={1,54,78,3,90};
        reverse (arr);

        System.out.println ( Arrays.toString (arr));
    }


    static void  reverse(int[] arr){
        int start =0;
        int end= arr.length-1;

        while(start<end){
            Swap.swap1(arr,start,end);
            start++;
            end--;
        }
    }
}
