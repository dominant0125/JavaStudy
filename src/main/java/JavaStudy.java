// import Collections.ArrayList.ArrayListBasic;
// import Collections.ArrayList.ArrayToArrayList;
//import Collections.ArrayList.ArrayListToArray;;

//import Collections.HashMap.HashMapBasic;
import Collections.HashMap.HashMapFibo;

public class JavaStudy {
    public static void main(String[] args) {
        // ArrayListBasic arrayListBasic = new ArrayListBasic();
        // arrayListBasic.run();
        // ArrayToArrayList arrayToArrayList = new ArrayToArrayList();
        // arrayToArrayList.run();
        // ArrayListToArray arrayListToArray = new ArrayListToArray();
        // arrayListToArray.run();

//        HashMapBasic hashMapBasic = new HashMapBasic();
//        hashMapBasic.run();
        HashMapFibo fibo = new HashMapFibo(10);
        fibo.run();
    }
}
