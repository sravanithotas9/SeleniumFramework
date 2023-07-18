import java.util.ArrayList;
import java.util.Scanner;

public class Multiarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner ( System.in );
        ArrayList<ArrayList<Integer>> list = new ArrayList < > ();

        /* intialising of arraylist */

        for (int i = 0; i < 3; i++) {
            list.add ( new ArrayList<> () );
        }
          /*adding elements */
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3 ; j++) {
                    int a=sc.nextInt ();
                    list.get (i).add (a);/* get(i) is taken from intialising of i */
                }
            }
        System.out.println (list);

        }
    }

