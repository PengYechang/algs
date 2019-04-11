package four;

import java.util.Stack;

public class DepthFirstPaths extends Paths {
    private boolean[] marked;
    private int[] edgeTo;

    public DepthFirstPaths(Graph G,int s) {
        super(G,s);
        marked = super.marked;
        edgeTo = super.edgeTo;
        dfs(G,s);
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w]){
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    @Override
    public boolean hasPathTo(int v) {
        return marked[v];
    }

}
