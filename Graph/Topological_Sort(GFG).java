class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // Create adjacency list
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        // Build graph
        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
        }
        boolean[] vis = new boolean[V];
        // DFS
        for(int i = 0; i < V; i++) {
            if(!vis[i])  dfs(i, adj, vis, ans);
            
        }
        Collections.reverse(ans);
        return ans;
    }

    public void dfs(int i,ArrayList<ArrayList<Integer>> adj,boolean[] vis,ArrayList<Integer> ans) {
        vis[i] = true;
        for(int ele : adj.get(i)) {
            if(!vis[ele]) dfs(ele, adj, vis, ans);

        }

        ans.add(i);
    }
}
