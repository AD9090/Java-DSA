package org.example;
import java.util.*;

public class jercy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long a[]=new long[t];
        long b[]=new long[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextLong();
        }
        int j=0;
        long sum=0;
        if(t%2==0)
        {
            for(int i =0;i<t-1;i++)
            {
                b[j++]=a[i]^a[i+1];
                i++;
            }
            for(int k =0;k<t;k++)
            {
                sum+=b[k];
            }
        }

        else
        {
            for(int i =0;i<t-2;i++)
            {
                b[j++]=a[i]^a[i+1];
                i++;
            }
            for(int l =0;l<t;l++)
            {
                sum+=b[l];
            }
            sum +=a[t-1];
        }

        System.out.println(sum);
        long c=90413825674767126l;long d=70258219014609588l;
        long ans=c^d;
        long last=49358208343180731l;
        System.out.println(ans+last);
        }
    }


