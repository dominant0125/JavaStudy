package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;

public class ArrayToArrayList {
    
    public void run(){
        
        String[] arr = new String[] {"one", "two", "three", "four"};
        TypeProvider tp = new TypeProvider();
        /* Array -> ArrayList 변환 */
        
        // String 등 기타 class의 instance를 저장한 배열의 경우 아래와 같이 변환.
        // 1-1. Arrays.asList(Array array) 사용
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        System.out.println("Used Arrays.asList()\n" + list);

        // 1-2. Collections.addAll() 사용
        List<String> list2 = new ArrayList<String>();
        Collections.addAll(list2, arr);
        System.out.println("\nUsed Collections.addAll()\n"+list2);

        // 1-3. List.addAll() 사용
        List<String> list3 = new ArrayList<String>();
        list3.addAll(Arrays.asList(arr));
        System.out.println("\nUsed List.addAll()\n"+list3);


        // class의 instance가 아닌 primitive 타입의 데이터들은 위의 방식을 쓸 수 없고 각각 추가해주어야함.
        List<Integer> list4 = new ArrayList<Integer>();
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        for (int each : nums) list4.add(each);
        System.out.println("\nCase of Primitive type array\n"+list4);


        // ListIterator<String> iter = list.listIterator();
        // while (iter.hasNext()){
        //     System.out.println(iter.next());
        // }
        // while (iter.hasPrevious()){
        //     System.out.println(iter.previous());
        // }
    }

}

class TypeProvider{
    public String typeProvider(String s){
        return "String";
    }
    public String typeProvider(int i){
        return "int";
    }
    public String typeProvider(float f){
        return "float";
    }
    public String typeProvider(byte b){
        return "byte";
    }
    public String typeProvider(char c){
        return "char";
    }
    public String typeProvider(double d){
        return "double";
    }
}