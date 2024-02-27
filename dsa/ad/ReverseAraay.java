package dsa.ad;

public class ReverseAraay {

    public static void reverse(int nums[]) // TimeComplexity O(n) , space complexity O(1)
    {
        int temp1=0;
        for(int i=0;i<nums.length/2;i++){
            temp1=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp1;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] ar ={ 1,2,3,4,5,6,7};
        System.out.println("Reversed Array is : ");
        reverse(ar);
    }
}
