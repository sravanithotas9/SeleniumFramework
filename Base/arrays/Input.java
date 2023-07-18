import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 67;
        arr[2] = 34;
        arr[3] = 90;
        arr[4] = 67;
        //{23,67,34,90,67} array will store in internally
        System.out.println ( arr[3] );

        // input using loop
        for (int i = 0; i < arr.length; i++) {

            arr[i] = in.nextInt ();
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print ( arr[i] + "" );

        }
        for (int num : arr) { // for every element in array,print the element
            System.out.print ( num + "" );//here num represents element of the array

            // Array of objects
            String[] str = new String[4];
            for (int i = 0; i < str.length; i++) {
                str[i] = in.next ();

            }
            System.out.println ( Arrays.toString ( str ) );


            str[1] = "caravan";

            System.out.println ( Arrays.toString ( str ));


        }
    }
}