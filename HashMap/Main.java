package HashMap;

import HashMap.DesignHashMap.MyHashMap;

public class Main {
    public static void main(String[] args) {
//        MapUsingHash mapUsingHash = new MapUsingHash();
//        mapUsingHash.put("ritik","software engineer");
//        mapUsingHash.put("riya","doctor");
//        System.out.println(mapUsingHash.get("ritik"));

        MyHashMap myHashMap = new MyHashMap<>();
        myHashMap.put(1,"A");
        myHashMap.put(2,"B");
        myHashMap.put(3,"C");
        myHashMap.put(4,"D");
        myHashMap.put(5,"E");
        myHashMap.put(6,"F");
        myHashMap.put(7,"G");
        myHashMap.put(8,"H");
        myHashMap.put(9,"I");
        myHashMap.put(10,"J");
        System.out.println(myHashMap);

    }
}
