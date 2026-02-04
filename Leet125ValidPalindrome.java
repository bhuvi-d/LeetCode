class Solution {
    public boolean isPalindrome(String s) {

        String y = "";
        //java string method conversion needs reassignment 
        s = s.toLowerCase();   

       
        for (int x = 0; x < s.length(); x++) {
            //character method needs char.check 
            if (Character.isLetterOrDigit(s.charAt(x))) { 
                y = y + s.charAt(x);
            }
        }
    //checking cleaned string yay~
        for (int j = 0; j < y.length(); j++) { 

            if (y.charAt(j) != y.charAt(y.length() - 1 - j)) { 
                return false;
            }
        }

        return true; 
    }
}
