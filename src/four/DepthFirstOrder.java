package four;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DepthFirstOrder {
    private boolean[] marked;
    private List<Integer> pre;
    private List<Integer> post;
    private List<Integer> reversePost;

    public DepthFirstOrder(Digraph G){
        marked = new boolean[G.V()];
        pre = new ArrayList<>();
        post = new ArrayList<>();
        reversePost = new LinkedList<>();
        for(int i=0;i<G.V();i++){
            if(!marked[i]) dfs(G,i);
        }
    }

    private void dfs(Digraph G,int v){
        pre.add(v);
        marked[v] = true;
        for(int w:G.adj(v)){
            if(!marked[w]) dfs(G,w);
        }
        post.add(v);
        reversePost.add(0,v);
    }

    public Iterable<Integer> pre(){
        return pre;
    }

    public Iterable<Integer> post(){
        return post;
    }

    public Iterable<Integer> reversePost(){
        return reversePost;
    }
}
