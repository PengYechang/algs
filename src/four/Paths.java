package four;

import java.util.Stack;

public abstract class Paths {
    boolean[] marked;
    int[] edgeTo;
    final int s;

    Paths(Graph G,int s){
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
    }

    abstract public boolean hasPathTo(int v);
    public Iterable<Integer> pathTo(int v){
        Stack<Integer> stack = new Stack<>();
        while (v!=s){
            stack.push(v);
            v = edgeTo[v];
        }
        stack.push(v);
        return stack;
    }
}
