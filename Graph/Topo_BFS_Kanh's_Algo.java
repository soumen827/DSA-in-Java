class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<Integer> ans = new ArrayList<>();
        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        // Build graph
        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
        }
        // Kahn's Algorithm
        int[] indegree = new int[V];

        // Calculate indegree
        for(int i = 0; i < V; i++) {
            for(int ele : adj.get(i)) indegree[ele]++;
        }
        Queue<Integer> q = new LinkedList<>();
        // Add all indegree 0 nodes
        for(int i = 0; i < V; i++) {
            if(indegree[i] == 0) q.add(i);
        }
        // BFS
        while(!q.isEmpty()) {
            int node = q.remove();
            ans.add(node);
            for(int ele : adj.get(node)) {
                indegree[ele]--;
                if(indegree[ele] == 0) q.add(ele);
            }
        }
        return ans;
    }
}
