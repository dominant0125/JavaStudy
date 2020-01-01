package Collections.HashMap;

import java.math.BigInteger;
import java.util.HashMap;

public class HashMapFibo {

    public HashMap<Integer, BigInteger> map = new HashMap<>();
    int limit;

    public HashMapFibo(int num){
        map.put(0, BigInteger.ZERO);
        map.put(1, BigInteger.ONE);
        map.put(2, BigInteger.ONE);

        limit = num;
    }
    private BigInteger fibo(int n){
        if (map.containsKey(n)){
            System.out.println(map.get(n));
            return map.get(n);
        }else{
            BigInteger result = fibo(n-2).add(fibo(n-1));
            map.put(n, result);
            System.out.println(result);
            return result;
        }
    }


    public void run(){
        fibo(limit);
    }
}
