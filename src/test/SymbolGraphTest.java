package test;

import four.Graph;
import four.SymbolGraph;

import java.util.Scanner;

public class SymbolGraphTest {
    public static void main(String[] args) {
        SymbolGraph symbolGraph = new SymbolGraph(args[0],args[1]);
        Graph G = symbolGraph.G();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String key = sc.nextLine();
            if(symbolGraph.contains(key)){
                for(int w:G.adj(symbolGraph.index(key))){
                    System.out.println("  "+symbolGraph.name(w));
                }
            }else{
                System.out.println("not found!");
            }

        }
    }
}
