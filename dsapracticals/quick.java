package dsapracticals;

import java.util.Scanner;

public class quick {
    public static int partition(int []a,int low,int high){
        int pivot=a[low];
        int i=low+1;
        int j=high;
        do{
            while(a[i]<=pivot){
                i++;
            }
            while(a[i]>pivot){
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }while(i<j);

        int temp=a[low];
        a[low]=a[j];
        a[j]=temp;

        return j;
    }

    public static void quicksort(int []a ,int low,int high){
        int partitionIndex;
        if(low<high) {
            partitionIndex = partition(a, low, high);
            quicksort(a, low, partitionIndex - 1);
            quicksort(a, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        //int t=sc.nextInt();
        int [] a=new int[7];
        for(int i=0;i<7;i++){
            a[i]=sc.nextInt();
        }
        quicksort(a,0,a.length);
        for(int i=0;i<7;i++){
            System.out.println(a[i]);
        }
    }
}
