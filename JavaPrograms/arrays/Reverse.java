import java.util.Arrays;


public class Reverse {
    public static void main(String[] args) {
        int[] array ={ 1,2,23,4,51};
        reverse(array);
        System.out.println ( Arrays.toString (array));

    }
    static int[] reverse (int[] array){
        int start=0;
        int end=array.length-1;
        while(start<end){
           Swap.swap1(array,start,end);
            start++;
            end--;

        }
        return array;
    }

    }
