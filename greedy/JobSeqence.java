package greedy;
import java.util.*;

public class JobSeqence {

    static class Job{
        int deadline;
        int profit;
        int id;

        Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }

    }

    public static void main(String[] args) {
        int [][] a = { {4,20}, {1,30}, {1,40}, {1,20} };

        ArrayList<Job> jobs=new ArrayList<>();

        for(int i=0;i<a.length;i++){
            jobs.add(new Job( i, a[i][0], a[i][1] ));
        }

        // Sorting jobs (object) based on profit property
        Collections.sort(jobs, (ob1,ob2) -> ob2.profit-ob1.profit );
        ArrayList<Integer> ans=new ArrayList<>();

        int time=0;

        for(int i=0;i<jobs.size();i++){
            if(jobs.get(i).deadline > time){
                time++;
                ans.add(jobs.get(i).id);
            }
        }

        System.out.println("Jobs Done : ");
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
