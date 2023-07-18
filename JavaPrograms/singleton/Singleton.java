package Singleton;
// singleton allows only one object
//according to this program it will check wheather object is created or check instance is null true then create object
//instance= new class getinstance then check if the method calling more objects return instance;

public class Singleton { //if class name is sravani
    private Singleton(){ //private sravani

    }
    private static Singleton Instance; //public static sravani....,Instance is variable we can take srithi (or)xyz

    //getInstance is a method we declared method in another class main under same package
    public static Singleton getInstance() {//getinstance we can take getsrithi (or) getxyz

        if (Instance == null) { //srithi (or) xyz
            Instance = new Singleton();//srithi (or) xyz = new srvani
        }

            return Instance;//srithi(or)xyz
        }
}
