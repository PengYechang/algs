package four;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstPaths extends Paths {
    private boolean[] marked;
    private int[] edgeTo;

    public BreadthFirstPaths(Graph G,int s){
        super(G,s);
        marked = super.marked;
        edgeTo = super.edgeTo;
        bfs(G,s);
    }

    private void bfs(Graph G,int s){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        marked[s] = true;
        while (!queue.isEmpty()){
            int v = queue.remove();
            for(int w:G.adj(v)){
                if(!marked[w]){
                    marked[w] = true;
                    edgeTo[w] = v;
                    queue.add(w);
                }
            }
        }
    }

    @Override
    public boolean hasPathTo(int v) {
        return marked[v];
    }

}
