package backtracking;
import java.util.*;

public class findSubset {
    public static void subsetFind(String s,String ans,int i){
        //Base Condition
        if(i>=s.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }

        //Recursion
        //Yes-include character
        subsetFind(s,ans+s.charAt(i),i+1);

        //No- not include character
        subsetFind(s,ans,i+1);
    }

    public static void main(String[] args) {
        subsetFind("abc","",0);
    }
}
