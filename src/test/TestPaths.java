package test;

import four.BreadthFirstPaths;
import four.DepthFirstPaths;
import four.Graph;
import four.Paths;
import util.In;
import java.util.Stack;

public class TestPaths {
    public static void main(String[] args) {
        Graph G = new Graph(new In(args[0]));
        int s = Integer.parseInt(args[1]);
        Paths paths = new BreadthFirstPaths(G,s);
        for(int i=0;i<G.V();i++){
            System.out.print(s+" to "+i+": ");
            if(paths.hasPathTo(i)){
                Stack<Integer> stack = (Stack<Integer>)paths.pathTo(i);
                while (!stack.isEmpty()){
                    int val = stack.pop();
                    if(val==s) System.out.print(val);
                    else System.out.print("-"+val);
                }
            }
            System.out.println();
        }
    }
}
