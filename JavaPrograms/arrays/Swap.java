import java.util.ArrayList;
import java.util.Arrays;


public class Swap {
    public static void main(String[] args) {
        int[] array ={ 1,2,23,4,51};

        swap1(array,1,3);
        System.out.println ( Arrays.toString (array));

    }
    static int[] swap1(int[] array,int a,int b) {

        int temp = array[a];
        array[a]=array[b];
        array[b]=temp;

        return array;
    }


}
