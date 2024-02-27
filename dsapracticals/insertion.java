package dsapracticals;
import java.util.*;

public class insertion {
    public static void main(String[] args) {
        System.out.println("Enter size of Array : ");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int [] a=new int[t];
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }

        int j=0,k=0;
        for(int i=1;i<t;i++){
            k=a[i];
            j=i-1;
            while(j>=0 && a[j]>k){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;
        }
        for(int i=0;i<t;i++){
            System.out.println(a[i]);
        }
    }
}
