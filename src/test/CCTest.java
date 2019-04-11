package test;

import four.CC;
import four.Graph;
import util.In;

import java.util.ArrayList;
import java.util.List;

public class CCTest {
    public static void main(String[] args) {
        Graph G = new Graph(new In(args[0]));
        CC cc = new CC(G);
        List<Integer>[] lists = new List[cc.count()];
        for(int i=0;i<cc.count();i++){
            lists[i] = new ArrayList<>();
        }
        for(int i=0;i<G.V();i++){
            lists[cc.id(i)].add(i);
        }
        for(int i=0;i<cc.count();i++){
            for(int j:lists[i]){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
