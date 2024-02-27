package greedy;
import java.util.*;

public class knapsackF {
    public static void main(String[] args) {

        // Calculate v/w ration
        // create 2D array that stores index and ratio
        // sort 2D array based on ratio

        int [] val = {60,120,100};
        int [] weight = {10,30,20};
        int totalCap=55;

        double [][] ratio = new double[val.length][2];

        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        for(int i=0;i<ratio.length;i++){
            System.out.println(ratio[i][0]+ " "+ratio[i][1]);
        }

        int currCap=totalCap;
        int ans=0;

        for(int i=0;i<val.length;i++){
            if(currCap>=weight[(int)ratio[i][0]]){
                currCap-=weight[(int)ratio[i][0]];
                ans+=val[(int)ratio[i][0]];
            }
            else{
                ans+=currCap*ratio[i][1];
                currCap=0;
                break;
            }
        }

        System.out.println(ans);
    }
}

