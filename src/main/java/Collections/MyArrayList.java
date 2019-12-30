package Collections;

import java.util.ArrayList;

public class MyArrayList {

    public void run() {
        ArrayList<String> list = new ArrayList();
        System.out.println(list.size());

        add_element(list, "First");
        add_element(list, "Second");
        add_element(list, "Third");

        listPrint(list);
        // ArrayList 길이를 벗어나는 범위를 참조하면 IndexOutOfBoundsException 발생
        System.out.println(String.format("3 :: \"%s\"", list.get(3)));
    }

    private void add_element(ArrayList<String> list, String element){
        // ArrayList.add() 메서드로 요소를 append 시킨다.
        list.add(element);
        System.out.println(String.format("Add element \"%s\" to list", element));
    }

    private void listPrint(ArrayList list){
        for(int i=0 ; i < list.size() ; i++){
            // ArrayList.get() 메서드로 요소를 참조한다.
            System.out.println(String.format("%d :: \"%s\"", i, list.get(i)));
        }
    }
}
