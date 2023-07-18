package Com.binary;

public class Peak_MountainArray {
    //leet-code 852.peakIndexMountainArray
    //it is also known as bitonic array....in leet-code peak-mountain array
    public static void main(String[] args) {
        int[] array={2,3,4,5,7,6,5,1};
        int ans = peakIndexInMountainArray(array );
        System.out.println (ans);
    }
    static int peakIndexInMountainArray(int[] array){
        int start=0;
        int end= array.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(array[mid]>array[mid+1]) {
                //you are decreasing part of array
                //this may be the ans but look at left side of array
                //this is my end not equal to end-1
                end = mid;//because we know that mid+1 element > mid element
            }else{
                //you are in ascending part of the ans
                start=mid+1;
            }
        }
        //in the end start == end pointing to the largest number because of the 2 checks above
        //start and end are always trying to find max element in the above 2 checks
        //hence when they are pointing to just on element ,that is the max one because that is what the checks say
        //more elaboration: at every point of start and end,they have the best possible answer till that time
        //and if we are saying that only one item is remaining ,hence because of above line that is the best possible ans

        return start;//we can return end also because both are equal
    }
}
