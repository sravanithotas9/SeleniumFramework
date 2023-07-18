import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String[] args) {
        Scanner in= new Scanner ( System.in );
        //syntax
        ArrayList<Integer>  list = new ArrayList<> ( 5);
/*
        list.add(4);
        list.add(89);
        list.add(6709);
        list.add(567);
        list.add(435);


        System.out.println (list);

        System.out.println (list.contains ( 89 ));

       list.set ( 3,143 );

        System.out.println (list);

        list.remove ( 2 );

        System.out.println (list);*/


        //input

        for (int i = 0; i < 5; i++) {
            list.add ( in.nextInt () );
        }
            
            //get item at any index

            for (int i = 0; i < 5; i++) {
                System.out.println (list.get(i));//pass index here,list[index] will not work here
                
            }
            System.out.println (list);
            //gjhgjhkgjhghjgjhgjh
        }



    }

