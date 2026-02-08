// inefficient solution 
// finding longest pallindrome

// runs with o n^3 complexity

import java.util.Scanner;

 class Solution {
     public String LongestPallindrome(String s) {
         if (s == null || s.length() <= 0) {
             return "";
         }
         int n = s.length();
         String longest = "";
         for (int i =0;i<n;i++){
             for (int j=i;j<n;j++){
                 if(checkPallindrome(i,j,s) && (j-i+1)>longest.length()){
                     longest= s.substring(i,j+1);
                 }
             }
         }


         return longest;
     }
     public boolean checkPallindrome(int start,int end, String s){

         while(start<=end){
             if (s.charAt(start)!=s.charAt((end))){
                 return false;
             }

             start++;
             end--;
         }
         return true;
     }
 }



public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("You entered " + input);

        Solution sol = new Solution();

        String g = sol.LongestPallindrome(input);

        System.out.println("Pallindrome check resulted in  " + g);
        scanner.close();

    }

}


