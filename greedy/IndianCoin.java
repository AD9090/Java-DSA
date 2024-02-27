package greedy;

import java.util.*;

public class IndianCoin {
    public static void main(String[] args) {
        int [] coins ={1,2,5,10,20,50,100,200,500,2000};

        //Arrays.sort(coins);
        int change=788;
        int val=change;
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=coins.length-1;i>=0;i--){
            if(coins[i]<=val){
                while(val>=coins[i]){
                    val-=coins[i];
                    al.add(coins[i]);
                }
            }
        }

        System.out.println("Coins Selected to give change of "+change);

        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}
