package great;

import java.util.*;

public class leet {

    public int[][] road() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 9};
        // creating an array for merging
        int n = intervals.length;
        List<int[]> merged = new ArrayList<>();

        // if intervals array is zero just add
        if (n == 0) {
            merged.add(newInterval);
            return merged.toArray(new int[0][]);
        }

       // mentioned sorted and use binary search in hint 1
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (intervals[mid][0] < newInterval[0]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // binary search may not be needed 
        int i = 0;

        //just add every interval where end time is less than start time for new interval
        while (i < n && intervals[i][1] < newInterval[0]) {
            merged.add(intervals[i]);
            i++;
        }

       //next is to merge and add only the merged interval
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        merged.add(newInterval); 
       
       //add elements that come post merge 
        while (i < n) {
            merged.add(intervals[i]);
            i++;
        }
       

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        leet m = new leet();
        int[][] res = m.road();
        for (int[] arr : res) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
