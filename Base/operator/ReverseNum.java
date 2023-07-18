package com.sravani1;

public class ReverseNum {
    public static void main(String[] args) {
//        n = 4637 then answer is reverse of the number 7364
////        * 4637--->first digit of answer is multiplied with 10 and added next digit
////        * 4637%10 = 7,4637/10 =463 ---> num=463, ans=7
////        * 463%10 = 3,463/10 =46 ----> num =46 , ans =73
////        * 46%10 = 6 , 46/10 =4----->num =4,ans=736
//          * 4%10= 4 , 4/10 =0---> num =0 ,ans =7364

        int num = 4637;

        int ans = 0;

        while (num > 0) {

            int rem = num % 10;

            num = num/10;

            ans = ans * 10 + rem;
        }
            System.out.println(ans);

    }
}
