package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray{

    public void run(){
        List<String> list = new ArrayList<String>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        String[] arr = new String[list.size()];
        list.toArray(arr);
        
        for (String each : arr) System.out.println(each);
    }

}