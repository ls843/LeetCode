class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

        int current = 0;
        int energy = 0;

        for(int i = 0; i < tasks.length; i++) {
            int actual = tasks[i][0];
            int minimum = tasks[i][1];

            if(current < minimum) {
                energy += (minimum - current);
                current = minimum;
            }

            current -= actual;
        }

        return energy;
    }
}