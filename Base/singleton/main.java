package Singleton;
// singleton allows only one object
public class main {
    public static void main(String[] args) {

        Singleton obj = Singleton.getInstance ();
        Singleton obj2 = Singleton.getInstance ();
        Singleton obj3 = Singleton.getInstance ();
        // all three ref variables are pointing to just one object


    }
}
