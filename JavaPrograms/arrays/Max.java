import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] array = {1, 2, 23, 4, 51};
        System.out.println ( maxRange ( array, 1, 4 ) );

    }

    static int maxRange(int[] array, int start, int end) {

        int maxVal = array[start];

        for (int i = start; i <= end; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
            }


        }
        return maxVal;
    }
}

/*
    static int max(int[] array){

        int maxVal=array[0];

        for (int i = 1; i < array.length ; i++) {
            if(array[i] > maxVal){
                maxVal = array[i];
            }


        }
        return maxVal;

    }
}*/
