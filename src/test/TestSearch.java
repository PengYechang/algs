package test;

import four.DepthFirstSearch;
import four.Graph;
import four.Search;
import util.In;

public class TestSearch {
    public static void main(String[] args) {
        Graph G = new Graph(new In(args[0]));
        int s = Integer.parseInt(args[1]);
        Search search = new DepthFirstSearch(G,s);
        for(int v=0;v<G.V();v++){
            if (search.marked(v)) System.out.print(v+" ");
        }
        System.out.println();
        if(search.count()!=G.V())
            System.out.printf("NOT ");
        System.out.println("connected");
    }
}
