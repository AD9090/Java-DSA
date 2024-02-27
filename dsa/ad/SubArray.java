package dsa.ad;

public class SubArray {
    public static void printSubArray(int[] nums){
        int start=0,end=0,ts=0;
        int maxsum=0,sum=0,minsum=Integer.MAX_VALUE;

        for(int i=0;i< nums.length;i++){
            start=i;
            sum=nums[start];
            ts++;
            System.out.println(nums[start]); //print one element subarray

            for(int j=i+1;j<nums.length;j++){
                end=j;
                for(int k=start;k<=end;k++){ //Printing different subarrays
                    sum+=nums[k];
                    System.out.print(nums[k] + " ");
                    if(sum>=maxsum){
                        maxsum=sum;
                    }
                    if(sum<minsum){
                        minsum=sum;
                    }
                }
                ts++;

                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Number of SubArrays  : "+ ts);
        System.out.println("Max Sum Of Subarray is : "+maxsum);
        System.out.println("Min Sum Of Subarray is : "+minsum);
    }

    public static void main(String[] args) {
        int ar[]={1,3,2,4,7};
        printSubArray(ar);
    }
}
