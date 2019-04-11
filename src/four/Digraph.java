package four;

import util.In;

import java.util.ArrayList;
import java.util.List;

public class Digraph {
    private final int V;
    private int E;
    private List<Integer>[] adj;

    public Digraph(int v) {
        this.V = v;
        this.E = 0;
        adj = (List<Integer>[]) new List[v];
        for(int i=0;i<v;i++){
            adj[i] = new ArrayList<>();
        }
    }

    public Digraph(In in){
        this(in.readInt()); //调用构造函数初始化
        int E = in.readInt();
        for(int i=0;i<E;i++){
            int v = in.readInt();
            int w = in.readInt();
            addEdge(v,w);
        }
    }

    public void addEdge(int v,int w){
        adj[v].add(w);
        E++;
    }

    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }

    public Digraph reverse(){
        Digraph digraph = new Digraph(V);
        for(int v=0;v<V;v++){
            for(int w:adj[v]){
                digraph.addEdge(w,v);
            }
        }
        return digraph;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(V + " vertices, " + E + " edges\n");
        for(int v=0;v<V;v++){
            s.append(v + ": ");
            for(int w:adj(v))
                s.append(w + " ");
            s.append("\n");
        }
        return s.toString();
    }
}
