package test;

import four.Digraph;
import four.DirectedDFS;
import util.In;

import java.util.ArrayList;
import java.util.List;

public class DirectedDFSTest {
    public static void main(String[] args) {
        Digraph digraph = new Digraph(new In(args[0]));

        List<Integer> sources = new ArrayList<>();
        for(int i=1;i<args.length;i++){
            sources.add(Integer.parseInt(args[i]));
        }

        DirectedDFS directedDFS = new DirectedDFS(digraph,sources);

        for(int v=0;v<digraph.V();v++){
            if(directedDFS.marked(v))
                System.out.print(v+" ");
        }
        System.out.println();
    }
}
