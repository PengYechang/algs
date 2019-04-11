package four;

import util.In;

import java.util.HashMap;
import java.util.Map;

public class SymbolDigraph {
    private Map<String,Integer> map; //符号名-》索引
    private String[] keys; //索引-》符号名
    private Digraph G;

    /**
     * @param stream 文件地址
     * @param sp 分隔符
     */
    public SymbolDigraph(String stream,String sp){
        map = new HashMap<>();
        In in = new In(stream);
        while (in.hasNextLine()){
            String[] a = in.readLine().split(sp);
            for(String s:a){
                if(!map.containsKey(s)){
                    map.put(s,map.size());
                }
            }
        }
        keys = new String[map.size()];
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            keys[entry.getValue()] = entry.getKey();
        }
        G = new Digraph(keys.length);
        in = new In(stream);
        while (in.hasNextLine()){
            String[] a = in.readLine().split(sp);
            int v = map.get(a[0]);
            for(int i=1;i<a.length;i++){
                G.addEdge(v,map.get(a[i]));
            }
        }
    }

    /**
     * 顶点是否包含key
     * @param key
     * @return
     */
    public boolean contains(String key){
        return map.containsKey(key);
    }

    /**
     * key的索引
     * @param key
     * @return
     */
    public int index(String key){
        return map.get(key);
    }

    /**
     * 索引v的key值
     * @param v
     * @return
     */
    public String name(int v){
        return keys[v];
    }

    public Digraph G(){
        return G;
    }
}
