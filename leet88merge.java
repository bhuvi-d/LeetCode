//note to self - best approach 3 pointer 
// the reason for else is to avoid specifiying conditions when m1 becomes <0 that is -1 
// case applied only for n1 
// traversed from end 


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1=(m-1);
        int n1=(n-1);
        int tr=m+n-1;
        while (n1>=0 ) {
        	if (m1>=0 && nums1[m1]>nums2[n1]) {
        		nums1[tr]=nums1[m1];
        		m1-=1;
        	}
        	else{
        		nums1[tr]=nums2[n1];
        		n1-=1;
        	}
        	
        	tr-=1;
        	
        	
        }
        
        
        
    }
}
