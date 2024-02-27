package dsa.ad;
import java.util.*;

class Searching
{
    public static int Linearsearch(int[] nums,int key){  // Time Complexity : O(n)
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int [] nums,int key){ // Time Complexity : O(log n)
        int start=0;
        int end=nums.length-1;
        int mid=(start+end)/2;

        while(start<=end){
            if (nums[mid]==key){
                return mid;
            }
            else if(key>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=(start+end)/2;
        }
            return -1;
    }

    public static void main(String[] args) {
        int ar[] = { 1,2,5,77,333,1111};
        Scanner sc=new Scanner(System.in);
        int k =sc.nextInt();

        int ansIndex=BinarySearch(ar,k);
//        if(ansIndex==-1){
//            System.out.println("Not Found...");
//        }
//        else {
            System.out.println("Found at index " + BinarySearch(ar, k));
       // }
    }
}