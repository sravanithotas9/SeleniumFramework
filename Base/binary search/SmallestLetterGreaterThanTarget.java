package Com.binary;

public class SmallestLetterGreaterThanTarget {
    //leet-code 744.Find The Smallest Letter Greater Than Target same as Ceiling Problem in Binary Search
    public static void main(String[] args) {

        char[] letters={'c','f','j'};
        char target='a';
        char ans=smallestLetter( letters,target );
        System.out.println (ans);

    }
    //return the index the smallest number >= target
    //above array ceiling target is example 3 than floor number is 5
    static char smallestLetter(char [] letters,char target){
        int start=0;
        int end=letters.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(target < letters[mid]) {
                end = mid - 1;

            } else {
                start=mid+1;


            }
        }
        return letters[start % letters.length];
    }
}


