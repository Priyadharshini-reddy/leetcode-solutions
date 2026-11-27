class Solution {
    int [] parent;
    public int[] findRedundantConnection(int[][] edges) {
         int n=edges.length;
         parent= new int[n+1];
         for(int i=1;i<=n;i++){
            parent[i]=i;
         }
         for(int [] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int rootU = find(u);
            int rootV = find(v);
             if (rootU == rootV) {
                return edge;
            }
            parent[rootV] = rootU;

         }
         return new int[0];
        
    }
    int find(int x){
        if(parent[x]==x){
            return x;
        }
       parent[x]=find(parent[x]);
       return parent[x];

    }
}
/**
union and find 'so' in 
union go make its parent 
and other one its parent and its parent till u get representative 

1-2
2-3 
3-4 
1-4 1-5 

 1 2 3 4 5
  
 1 1 1



 */