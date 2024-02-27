package dsa.ad;
import java.util.*;
public class slidingWindow {

    public static int swindow1(int[] a,int k){
        // maximum sum of k-size sub array
        // find maximum sum of k consecutive elements
        int currSum=0,maxSum=0;
        for(int i=0;i<k;i++){
            currSum+=a[i];
        }
        maxSum=currSum;
        System.out.println(currSum);

        for(int i=k;i<a.length;i++){
            currSum+=a[i];
            currSum-=a[i-k];
            System.out.println(currSum);
            if(maxSum<currSum){
                maxSum=currSum;
            }
        }

        return maxSum;
    }


    public static boolean swindow2(int []a2,int sum){
        //Given unsorted Array of non-negetive elements
        //Find wheather there exists any subarray whose sum is equal to given sum

        int currSum=0,j=0;
        for(int i=0;i<a2.length;i++){
            currSum += a2[i];
            System.out.println(currSum);
            while(currSum>sum && j<a2.length){
                currSum-=a2[j++];
                System.out.println(currSum);
            }
            if(currSum==sum){
                return true;
            }
        }
        return false;
    }

    public static int swindow3(int []a3,int target) {
        //Find minimum length of subarray whose sum is greater than or equal to target sum

        int left=0,minSize=a3.length+1;
        int n= a3.length,sum=0;

        for(int right=0;right<n;right++){
            sum+=a3[right];

            while(sum-a3[left]>=target && left<right){
                sum-=a3[left];
                left++;
            }
            if(sum>=target){
                minSize=Math.min(minSize,right-left+1);
            }
        }

        if(minSize== a3.length+1){
            return 0; //any subarray doesn't exist
        }

        return minSize;
    }

    public static void mbonacci(int m,int n){
        //m-bonacci
        //nth term of that series
        int [] a=new int[n];

        for(int i=0;i<m-1;i++){
            a[i]=0;
        }

        a[m-1]=1;
        int currSum=1;
        for(int i=m;i<n;i++){
            a[i]=currSum;
            currSum+=a[i];
            currSum-=a[i-m];
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println();
    }

    public static int longestSubarrayWithSumK(int []a, long k) {
        //Find the length of the longest subarray of 'a' whose sum is equal to 'k'.
        //O(2n)
        long sum=a[0];
        int left=0,right=0;
        int ans=0;

        while(right<a.length){

            while(sum>k && left<=right){
                sum-=a[left++];
            }
            if(sum==k){
                ans=Math.max(ans,right-left+1);
            }
            right++;
            if(right<a.length){
                sum+=a[right];
            }
        }

        return ans;
    }
    public static int longestSubarrayWithSumKoptimal(int []a, long k) {
        //Find the length of the longest subarray of 'a' whose sum is equal to 'k'.
        //O(n) - optimal
        int start=0, end=0;
        int length=0, ans=-10;

        while(end<a.length){
            if(k==0){
                ans=Math.max(length,ans);
            }
            else if (k<0) {
                k+=a[start];
                length--;
                start++;
                continue;
            }
            k-=a[end];
            length++;
            end++;
        }
        if(k==0){
            ans=Math.max(length,ans);
        }
        return ans;

    }

    public static void main(String[] args) {
        int [] a={1,8,30,-5,20,2};
        int [] a2={2,4};
        int [] a3={1,4,0,0,3,10,5};
        int k=3;
        //System.out.println(swindow1(a,k));
        //System.out.println(swindow2(a3,3));
        //mbonacci(4,19);
        //System.out.println(swindow3(a3,8));

        List<Integer> w = new ArrayList<Integer>();
        List<ArrayList<Integer>> aa = new ArrayList<ArrayList<Integer>>(); //Use Arraylist inside

        for(int i=1;i<10; i++){
            w.add(i);
            aa.add(new ArrayList(w));
        }

        System.out.println(w);
        System.out.println(aa);
    }
}
