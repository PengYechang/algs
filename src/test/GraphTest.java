package test;

import four.Graph;
import util.In;

public class GraphTest {
    public static void main(String[] args) {
        In in = new In(args[0]);
        Graph G = new Graph(in);
        System.out.println(G);
    }
}
