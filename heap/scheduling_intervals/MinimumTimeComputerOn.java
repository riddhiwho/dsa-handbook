package scheduling_intervals;

import java.util.Arrays;

public class MinimumTimeComputerOn {

    public static int findMinTime(int[][] tasks){
        
        boolean[] used = new boolean[2001];
        int totalOn = 0;

        Arrays.sort(tasks, (a, b) -> Integer.compare(a[1], b[1]));

        for(int[] task : tasks){
            int start = task[0];
            int end = task[1];
            int duration = task[2];

            int alreadyOn=0;

            for(int i=start; i<=end; i++){
                if(used[i]){
                    alreadyOn++;
                }
            }

            int remaining = duration - alreadyOn;

            for (int t = end; t >= start && remaining > 0; t--) {
                if (!used[t]) {
                    used[t] = true;
                    totalOn++;
                    remaining--;
                }
            }
        }
        return totalOn;
    }

    public static void main(String[] args) {
        int[][] tasks = {{2, 3, 1}, {4, 5, 1}, {1, 5, 2}};
        System.out.println(findMinTime(tasks));
    }
}
