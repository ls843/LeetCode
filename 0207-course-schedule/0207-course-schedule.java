class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < prerequisites.length; i++) {
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            
            adj.get(b).add(a);
            indegree[a]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        int count = 0; 

        while(!q.isEmpty()) {
            int node = q.poll();
            count++;

            for(int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if(indegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }

        return count == numCourses;
    }
}