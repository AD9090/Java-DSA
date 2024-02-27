package dsa.ad;

public class subS {
    public static void subset(int[] a,int i,String ans){
        if(i==a.length){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        subset(a,i+1,ans+a[i]);
        subset(a,i+1,ans);
    }

    public static void permutation(String c,String ans){
        if(0==c.length()){
            System.out.println(ans);
            return;
        }

        for(int j=0;j<c.length();j++){
            //char curr=c[j];
            String newstr=c.substring(0,j)+c.substring(j+1);
            //permutation(newstr,ans+curr);
        }
    }

    public static void main(String[] args) {
        int b[]={1,2,3};
        subset(b,0,"");
        permutation(b.toString(),"");
    }
}
