package test;

import four.SymbolDigraph;
import four.Topological;

public class TopologicalTest {
    public static void main(String[] args) {
        SymbolDigraph sg = new SymbolDigraph(args[0],args[1]);
        Topological topological = new Topological(sg.G());
        for(int v:topological.order()){
            System.out.println(sg.name(v));
        }
    }
}
