import java.util.*;
class DisjointSet{
    List<Integer> parent = new ArrayList<>();
    List<Integer> rank = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    
    public DisjointSet(int n){
        for(int i = 0; i <= n; i++){
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }
    public int findParent(int node){
        if(node == parent.get(node))return node;
        int gp = findParent(parent.get(node));
        parent.set(node, gp);
        return parent.get(node);
    }
    public void unionByRank(int u, int v){
        int uP = findParent(u);
        int vP = findParent(v);
        if(uP == vP)return;
        else if(rank.get(uP)<rank.get(vP)){
            parent.set(vP, uP);
        }
        else if(rank.get(uP)>rank.get(vP)){
            parent.set(uP, vP);
        }
        else{
            parent.set(vP, uP);
            int rankU = rank.get(uP);
            rank.set(uP, rankU+1);
        }
    }
    public void unionBySize(int u, int v){
        int uP = findParent(u);
        int vP = findParent(v);
        if(uP == vP)return;
        else if(size.get(uP)<size.get(vP)){
            parent.set(uP, vP);
            size.set(vP, size.get(vP)+size.get(uP));
        }
        else{
            parent.set(vP, uP);
            size.set(uP, size.get(vP)+size.get(uP));
        }
    }
    public static void main (String[] args) {
        DisjointSet ds = new DisjointSet(7);
        ds.unionByRank(1, 2); 
        ds.unionByRank(2, 3); 
        ds.unionByRank(4, 5); 
        ds.unionByRank(6, 7); 
        ds.unionByRank(5, 6); 
        
        // if 3 and 7 same or not 
        if(ds.findParent(3) == ds.findParent(7)) {
            System.out.println("Same"); 
        }
        else 
            System.out.println("Not Same"); 
            
        ds.unionByRank(3, 7); 
        if(ds.findParent(3) == ds.findParent(7)) {
            System.out.println("Same"); 
        }
        else 
            System.out.println("Not Same"); 
    }
}
