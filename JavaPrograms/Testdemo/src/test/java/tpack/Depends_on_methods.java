package tpack;

import org.testng.annotations.Test;

public class Depends_on_methods {

        @Test(dependsOnMethods = {"dmart","walmart"})
        //here dependsOnMethods is perform that methods which is given inside the brackets should
        // excute first later than other methods are executed according to alphabetical order
        public void flipkart(){
            System.out.println ("flipkart is open");
        }

        @Test(enabled = false)
        //here enabled = false means this method  will not excute but remaining methods will execute
        public void amazon(){
            System.out.println (" Amazon is open");
        }

        @Test
        public void walmart(){
            System.out.println ("Walmart is open");
        }

        @Test
        public void dmart(){
            System.out.println ("Dmart is open");
        }

        @Test(timeOut = 4000)
        public void macys() throws InterruptedException {
            System.out.println ("macys is open");
            Thread.sleep ( 3000 );
    }


    }


