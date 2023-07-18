package com.linear.search;
/*leetcode problem of the richest person to find maximum wealth */

public class Maxwealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};

        int res = maximumWealth ( accounts );

        System.out.println ( res );
    }
    public static int maximumWealth(int[][] accounts) {

        //person = row
        //account = col
        int ans = 0;
        for (int person = 0; person < accounts.length; person++) {

            int sum = 0;

            for (int account = 0; account < accounts[person].length; account++) {
            //here accounts is static int maximum-wealth(int [][] accounts)
                sum = sum + accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }

}









