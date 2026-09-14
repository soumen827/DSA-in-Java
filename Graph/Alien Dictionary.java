class Solution{
    public ArrayList<Integer> topoSort(int V,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans=new ArrayList<>();
        int[] indegree=new int[V];
        
        for(int i=0;i<V;i++){
            for(int ele:adj.get(i)){
                indegree[ele]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node=q.remove();
            ans.add(node);

            for(int ele:adj.get(node)){
                indegree[ele]--;

                if(indegree[ele]==0){
                    q.add(ele);
                }
            }
        }
        return ans;
    }

    public String findOrder(String[] words){
        int N=words.length;
        boolean[] present=new boolean[26];
        int K=0;
        for(String word:words){
            for(char ch:word.toCharArray()){
                present[ch-'a']=true;
                K=Math.max(K,ch-'a'+1);
            }
        }
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<K;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<N-1;i++){
            String s1=words[i];
            String s2=words[i+1];

            int len=Math.min(s1.length(),s2.length());
            boolean found=false;

            for(int j=0;j<len;j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                    int u=s1.charAt(j)-'a';
                    int v=s2.charAt(j)-'a';
                    if(!adj.get(u).contains(v)) adj.get(u).add(v);
                    found=true;
                    break;
                }
            }

            if(!found&&s1.length()>s2.length()) return "";
        }
        ArrayList<Integer> topo=topoSort(K,adj);
        for(int i=0;i<K;i++){
            if(present[i]&&!topo.contains(i))  return "";
            
        }
        String ans="";

        for(int ele:topo){
            if(present[ele])  ans=ans+(char)(ele+'a');
            
        }
        return ans;
    }
}
