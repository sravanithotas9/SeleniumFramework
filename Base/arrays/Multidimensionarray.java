import java.util.Arrays;
import java.util.Scanner;

public class Multidimensionarray {

    public static void main(String[] args) {
        Scanner in= new Scanner ( System.in );


        /*
            1  2  3
            4  5  6
            7  8  9
            */

        int[][] arr = new int[3][3];

        int[][] arr2D = {
                {1, 2, 3},//0th imdex
                {4, 5},//1st index
                {7, 8, 9,3}};//2nd index ---.arr2D[2]={7,8,9,3}

        int[][] arr1 =new int[3][3];
        System.out.println (arr.length);//no of rows

       // Array of object
      /*  String[] str =new String[4];
        for (int i = 0; i < str.length ; i++) {

            str[i] = in.next ();
        }
        System.out.println (Arrays.toString ( str ));

        //modify

        str[1]="sravani";
        System.out.println (Arrays.toString ( str ));*/

        //input

         for (int row = 0; row < arr.length ; row++) {
              //for each column in every row
              for (int col = 0; col < arr[row].length; col++) {

                  arr[row][col] = in.nextInt ();
              }
          }

          //output

       for (int row = 0; row < arr.length ; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {


                  System.out.print ( arr[row][col] + " " );
              }
              System.out.println ();

          }
          //output
        for (int row = 0; row < arr.length; row++) {
            System.out.println ( Arrays.toString ( arr[row] ) );
            
        }

    /*    //enhanced for loop
        for(int[] a : arr) {
            System.out.println (Arrays.toString ( a ));
*/

            }

        }







