// import Collections.ArrayList.ArrayListBasic;
// import Collections.ArrayList.ArrayToArrayList;
//import Collections.ArrayList.ArrayListToArray;;

//import Collections.HashMap.HashMapBasic;
//import Collections.HashMap.HashMapFibo;
import Collections.HashMap.Marathon;

public class JavaStudy {
    public static void main(String[] args) {
        // ArrayListBasic arrayListBasic = new ArrayListBasic();
        // arrayListBasic.run();
        // ArrayToArrayList arrayToArrayList = new ArrayToArrayList();
        // arrayToArrayList.run();
        // ArrayListToArray arrayListToArray = new ArrayListToArray();
        // arrayListToArray.run();

        // HashMapBasic hashMapBasic = new HashMapBasic();
        // hashMapBasic.run();
//        HashMapFibo fibo = new HashMapFibo(10);
//        fibo.run();
        Marathon marathon = new Marathon(
                new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"});
        marathon.run();

    }
}
