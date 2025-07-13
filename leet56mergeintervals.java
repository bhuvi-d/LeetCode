//interval array 
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        //given as an unsorted one hence sorting based on start time 
        //using array sort function (if value negative -> correct)
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        //initializing an array for merging 
        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];
        for (int k=1;k<intervals.length;k++) {
        	int [] curr = intervals[k];
        	if (curr[0]<=prev[1]) {
        		prev[1]=Math.max(curr[1], prev[1]);
        	}
        	else {
        	merged.add(prev);
        	prev=curr;
        	}
        	
        }
        merged.add(prev);
        
        
        return merged.toArray(new int[merged.size()][]);         
        
