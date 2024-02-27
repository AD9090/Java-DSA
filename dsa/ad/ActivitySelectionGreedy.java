package dsa.ad;
import java.util.*;

class ActivitySelectionGreedy {
    public static void main(String[] args) {
        int [] start = {1,3,5,5,8,0};
        int [] end = {2,4,9,7,9,6};
        // First Sort Activity based on end time

        int [][] a = new int[start.length][3];
        // 3 colums :-
        // column 1 for index
        // column 2 for start time
        // column 3 for end time

        for(int i=0;i<end.length;i++){
            a[i][0]=i;
            a[i][1]=start[i];
            a[i][2]=end[i];
        }

        // Sorting activity based on end time
        Arrays.sort(a,Comparator.comparingDouble(o->o[2]));

        // Selecting Activities

        ArrayList <Integer> al=new ArrayList<>();
        // for include selected activities in arraylist

        int maxAct=1;
        //After Sorting first activity (ending first) is always included
        al.add(a[0][0]);

        int lastEnd=a[0][2];

        // Checking start time of curr Activity is greater than end time of previosly selected activity , than select that activity
        for(int i=1;i<end.length;i++){
            if(a[i][1]>=lastEnd){
                maxAct++;
                al.add(i);
                lastEnd=a[i][2];
            }
        }

        System.out.println(" Selected Activities  ");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }

    }
}