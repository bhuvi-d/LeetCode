class Solution {
    public void reverseString(char[] s) {
        int x = s.length;
        int y = (x/2);
        for (int z=0;z<y;z++){
            char t = s[z];
            s[z]=s[(x-1)-z];
            s[(x-1)-z]=t;

        }
        
    }
}
