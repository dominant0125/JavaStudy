package Collections.HashMap;


import java.util.*;

public class HashMapBasic {
    /*
    고정시간을 제공하는 key - value 쌍 데이터 구조.
     */
    public void run (){
        // java 11 이상의 경우
        /*
        var myHashMap = new HashMap<T1, T2>();
         */

        HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();

        myHashMap.put(1, "One");
        myHashMap.put(2, "Two");
        myHashMap.put(3, "Three");
        myHashMap.put(4, "Four");
        myHashMap.put(5, "Five");

        getKeysAndValues(myHashMap);
        getKeys(myHashMap);
        getValues(myHashMap);
    }

    public void getKeysAndValues(HashMap<Integer, String> h){
        // 1.
        // h.keySet().forEach(each -> System.out.println(String.format("key : %d , value : \"%S\"", each, h.get(each))));
        // 2.
        h.forEach((k, v) -> System.out.println(String.format("key : %d , value : \"%S\"", k, v)));
    }

    public void getKeys(HashMap<Integer, String> h){
        // HashMap.keySet() returns keys in 'Set' type
        h.keySet().forEach(e -> System.out.print(e  + ", "));
        System.out.println();
    }

    public void getValues(HashMap<Integer, String> h){
        // HashMap.values() returns Values in 'Collection' type
        h.values().forEach(each -> System.out.print(each + ", "));
        System.out.println();
    }
}
