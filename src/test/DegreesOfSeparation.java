package test;

import four.BreadthFirstPaths;
import four.Graph;
import four.SymbolGraph;
import java.util.Scanner;
import java.util.Stack;

public class DegreesOfSeparation {
    public static void main(String[] args) {
        SymbolGraph sg = new SymbolGraph(args[0],args[1]);
        String start = args[2];
        if(!sg.contains(start)){
            System.out.println("not found");
            return;
        }
        Graph G = sg.G();
        BreadthFirstPaths bfp = new BreadthFirstPaths(G,sg.index(start));
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String end = sc.nextLine();
            if(sg.contains(end)) {
                Integer val = sg.index(end);
                if(bfp.hasPathTo(val)){
                    Stack<Integer> stack = (Stack<Integer>)bfp.pathTo(val);
                    while (!stack.isEmpty()){
                        System.out.println("  "+sg.name(stack.pop()));
                    }
                }else{
                    System.out.println("not connect!");
                }
            }else {
                System.out.println("not fount 2");
            }
        }
    }
}
