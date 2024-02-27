package backtracking;

public class FindPermutations {
    public static void permut(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            s=s.substring(0,i) + s.substring(i+1);
            permut(s,ans+curr);
        }
    }

    public static void main(String[] args) {
        permut("abc","");
    }
}
