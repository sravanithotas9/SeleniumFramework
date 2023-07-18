import java.util.Arrays;

public class Passinginfunction {
    public static void main(String[] args) {
        int[] nums = {23, 45, 67, 89};

    System.out.println (Arrays.toString ( nums ));
        change ( nums );
        System.out.println ( Arrays.toString ( nums ) );
    }

    static void change(int[] arr) {

        arr[0]=99;
    }
}
