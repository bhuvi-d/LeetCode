import java.util.*;

class Main {
    static int solve(String str){
        if (str.length()==0)
            return 0;
        int max1 = Integer.MIN_VALUE;
        for (int i=0 ; i<str.length(); i++){
            Set < Character> se = new HashSet <> ();
            for (int j=i ; j<str.length();j++)
            {
                if (se.contains(str.charAt(j))){
                    max1 = Math.max(max1,j-i);
                    break;
                    }
                 se.add(str.charAt(j));
            }
          
        }
        return max1;
       
    }
    public static void main(String[] args) {
        System.out.println("ONLINE COMPILED ");
        String str = "BBBBCCAADDDAS";
        System.out.println(solve(str));
    }
}
